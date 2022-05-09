package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Proyecto;
import com.uned.estudioTw.model.TipoProyecto;

public interface ProyectoService {
	public void crear(Proyecto proyecto);

	List<TipoProyecto> obtenerTiposProyecto();

}
