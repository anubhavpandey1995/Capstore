package com.capgemini.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import com.capgemini.dto.Admin;
import com.capgemini.dto.CustomerDummy;
import com.capgemini.dto.Customers;
import com.capgemini.dto.MerchantDummy;
import com.capgemini.dto.Merchants;
import com.capgemini.dto.ProductListDummy;
import com.capgemini.dto.Products;


@Controller
public class JspController {

	@RequestMapping("/")
	public String showWelcomePage(ModelMap map){
		
		return "welcome";
	}

	@RequestMapping("/adminlogin")
	public String showAdminLoginPage(ModelMap map,@ModelAttribute("admin") Admin admin){
		
		map.addAttribute("admin", admin);
		return "adminlogin";
	}
	
	@RequestMapping("/adminlogincheck")
	public String  adminLoginCheck(ModelMap map,@Valid @ModelAttribute("admin") Admin admin,  BindingResult error){
		
		if(error.hasErrors())
		{
			System.out.println(error.toString());
			map.addAttribute("admin", admin);
			return "adminlogin";
		}
		
		RestTemplate restTemplate = new RestTemplate();
		
		Admin message = restTemplate.postForObject("http://localhost:9090/loginAdmin",admin, Admin.class);
		if(message==null){
			return "errorPage";
		} 
		else{
		map.addAttribute("adminDetails", message);
		 return "adminHomePage";
		}
		}
	

	
	@RequestMapping("/MerchantsignUpPage")
	public String showMerchantSignUpPage(ModelMap map, @ModelAttribute("merchant") Merchants mer){
		
		map.addAttribute("merchant", mer);
		return "merchantSingUpPage";
	}
	
	@RequestMapping("/merchantsignUp")
	public String signUpMerchant(ModelMap map,@Valid @ModelAttribute("merchant") Merchants mer, BindingResult error){
	
		if(error.hasErrors())
		{
			System.out.println(error.toString());
			map.addAttribute("merchant", mer);
			return "merchantSingUpPage";
		}
        RestTemplate restTemplate = new RestTemplate();
		
		 Merchants message = restTemplate.postForObject("http://localhost:9090/addmerchant",mer, Merchants.class);
		 map.addAttribute("merDetails", message);
		 return "MerchantApproval";
		 
	}
	@RequestMapping("/viewCustomers")
	public String viewCustomers(ModelMap map){
		
		System.out.println("Inside products List");
		RestTemplate restTemplate = new RestTemplate();
		CustomerDummy response = restTemplate.getForObject("http://localhost:9090/getAllCustomer", CustomerDummy.class);
		List<Customers> customers = response.getCustomers();
		/*System.out.println(products);*/
		map.addAttribute("customerList", customers);
		return "customerdummypage";
	}
	
	@RequestMapping("/merchantlogin")
	public String showMerchantLoginPage(ModelMap map){
		
		return "merchantLogin";
	}

	
	@RequestMapping("/merchantlogincheck")
	public String  merchantLoginCheck(ModelMap map,@Valid @ModelAttribute("merchant") Merchants merchant, BindingResult error){
		
		/*if(error.hasErrors())
		{
			System.out.println(error.toString());
			map.addAttribute("merchant", merchant);
			return "merchantLogin";
		}*/
				
		RestTemplate restTemplate = new RestTemplate();
		//System.out.println("**insiode jsp controller");
		Merchants obj = restTemplate.postForObject("http://localhost:9090/loginMerchant",merchant, Merchants.class);

		if(obj==null){
			
		return "MerchantApproval";
		}
	//	System.out.println("after Central***** check JspHandler***");
		else{
		 map.addAttribute("merDetails", obj);
		 return "merchantHomePage";
		
   }
	
	}
	@RequestMapping("/ManageMerchants")
	public String  manageMerchants(ModelMap map, @ModelAttribute("merchant") Merchants merchant){
 	 	 
		RestTemplate restTemplate = new RestTemplate();
		
		 MerchantDummy message = restTemplate.getForObject("http://localhost:9090/displayAllMerchant", MerchantDummy.class);
		List<Merchants> list= message.getMerchants();
		
		 map.addAttribute("merchantList", list);
		 return "MerchantList";
		
   }
	
	@RequestMapping("/addMerchantpagefromAdmin")
	public String  addMerchantsfromAdmin(ModelMap map,@Valid @ModelAttribute("merchant") Merchants merchant,BindingResult error){
 	 	 
		
			System.out.println(error.toString());
			map.addAttribute("merchant", merchant);
			return "adminMerchant";
		
       /* RestTemplate restTemplate = new RestTemplate();
		
		 Merchants message = restTemplate.postForObject("http://localhost:9090/addmerchant",merchant, Merchants.class);
		 map.addAttribute("merchant", message);
		 return "MerchantList";*/
		
   }
	@RequestMapping("/addmerchant")
	public String addMerchant(ModelMap map, @ModelAttribute("merchant") Merchants merchant){
System.out.println(merchant.getMerchantFlag());
		if(merchant.getMerchantId()==-1){
			RestTemplate restTemplate = new RestTemplate();
			/*System.out.println("**inside add Merchant");*/
			System.out.println(merchant);
			Merchants obj = restTemplate.postForObject("http://localhost:9090/addmerchant", merchant, Merchants.class);
			
			 
		}
		else
		{
			RestTemplate rest = new RestTemplate();
			Merchants obj = rest.postForObject("http://localhost:9090/updateMerchant",merchant, Merchants.class);
			System.out.println(obj.getMerchantFlag());
		}
			//map.addAttribute("product", obj);
            
			RestTemplate restTemplate1 = new RestTemplate();
			MerchantDummy response = restTemplate1.getForObject("http://localhost:9090/displayAllMerchant", MerchantDummy.class);
			List<Merchants> merchants = response.getMerchants();
			System.out.println(merchants);
			map.addAttribute("merchantList", merchants);
			return "MerchantList";
	}
	
	
	
	
	
	@RequestMapping("/viewProductList")
	public String showProductsList(ModelMap map,@ModelAttribute("product") Products product)
	{
		System.out.println("Inside products List");
		RestTemplate restTemplate = new RestTemplate();
		ProductListDummy response = restTemplate.getForObject("http://localhost:9090/displayAllProduct", ProductListDummy.class);
		List<Products> products = response.getProducts();
		System.out.println(products);
		map.addAttribute("productsList", products);
		return "ProductList";
	}
	
	@RequestMapping("/addProductpage")
	public String addProductpage(ModelMap map, @ModelAttribute("product") Products product){
         
		System.out.println("Inside addProductpage");
		 map.addAttribute("product", product);
		 return "productForm";
	}
	

	
	@RequestMapping("/addProduct")
	public String addProducttoList(ModelMap map, @ModelAttribute("product") Products product){

		if(product.getProductId()==-1){
			
			RestTemplate restTemplate = new RestTemplate();
			System.out.println("**insiode add Product");
			
			Products obj = restTemplate.postForObject("http://localhost:9090/addproduct", product, Products.class);
			 
		}
		else
		{
			RestTemplate rest = new RestTemplate();
			Products obj = rest.postForObject("http://localhost:9090/updateproduct", product, Products.class);
		}
			//map.addAttribute("product", obj);
            
			RestTemplate restTemplate1 = new RestTemplate();
			ProductListDummy response = restTemplate1.getForObject("http://localhost:9090/displayAllProduct", ProductListDummy.class);
			List<Products> products = response.getProducts();
			/*System.out.println(products);*/
			map.addAttribute("productsList", products);
			return "ProductList";
	}
	
	@RequestMapping("/deleteProduct")
	public String deleteProduct(@RequestParam("productId") String[] ids, ModelMap map , @ModelAttribute("product") Products product){
   
		RestTemplate restTemplate = new RestTemplate();
		 
		System.out.println(product);
		
		restTemplate.postForObject("http://localhost:9090/deleteproduct",ids, Arrays.class);

		RestTemplate restTemplate1 = new RestTemplate();
		ProductListDummy response = restTemplate1.getForObject("http://localhost:9090/displayAllProduct", ProductListDummy.class);
		List<Products> products = response.getProducts();
		System.out.println(products);
		map.addAttribute("productsList", products);
		return "ProductList";
	}
	
	@RequestMapping("/editMerchant")
	public String editMerchant(@RequestParam("merchantId") Integer id, ModelMap map){
   
		System.out.println("ye has id:"+id);
		/*RestTemplate restTemplate = new RestTemplate();
		 
		System.out.println(product);
		
		restTemplate.postForObject("http://localhost:9090/updateproduct",id, String.class);*/

		RestTemplate restTemplate1 = new RestTemplate();
		Merchants obj = restTemplate1.getForObject("http://localhost:9090/findmerchant?id="+id, Merchants.class);

		map.addAttribute("merchant", obj);
		
		return "merchantForm";
	}
	

	@RequestMapping("/editProduct")
	public String editProduct(@RequestParam("productId") Integer id, ModelMap map){
   
		System.out.println("ye has id:"+id);
		/*RestTemplate restTemplate = new RestTemplate();
		 
		System.out.println(product);
		
		restTemplate.postForObject("http://localhost:9090/updateproduct",id, String.class);*/

		RestTemplate restTemplate1 = new RestTemplate();
		Products obj = restTemplate1.getForObject("http://localhost:9090/findproduct?id="+id, Products.class);

		map.addAttribute("product", obj);
		
		return "productForm";
	}
	
/*
	@RequestMapping("/deleteMerchant")
	public String deleteProduct(ModelMap map, @ModelAttribute("merchant") Merchants merchant){
   
		RestTemplate restTemplate = new RestTemplate();
		 
		Merchants obj = restTemplate.postForObject("http://localhost:9090/deleteproduct", merchant, Merchants.class);
		
		 map.addAttribute("merchant", obj);
   
		 return "MerchantList";
	}*/
	
	@RequestMapping("/viewMerchants")
	public String merchantOperations(ModelMap map){
   
		return "merchantOperations";	
	}
	
	
	@RequestMapping("/deleteMerchant")
	public String deleteMerchant(@RequestParam("merchantId") String[] ids, ModelMap map , @ModelAttribute("merchant") Merchants merchant){
   
		RestTemplate restTemplate = new RestTemplate();
		 
		/*System.out.println(product);*/
		
		restTemplate.postForObject("http://localhost:9090/deletemerchant",ids, Arrays.class);

		RestTemplate restTemplate1 = new RestTemplate();
		MerchantDummy response = restTemplate1.getForObject("http://localhost:9090/displayAllMerchant", MerchantDummy.class);
		List<Merchants> merchants = response.getMerchants();
		System.out.println(merchants);
		map.addAttribute("merchantList", merchants);
		return "MerchantList";
	}
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////

	/*@RequestMapping("/CustomersignUpPage")
	public String showCustomerSignUpPage(ModelMap map, @ModelAttribute("customer") Customers cus){
		
		
		map.addAttribute("customer", cus);
		return "signUpPage";
	}
	
	@RequestMapping("/signUp")
	public String signUpCostumer(ModelMap map,@Valid @ModelAttribute("customer") Customers cus, BindingResult error){
		
		System.out.println("**inside signup in jsp controller");
		if(error.hasErrors())
		{
			System.out.println(error.toString());
			map.addAttribute("customer", cus);
			return "signUpPage";
		}
        RestTemplate restTemplate = new RestTemplate();
		System.out.println("1");
		Customers message = restTemplate.postForObject("http://localhost:9090/signUpCustomer",cus, Customers.class);
		System.out.println("2"); 
		map.addAttribute("custDetails", message);
		System.out.println("3");
		 return "customerHomePage";
		 
	}
	
	@RequestMapping("/customerlogin")
	public String showConsumerLoginPage(ModelMap map){
		
		return "customerLogin";
	}

	
	@RequestMapping("/customerlogincheck")
	public String  customerLoginCheck(ModelMap map,@ModelAttribute("customer") Customers customer){
		
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("**insiode jsp controller");
		Customers obj = restTemplate.postForObject("http://localhost:9090/loginCustomer",customer, Customers.class);
		System.out.println("after Central***** check JspHandler***"+obj.getCustomerName());
		 map.addAttribute("custDetails", obj);
		 return "customerHomePage";
	}
	
	
	@RequestMapping("/homePage")
	public String showHomePage(ModelMap map, @ModelAttribute("customer") Customers cus){
		System.out.println("insode himepage");
		map.addAttribute("customer", cus);
		return "customerHomePage";
	}
	

	@RequestMapping("/viewCustomers")
	public String customerOperations(ModelMap map){
   
		return "customerOperations";	
	}
	
	@RequestMapping("/viewPro")
	public String productOperations(ModelMap map){
   
		return "customerOperations";	
	}*/
	
	
	
	@ModelAttribute("admin")
	Admin getCar() {
		Admin ac = new Admin();	
		return ac;
	}
	
	@ModelAttribute("merchant")
	Merchants getMerchant() {
		
		Merchants m = new Merchants();
		return m;
	}
	
	@ModelAttribute("product")
	Products getProduct() {
		Products p = new Products();	
		return p;
	}
	
	@ModelAttribute("customer")
	Customers getCustomer() {
		Customers ac = new Customers();	
		return ac;
	}
	
	
	
	
}