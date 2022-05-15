package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.EstructuraDAOImpl;
import com.uned.estudioTw.model.Estructura;

@Service
public class EstructuraServiceImpl implements EstructuraService {
	@Autowired
	EstructuraDAOImpl estructuraDAO;

	public List<Estructura> listarTodos() {
		List<Estructura> estructuras = estructuraDAO.listarTodos();
		return estructuras;
	}

	public void crear(Estructura estructura) {
		estructuraDAO.crear(estructura);		
	}
	
	public void borrar(Estructura estructura) {
		estructuraDAO.borrar(estructura);		
	}
	
	public void editar(Estructura estructura) {
		estructuraDAO.editar(estructura);		
	}
	
	public Estructura obtener(long id) {
		return estructuraDAO.obtener(id);		
	}

}
