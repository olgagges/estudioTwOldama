package com.uned.estudioTw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uned.estudioTw.model.Arquitecto;

@Repository
public class ArquitectoDAOImpl implements ArquitectoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void crear(Arquitecto arquitecto) {
		sessionFactory.getCurrentSession().save("Arquitecto", arquitecto);
	}

	public void borrar(Arquitecto arquitecto) {
		sessionFactory.getCurrentSession().delete(arquitecto);
	}

	public void actualizar(Arquitecto arquitecto) {
		sessionFactory.getCurrentSession().update(arquitecto);
	}

	public List<Arquitecto> listarTodos() {
		List<Arquitecto> arquitectos = sessionFactory.getCurrentSession().createQuery("FROM Arquitecto").list();
		return arquitectos;
	}

	public Arquitecto obtener(Long id) {
		Arquitecto arquitecto = (Arquitecto) sessionFactory.getCurrentSession().createQuery("from Arquitecto where idArquitecto = :tid").setParameter("tid", id).list().get(0);
		return arquitecto;
	}

	
}
