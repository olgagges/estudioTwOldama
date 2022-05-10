package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.ArquitectoDAOImpl;
import com.uned.estudioTw.model.Arquitecto;

@Service
public class ArquitectoServiceImpl implements ArquitectoService {
	@Autowired
	ArquitectoDAOImpl arquitectoDAO;

	public List<Arquitecto> listarTodos() {
		List<Arquitecto> arquitectos = arquitectoDAO.listarTodos();
		return arquitectos;
	}

	public void crear(Arquitecto arquitecto) {
		arquitectoDAO.crear(arquitecto);		
	}
	
	public void borrar(Arquitecto arquitecto) {
		arquitectoDAO.borrar(arquitecto);		
	}
	
	public void editar(Arquitecto arquitecto) {
		arquitectoDAO.editar(arquitecto);		
	}
	
	public Arquitecto obtener(long id) {
		return arquitectoDAO.obtener(id);		
	}

}
