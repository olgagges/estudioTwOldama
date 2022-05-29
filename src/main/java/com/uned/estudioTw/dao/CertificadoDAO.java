package com.uned.estudioTw.dao;

import java.util.List;

import com.uned.estudioTw.model.Certificado;

public interface CertificadoDAO extends BaseDAO<Certificado, Long> {
	List<Certificado> listarTodosRenovacion();
}
