package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.ClienteDAOImpl;
import com.uned.estudioTw.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	ClienteDAOImpl clienteDAO;

	public List<Cliente> listarTodos() {
		List<Cliente> clientes = clienteDAO.listarTodos();
		return clientes;
	}

	public void crear(Cliente cliente) {
		clienteDAO.crear(cliente);		
	}
	
	public void borrar(Cliente cliente) {
		clienteDAO.borrar(cliente);		
	}
	
	public void editar(Cliente cliente) {
		clienteDAO.editar(cliente);		
	}
	
	public Cliente obtener(long id) {
		return clienteDAO.obtener(id);		
	}

}
