package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Arquitecto;
import com.uned.estudioTw.model.Certificado;
import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Estructura;

public interface CertificadoService {
	public List<Certificado> listarTodos();

	public void crear(Certificado certificado);
	
	public void borrar(Certificado certificado);
	
	public void editar(Certificado certificado);

	public Certificado obtener(long id);

	public Cliente obtenerCliente(long idCliente);
	
	public Estructura obtenerEstructura(long idEstructura);

	public Arquitecto obtenerArquitecto(long idArquitecto);
	
	List<Certificado> listarCertificadosRenovacion();

	List<Certificado> listarInspeccionTecnica();
}

