package com.capgemini.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerDummy {
	private List<Customers> customers;
	 
    public CustomerDummy()
    {
        customers = new ArrayList<>();
    }

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setMerchants(List<Customers> customers) {
		this.customers = customers;
	}
}
