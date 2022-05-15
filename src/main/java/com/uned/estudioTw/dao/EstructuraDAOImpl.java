package com.uned.estudioTw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uned.estudioTw.model.Estructura;

@Repository
public class EstructuraDAOImpl implements EstructuraDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void crear(Estructura estructura) {
		sessionFactory.getCurrentSession().save("Estructura", estructura);
	}

	public void borrar(Estructura estructura) {
		sessionFactory.getCurrentSession().delete(estructura);
	}

	public void editar(Estructura estructura) {
		sessionFactory.getCurrentSession().update(estructura);
	}

	public List<Estructura> listarTodos() {
		List<Estructura> estructuras = sessionFactory.getCurrentSession().createQuery("FROM Estructura").list();
		return estructuras;
	}

	public Estructura obtener(Long id) {
		Estructura estructura = (Estructura) sessionFactory.getCurrentSession().createQuery("from Estructura where idEstructura = :tid").setParameter("tid", id).list().get(0);
		return estructura;
	}


		
	
}
