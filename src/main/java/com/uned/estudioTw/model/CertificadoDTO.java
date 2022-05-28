package com.uned.estudioTw.model;

import java.util.Date;

public class CertificadoDTO {

	private String idCertificado;
	private String idCliente;
	private String idArquitecto;
	private String idEstructura;
	private String tipo;
	private String fechaRenovacion;
	private String fechaInspeccion;
	private String fechaSolicitud;
	private String fechaEntrega;
	private String fechaVisita;
	private String fechaEmision;
	private String fechaEmisionEstudio;
	private String fechaITE;
	private char eficiencia; // A o G
	private float coste;
	
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIdArquitecto() {
		return idArquitecto;
	}
	public void setIdArquitecto(String idArquitecto) {
		this.idArquitecto = idArquitecto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFechaRenovacion() {
		return fechaRenovacion;
	}
	public void setFechaRenovacion(String fechaRenovacion) {
		this.fechaRenovacion = fechaRenovacion;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getFechaVisita() {
		return fechaVisita;
	}
	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
	}
	public String getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getFechaInspeccion() {
		return fechaInspeccion;
	}
	public void setFechaInspeccion(String fechaInspeccion) {
		this.fechaInspeccion = fechaInspeccion;
	}
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getFechaEmisionEstudio() {
		return fechaEmisionEstudio;
	}
	public void setFechaEmisionEstudio(String fechaEmisionEstudio) {
		this.fechaEmisionEstudio = fechaEmisionEstudio;
	}
	public String getFechaITE() {
		return fechaITE;
	}
	public void setFechaITE(String fechaITE) {
		this.fechaITE = fechaITE;
	}
	public char getEficiencia() {
		return eficiencia;
	}
	public void setEficiencia(char eficiencia) {
		this.eficiencia = eficiencia;
	}
	public float getCoste() {
		return coste;
	}
	public void setCoste(float coste) {
		this.coste = coste;
	}
	public String getIdEstructura() {
		return idEstructura;
	}
	public void setIdEstructura(String idEstructura) {
		this.idEstructura = idEstructura;
	}
	public String getIdCertificado() {
		return idCertificado;
	}
	public void setIdCertificado(String idCertificado) {
		this.idCertificado = idCertificado;
	}
	
}
