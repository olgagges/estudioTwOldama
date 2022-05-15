package com.uned.estudioTw.service;

import java.util.List;

import com.uned.estudioTw.model.Certificado;
import com.uned.estudioTw.model.TipoCertificado;

public interface CertificadoService {
	public void crear(Certificado certificado);

	List<TipoCertificado> obtenerTiposCertificado();

}
