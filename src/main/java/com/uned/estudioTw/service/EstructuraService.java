package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Estructura;

public interface EstructuraService {
	public List<Estructura> listarTodos();

	public void crear(Estructura estructura);
	
	public void borrar(Estructura estructura);
	
	public void editar(Estructura estructura);

	public Estructura obtener(long id);
}
