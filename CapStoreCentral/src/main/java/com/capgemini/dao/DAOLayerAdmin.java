package com.capgemini.dao;
//Test
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Repository;

//import com.capgemini.exception.CapStoreException;
import com.capgemini.dto.*;
import com.capgemini.exception.CapStoreException;
@Repository
public interface DAOLayerAdmin {
	
	

	public Admin findById(int id);
	public Admin validateAdmin(Admin admin);
	
	
	
	
/*		// Place Order Operations
		public List<String> selectAddress(int customerId);
		public CustomerOrders retrieveAddress(int customerId, int addressId);
		
		public CustomerOrders addCoupon(int couponId, int customerId);
		public CustomerOrders removeCoupon(int couponId, int customerId);
		
		public OrderEntries retrieveOrderDetails(int orderId);
		public CustomerOrders changeStatus(int customerId);
		
		// Payment and Invoice Operations
		public Invoice generateInvoice(int orderId, int customerId, int transactionId);
		public Invoice makePayment(int amount, int orderId, int customerId);
		
		//public Boolean logout(HttpServletRequest request);
	
		 
	 
	Customers findByCustomerIDforAdmin(int customer_ID);
	*/
	
	
	
		
	
	
	
	
	
	
}