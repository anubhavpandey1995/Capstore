package com.capgemini.service;

import java.util.List;

import com.capgemini.dto.Admin;
import com.capgemini.dto.Customers;
import com.capgemini.dto.Merchants;
import com.capgemini.dto.Products;
import com.capgemini.exception.CapStoreException;

public interface ServiceLayer
{
 
	
	
	public Customers createAccount(Customers cusDTO);
	public Customers validateCustomerForLogin(Customers customer);
	public String check();
	
	
	 
}