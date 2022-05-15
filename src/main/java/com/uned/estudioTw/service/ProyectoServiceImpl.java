package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.ArquitectoDAOImpl;
import com.uned.estudioTw.dao.EstructuraDAOImpl;
import com.uned.estudioTw.dao.ProyectoDAOImpl;
import com.uned.estudioTw.dao.TipoProyectoDAOImpl;
import com.uned.estudioTw.model.Arquitecto;
import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.Proyecto;
import com.uned.estudioTw.model.TipoProyecto;

@Service
public class ProyectoServiceImpl implements ProyectoService {
	@Autowired
	ProyectoDAOImpl proyectoDAO;
	@Autowired
	TipoProyectoDAOImpl tipoProyectoDAO;
	@Autowired
	ArquitectoDAOImpl arquitectoDAO;
	@Autowired
	EstructuraDAOImpl estructuraDAO;

	public void crear(Proyecto proyecto) {
		proyectoDAO.crear(proyecto);
	}
	
	public List<TipoProyecto> obtenerTiposProyecto() {
		return tipoProyectoDAO.listarTodos();
	}

	public List<Arquitecto> obtenerArquitectos() {
		return arquitectoDAO.listarTodos();
	}

	public List<Estructura> obtenerEstructuras() {
		return estructuraDAO.listarTodos();
	}


}
