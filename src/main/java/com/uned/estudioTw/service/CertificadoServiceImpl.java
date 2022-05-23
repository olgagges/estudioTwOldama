package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.CertificadoDAOImpl;
import com.uned.estudioTw.dao.TipoCertificadoDAOImpl;
import com.uned.estudioTw.model.Certificado;
import com.uned.estudioTw.model.TipoCertificado;

@Service
public class CertificadoServiceImpl implements CertificadoService {
	@Autowired
	CertificadoDAOImpl certificadoDAO;
	@Autowired
	TipoCertificadoDAOImpl tipoCertificadoDAO;

	public void crear(Certificado certificado) {
		certificadoDAO.crear(certificado);
	}
	
	public List<TipoCertificado> obtenerTiposCertificado() {
		return tipoCertificadoDAO.listarTodos();
	}
	
	public List<Certificado> listarTodos() {
		List<Certificado> certificados = certificadoDAO.listarTodos();
		return certificados;
	}

	public void borrar(Certificado certificado) {
		// TODO Auto-generated method stub
		
	}

	public void editar(Certificado certificado) {
		// TODO Auto-generated method stub
		
	}

	public Certificado obtener(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
