package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.ArquitectoDAOImpl;
import com.uned.estudioTw.model.Arquitecto;

@Service
public class ArquitectoServiceImpl implements ArquitectoService {
	@Autowired
	ArquitectoDAOImpl ArquitectoDAO;

	public List<Arquitecto> listarTodos() {
		List<Arquitecto> arquitectos = ArquitectoDAO.listarTodos();
		return arquitectos;
	}

	public void crear(Arquitecto arquitecto) {
		ArquitectoDAO.crear(arquitecto);
		
	}

}
