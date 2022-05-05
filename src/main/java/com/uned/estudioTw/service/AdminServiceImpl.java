package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.AdminDAOImpl;
import com.uned.estudioTw.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDAOImpl adminDAO;

	public List<Admin> listarTodos() {
		List<Admin> admins = adminDAO.listarTodos();
		return admins;
	}

	public void crear(Admin admin) {
		adminDAO.crear(admin);
		
	}

}
