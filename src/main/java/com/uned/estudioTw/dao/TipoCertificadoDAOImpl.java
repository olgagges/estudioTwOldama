package com.uned.estudioTw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uned.estudioTw.model.TipoCertificado;

@Repository
public class TipoCertificadoDAOImpl implements TipoCertificadoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List<TipoCertificado> listarTodos() {
		List<TipoCertificado> tipoCertificados = sessionFactory.getCurrentSession().createQuery("FROM TipoCertificado").list();
		return tipoCertificados;
	}

	public void crear(TipoCertificado t) {
		// TODO Auto-generated method stub

	}

	public void borrar(TipoCertificado t) {
		// TODO Auto-generated method stub

	}

	public void editar(TipoCertificado t) {
		// TODO Auto-generated method stub

	}

	public TipoCertificado obtener(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
