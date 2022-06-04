package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Arquitecto;
import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.Proyecto;

public interface ProyectoService {
	public void crear(Proyecto proyecto);

	List<Arquitecto> obtenerArquitectos();

	List<Estructura> obtenerEstructuras();

	public Proyecto obtener(long id);

	Cliente obtenerCliente(long idCliente);

	Arquitecto obtenerArquitecto(long idArquitecto);

	List<Proyecto> listarTodos();

	public void editar(Proyecto proyectoDAO);
}
