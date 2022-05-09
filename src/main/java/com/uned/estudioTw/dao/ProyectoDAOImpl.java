package com.uned.estudioTw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uned.estudioTw.model.Proyecto;

@Repository
public class ProyectoDAOImpl implements ProyectoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void crear(Proyecto proyecto) {
		sessionFactory.getCurrentSession().save("Cliente", proyecto);
	}

	public void borrar(Proyecto proyecto) {
		sessionFactory.getCurrentSession().delete(proyecto);
	}

	public void editar(Proyecto proyecto) {
		sessionFactory.getCurrentSession().update(proyecto);
	}

	public List<Proyecto> listarTodos() {
		List<Proyecto> proyectos = sessionFactory.getCurrentSession().createQuery("FROM Proyecto").list();
		return proyectos;
	}

	public Proyecto obtener(Long id) {
		Proyecto proyecto = (Proyecto) sessionFactory.getCurrentSession()
				.createQuery("from Proyecto where idProyecto = :tid").setParameter("tid", id).list().get(0);
		return proyecto;
	}
}
