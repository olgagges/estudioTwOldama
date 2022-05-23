package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Certificado;
import com.uned.estudioTw.model.Certificado;
import com.uned.estudioTw.model.TipoCertificado;

public interface CertificadoService {
	public List<Certificado> listarTodos();

	public void crear(Certificado certificado);
	
	public void borrar(Certificado certificado);
	
	public void editar(Certificado certificado);

	public Certificado obtener(long id);
}

