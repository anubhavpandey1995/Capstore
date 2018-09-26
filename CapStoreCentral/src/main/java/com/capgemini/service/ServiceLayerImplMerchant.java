package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.DAOLayerMerchant;
import com.capgemini.dto.Customers;
import com.capgemini.dto.Merchants;
import com.capgemini.dto.Products;
import com.capgemini.exception.CapStoreException;

@Service
public class ServiceLayerImplMerchant implements ServiceLayerMerchant {

	@Autowired
	private DAOLayerMerchant daorefMerchant;
	
	@Override
	@Transactional
	public Merchants findByEmailID(String email_ID) {
		
		return daorefMerchant.findByEmailID(email_ID);
	}

	
	@Override
	@Transactional
	public Merchants validateMerchantForLogin(Merchants merchant) {

		return daorefMerchant.validateMerchantForLogin(merchant);
	}
	
	@Override
	@Transactional
	public Merchants addMerchant(Merchants merchant) {
				
				List<Merchants> listOfMerchants = daorefMerchant.getAllMerchant();
				
				for (Merchants m :listOfMerchants) {
					if(merchant.getMerchantEmail().equals(m.getMerchantEmail()))
					{
						Merchants mnew = new Merchants();
						mnew.setMerchantName("Dummy");
						return mnew;
					}
						
					
		else if(merchant.getMerchantMobile().equals(m.getMerchantMobile()))
					{
			            Merchants mnew2 = new Merchants();
			            mnew2.setMerchantName("Dummy");
						return mnew2;
					}
				}
				return daorefMerchant.addMerchant(merchant);
				
			}  	


	@Override
	@Transactional
	public void deleteMerchant(String[] ids) throws CapStoreException {

		 daorefMerchant.deleteMerchant(ids);
	}


	@Override
	@Transactional
	public Merchants updateMerchant(Merchants merchant) throws CapStoreException {

		return daorefMerchant.updateMerchant(merchant);
	}
	
	@Override
	@Transactional
	public List<Merchants> getAllMerchant() {

		return daorefMerchant.getAllMerchant();
	}


	@Override
	@Transactional
	public Products addProduct(Products product) {
		
		return daorefMerchant.addProduct(product);
	}


	@Override
	@Transactional
	public void deleteProduct(String[] ids) throws CapStoreException {

		 daorefMerchant.deleteProduct(ids);
	}


	@Override
	@Transactional
	public Products updateProduct(Products product) throws CapStoreException {

		return daorefMerchant.updateProduct(product);
	}


	@Override
	@Transactional
	public List<Products> getAllProduct() {

		return daorefMerchant.getAllProduct();
	}


	@Override
	@Transactional
	public List<Products> getAllProduct(int merchantId) {

		return daorefMerchant.getAllProduct(merchantId);
	}

	@Override
	@Transactional
	public List<Customers> getAllCustomer() {

		return daorefMerchant.getAllCustomer();
	}


	@Override
	@Transactional
	public boolean checkAvailabilty(Products product) throws CapStoreException {

		return daorefMerchant.checkAvailabilty(product);
	}


	@Override
	@Transactional
	public boolean checkDeliveryAvailability(Products product, int pincode) throws CapStoreException {

		return daorefMerchant.checkDeliveryAvailability(product, pincode);
	}


	@Override
	@Transactional
	public Products findById(int id) {
		 
		return daorefMerchant.findById(id);
	}


	@Override
	public Merchants findByMId(Integer id) {
		// TODO Auto-generated method stub
		return daorefMerchant.findByMId(id);
	}




	
}
