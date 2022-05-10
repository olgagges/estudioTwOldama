package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Arquitecto;

public interface ArquitectoService {
	public List<Arquitecto> listarTodos();

	public void crear(Arquitecto arquitecto);
	
	public void borrar(Arquitecto arquitecto);
	
	public void editar(Arquitecto arquitecto);

	public Arquitecto obtener(long id);
}
