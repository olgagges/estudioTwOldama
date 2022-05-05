package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Admin;

public interface AdminService {
	public List<Admin> listarTodos();

	public void crear(Admin admin);

}
