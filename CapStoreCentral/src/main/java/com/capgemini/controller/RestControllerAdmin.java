package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.capgemini.dao.DAOLayerAdmin;
import com.capgemini.dao.DAOLayerImplAdmin;
import com.capgemini.dto.Admin;
import com.capgemini.dto.Customers;
import com.capgemini.service.ServiceLayer;
import com.capgemini.service.ServiceLayerAdmin;



@RestController
public class RestControllerAdmin {
	
	@Autowired
	ServiceLayerAdmin ser;
	
	/*@RequestMapping(value="/c")
	public String check()
	{
		return ser.check();
	}*/
	
	@RequestMapping(value="/loginAdmin",method=RequestMethod.POST)
	public Admin consume(@RequestBody Admin admin){
		
		admin=ser.validateAdmin(admin);
		

		return admin;
	}
	
	

	
}