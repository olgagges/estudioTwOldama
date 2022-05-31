package com.uned.estudioTw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uned.estudioTw.dao.ArquitectoDAOImpl;
import com.uned.estudioTw.dao.CertificadoDAOImpl;
import com.uned.estudioTw.dao.ClienteDAOImpl;
import com.uned.estudioTw.dao.EstructuraDAOImpl;
import com.uned.estudioTw.model.Arquitecto;
import com.uned.estudioTw.model.Certificado;
import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.TipoCertificado;

@Service
public class CertificadoServiceImpl implements CertificadoService {
	@Autowired
	CertificadoDAOImpl certificadoDAO;

	@Autowired
	ClienteDAOImpl clienteDAO;
	@Autowired
	ArquitectoDAOImpl arquitectoDAO;
	@Autowired
	EstructuraDAOImpl estructuraDAO;

	public void crear(Certificado certificado) {
		certificadoDAO.crear(certificado);
	}


	public List<Certificado> listarTodos() {
		List<Certificado> certificados = certificadoDAO.listarTodos();
		return certificados;
	}

	public void borrar(Certificado certificado) {
		// TODO Auto-generated method stub

	}

	public void editar(Certificado certificado) {
		certificadoDAO.editar(certificado);
	}

	public Certificado obtener(long id) {
		return certificadoDAO.obtener(id);
	}

	public Cliente obtenerCliente(long idCliente) {
		return clienteDAO.obtener(idCliente);
	}

	public Estructura obtenerEstructura(long idEstructura) {
		return estructuraDAO.obtener(idEstructura);
	}

	public Arquitecto obtenerArquitecto(long idArquitecto) {
		return arquitectoDAO.obtener(idArquitecto);
	}

	public List<Certificado> listarCertificadosRenovacion() {
		List<Certificado> certificados = certificadoDAO.listarTodosRenovacion();
		return certificados;
	}

	public List<Certificado> listarInspeccionTecnica() {
		List<Certificado> certificados = certificadoDAO.listarInspeccionTecnica();
		return certificados;
	}

	public List<Certificado> listarCertificadosPorTipo(String tipo) {
		List<Certificado> certificados = certificadoDAO.listarCertificadosPorTipo(tipo);
		return certificados;
	}


	public List<Certificado> listarPedidos(long id) {
		List<Certificado> certificados = certificadoDAO.listarPedidos(id);
		return certificados;
	}
}
