package com.uned.estudioTw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uned.estudioTw.model.Cliente;

@Repository
public class ProyectoDAOImpl implements ClienteDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void crear(Cliente cliente) {
		sessionFactory.getCurrentSession().save("Cliente", cliente);
	}

	public void borrar(Cliente cliente) {
		sessionFactory.getCurrentSession().delete(cliente);
	}

	public void actualizar(Cliente cliente) {
		sessionFactory.getCurrentSession().update(cliente);
	}

	public List<Cliente> listarTodos() {
		List<Cliente> clientes = sessionFactory.getCurrentSession().createQuery("FROM Cliente").list();
		return clientes;
	}

	public Cliente obtener(Long id) {
		Cliente cliente = (Cliente) sessionFactory.getCurrentSession().createQuery("from Cliente where idCliente = :tid").setParameter("tid", id).list().get(0);
		return cliente;
	}
}
