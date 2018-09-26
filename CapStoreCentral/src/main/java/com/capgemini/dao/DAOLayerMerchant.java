package com.capgemini.dao;


 
import java.util.List;

import com.capgemini.dto.Customers;
import com.capgemini.dto.Merchants;
import com.capgemini.dto.Products;
import com.capgemini.exception.CapStoreException;

public interface DAOLayerMerchant {
	
	
	public Merchants findByEmailID(String email_ID);
	
	public Merchants validateMerchantForLogin(Merchants merchant);
	
	public List<Merchants> getAllMerchant();
	public List<Customers> getAllCustomer();
	public List<Products> getAllProduct();
	public List<Products> getAllProduct(int merchantId);

	public Products findById(int id);
	public Products addProduct(Products product);
    public void deleteProduct(String[] ids) throws CapStoreException;
    public Products updateProduct(Products product) throws CapStoreException;
    public Merchants addMerchant(Merchants merchant);
    public void deleteMerchant(String[] ids) throws CapStoreException;
    public Merchants updateMerchant(Merchants merchant) throws CapStoreException;
    public boolean checkAvailabilty(Products product) throws CapStoreException;
    public boolean checkDeliveryAvailability(Products product, int pincode) throws CapStoreException;

	public Merchants findByMId(Integer id);
	
	
}
