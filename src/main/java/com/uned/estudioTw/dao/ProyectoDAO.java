package com.uned.estudioTw.dao;

import java.util.List;

import com.uned.estudioTw.model.Proyecto;

public interface ProyectoDAO extends BaseDAO<Proyecto, Long> {
	List<Proyecto> listarTodosArquitecto(Long id);
	List<Proyecto> listarTodosCliente(Long id);
}
