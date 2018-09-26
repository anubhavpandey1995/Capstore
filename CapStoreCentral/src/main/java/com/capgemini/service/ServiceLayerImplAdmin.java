package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.DAOLayerAdmin;
import com.capgemini.dto.Admin;

@Service
public class ServiceLayerImplAdmin implements ServiceLayerAdmin{

	
	@Autowired
	private DAOLayerAdmin daorefAdmin;
	
	@Override
	public Admin findById(int id) {
		
		return daorefAdmin.findById(id);
	}

	@Override
	public Admin validateAdmin(Admin admin) {
		
		return daorefAdmin.validateAdmin(admin);
	}

	
}
