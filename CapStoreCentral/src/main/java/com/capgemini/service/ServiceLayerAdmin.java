package com.capgemini.service;

import com.capgemini.dto.Admin;

public interface ServiceLayerAdmin {

	public Admin findById(int id);
	public Admin validateAdmin(Admin admin);
	
	
}
