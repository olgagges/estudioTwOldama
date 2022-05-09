package com.uned.estudioTw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uned.estudioTw.model.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void crear(Admin admin) {
		sessionFactory.getCurrentSession().save("Admin", admin);
	}

	public void borrar(Admin admin) {
		sessionFactory.getCurrentSession().delete(admin);
	}

	public void editar(Admin admin) {
		sessionFactory.getCurrentSession().update(admin);
	}

	public List<Admin> listarTodos() {
		List<Admin> admins = sessionFactory.getCurrentSession().createQuery("FROM Admin").list();
		return admins;
	}

	public Admin obtener(Long id) {
		Admin admin = (Admin) sessionFactory.getCurrentSession().createQuery("from admin where idAdmin = :tid").setParameter("tid", id).list().get(0);
		return admin;
	}
}
