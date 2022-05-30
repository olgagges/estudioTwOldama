package com.uned.estudioTw.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uned.estudioTw.model.Certificado;

@Repository
public class CertificadoDAOImpl implements CertificadoDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void crear(Certificado certificado) {
		sessionFactory.getCurrentSession().save("Certificado", certificado);
	}

	public void borrar(Certificado certificado) {
		sessionFactory.getCurrentSession().delete(certificado);
	}

	public void editar(Certificado certificado) {
		sessionFactory.getCurrentSession().update(certificado);
	}

	public List<Certificado> listarTodos() {
		List<Certificado> certificados = sessionFactory.getCurrentSession().createQuery("FROM Certificado").list();
		return certificados;
	}

	public Certificado obtener(Long id) {
		Certificado certificado = (Certificado) sessionFactory.getCurrentSession()
				.createQuery("from Certificado where idCertificado = :tid").setParameter("tid", id).list().get(0);
		return certificado;
	}

	public List<Certificado> listarTodosRenovacion() {
		List<Certificado> certificados = sessionFactory.getCurrentSession().createQuery("FROM Certificado where year(fechaemision)+15<= year(current_date)").list();
		return certificados;
	}
	
	public List<Certificado> listarInspeccionTecnica() {
		List<Certificado> certificados = sessionFactory.getCurrentSession().createQuery("FROM Certificado where fechaemision>=current_date").list();
		return certificados;
	}

	public List<Certificado> listarCertificadosPorTipo(String tipo) {
		List<Certificado> certificados = sessionFactory.getCurrentSession().createQuery("FROM Certificado where tipo = :tid").setParameter("tid", tipo).list();
		return certificados;
	}
	
	
}
