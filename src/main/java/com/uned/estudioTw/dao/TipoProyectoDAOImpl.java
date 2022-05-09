package com.uned.estudioTw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uned.estudioTw.model.TipoProyecto;

@Repository
public class TipoProyectoDAOImpl implements TipoProyectoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List<TipoProyecto> listarTodos() {
		List<TipoProyecto> tipoProyectos = sessionFactory.getCurrentSession().createQuery("FROM TipoProyecto").list();
		return tipoProyectos;
	}

	public void crear(TipoProyecto t) {
		// TODO Auto-generated method stub

	}

	public void borrar(TipoProyecto t) {
		// TODO Auto-generated method stub

	}

	public void actualizar(TipoProyecto t) {
		// TODO Auto-generated method stub

	}

	public TipoProyecto obtener(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
