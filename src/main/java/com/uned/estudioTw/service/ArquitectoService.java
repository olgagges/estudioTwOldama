package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Arquitecto;

public interface ArquitectoService {
	public List<Arquitecto> listarTodos();

	public void crear(Arquitecto arquitecto);

}
