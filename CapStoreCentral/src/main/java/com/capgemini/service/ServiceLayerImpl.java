package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.DAOLayerAdmin;
import com.capgemini.dao.DAOLayerCustomer;
import com.capgemini.dao.DAOLayerMerchant;
import com.capgemini.dto.Admin;
import com.capgemini.dto.Customers;
import com.capgemini.dto.Merchants;
import com.capgemini.dto.Products;
import com.capgemini.exception.CapStoreException;

@Service
public class ServiceLayerImpl implements ServiceLayer
{
	 
	@Autowired
	private DAOLayerCustomer daorefCustomer;
	 

	@Override
	public Customers createAccount(Customers cusDTO) {
		return daorefCustomer.createAccount(cusDTO);
	}


	@Override
	public Customers validateCustomerForLogin(Customers customer) {
		return daorefCustomer.validateCustomerForLogin(customer);
	}
	
	 

	@Override
	public String check() {
		return daorefCustomer.check();
	}
 
	
}