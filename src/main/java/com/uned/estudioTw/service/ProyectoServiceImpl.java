package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.ArquitectoDAOImpl;
import com.uned.estudioTw.dao.ClienteDAOImpl;
import com.uned.estudioTw.dao.EstructuraDAOImpl;
import com.uned.estudioTw.dao.ProyectoDAOImpl;
import com.uned.estudioTw.dao.TipoProyectoDAOImpl;
import com.uned.estudioTw.model.Arquitecto;
import com.uned.estudioTw.model.Cliente;
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
	@Autowired
	ClienteDAOImpl clienteDAO;

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

	public Cliente obtenerCliente(long idCliente) {
		return clienteDAO.obtener(idCliente);
	}

	public Arquitecto obtenerArquitecto(long idArquitecto) {
		return arquitectoDAO.obtener(idArquitecto);
	}

	public TipoProyecto obtenerTipoProyecto(long idTipoProyecto) {
		return tipoProyectoDAO.obtener(idTipoProyecto);
	}

	public List<Proyecto> listarTodos() {
		List<Proyecto> proyectos = proyectoDAO.listarTodos();
		return proyectos;
	}

	public List<Proyecto> listarTodosPorCliente(long idCliente) {
		List<Proyecto> proyectos = proyectoDAO.listarTodosCliente(idCliente);
		return proyectos;
	}

	public List<Proyecto> listarTodosPorArquitecto(long idArquitecto) {
		List<Proyecto> proyectos = proyectoDAO.listarTodosArquitecto(idArquitecto);
		return proyectos;
	}

	public Proyecto obtener(long id) {
		return proyectoDAO.obtener(id);
	}

	public void editar(Proyecto proyecto) {
		proyectoDAO.editar(proyecto);
		
	}
}
