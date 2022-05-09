package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.ProyectoDAOImpl;
import com.uned.estudioTw.dao.TipoProyectoDAOImpl;
import com.uned.estudioTw.model.Proyecto;
import com.uned.estudioTw.model.TipoProyecto;

@Service
public class ProyectoServiceImpl implements ProyectoService {
	@Autowired
	ProyectoDAOImpl proyectoDAO;
	@Autowired
	TipoProyectoDAOImpl tipoProyectoDAO;

	public void crear(Proyecto proyecto) {
		proyectoDAO.crear(proyecto);
	}
	
	public List<TipoProyecto> obtenerTiposProyecto() {
		return tipoProyectoDAO.listarTodos();
	}

}
