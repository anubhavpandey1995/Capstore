package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dto.Admin;
import com.capgemini.dto.Carts;
import com.capgemini.dto.CustomerOrders;
import com.capgemini.dto.Customers;
import com.capgemini.dto.Feedbacks;
import com.capgemini.dto.Invoice;
import com.capgemini.dto.Merchants;
import com.capgemini.dto.OrderEntries;
import com.capgemini.dto.Pincodes;
import com.capgemini.dto.ProductCategory;
import com.capgemini.dto.Products;
import com.capgemini.dto.WishList;
//import com.capgemini.exception.CapStoreException;
import com.capgemini.exception.CapStoreException;


@Repository
@EnableTransactionManagement
public class DAOLayerImplAdmin implements DAOLayerAdmin {

	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Admin findById(int id)
	{
		return em.find(Admin.class, id);
		
	}

	@Override
	public Admin validateAdmin(Admin admin) {

		System.out.println(admin.getAdminId() + "***" + admin.getAdminPswd());
		Admin check = findById(admin.getAdminId());
		System.out.println(check+"*****returieved from db");
		if (admin.getAdminPswd().equals(check.getAdminPswd()))
			return check;
		else
			
		return null;
	}
	
	
	

	
///////////////////////////////////	
	 
	
/*
	@Override
	public List<String> selectAddress(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrders retrieveAddress(int customerId, int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrders addCoupon(int couponId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrders removeCoupon(int couponId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderEntries retrieveOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrders changeStatus(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice generateInvoice(int orderId, int customerId, int transactionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice makePayment(int amount, int orderId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Boolean logout(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customers findByCustomerIDforAdmin(int customer_ID) {
		// TODO Auto-generated method stub
		return null;
	}*/
		

}