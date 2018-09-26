/*package com.capgemini.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.capgemini.dto.Admin;


@Controller
public class JspControllerAdmin {


	@RequestMapping("/a")
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
		 map.addAttribute("adminDetails", message);
		 return "adminHomePage";
	}
	
	@ModelAttribute("admin")
	Admin getCar() {
		Admin ac = new Admin();	
		return ac;
	}
	
	
}
*/