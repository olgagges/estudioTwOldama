package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Arquitecto;
import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.Proyecto;
import com.uned.estudioTw.model.TipoProyecto;

public interface ProyectoService {
	public void crear(Proyecto proyecto);

	List<TipoProyecto> obtenerTiposProyecto();

	List<Arquitecto> obtenerArquitectos();

	List<Estructura> obtenerEstructuras();

	public Proyecto obtener(long id);

	Cliente obtenerCliente(long idCliente);

	Arquitecto obtenerArquitecto(long idArquitecto);

	TipoProyecto obtenerTipoProyecto(long parseLong);

	List<Proyecto> listarTodos();
}
