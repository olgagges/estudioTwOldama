package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Cliente;

public interface ClienteService {
	public List<Cliente> listarTodos();

	public void crear(Cliente cliente);

	public void borrar(Cliente cliente);

	public void editar(Cliente cliente);

	public Cliente obtener(long id);

}
