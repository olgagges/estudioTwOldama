package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Admin;

public interface AdminService {
	public List<Admin> listarTodos();

	public void crear(Admin admin);
	
	public void borrar(Admin admin);
	
	public void editar(Admin admin);

	public Admin obtener(long id);
}
