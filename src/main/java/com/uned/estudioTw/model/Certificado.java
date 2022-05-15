package com.uned.estudioTw.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Certificado {
	@Id
	@GeneratedValue
	private long idCertificado;

	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idTipoCertificado", referencedColumnName = "idTipoCertificado")
	private TipoCertificado tipoCertificado;*/
	
	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nombre", referencedColumnName = "nombre")
	private TipoCertificado tipoCertificado;*/

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idArquitecto", referencedColumnName = "idArquitecto")
	private Arquitecto arquitecto;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
	private Cliente cliente;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEstructura", referencedColumnName = "idEstructura")
	private Estructura estructura;

	private String tipo;
	private Date fechaRenovacion;
	private Date fechaInspeccion;
	private Date fechaSolicitud;
	private Date fechaEntrega;
	private Date fechaVisita;
	private Date fechaEmision;
	private Date fechaEmisionEstudio;
	private Date fechaITV;
	private char eficiencia; // A o G
	private float coste;

	public long getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(long idCertificado) {
		this.idCertificado = idCertificado;
	}

	/*public TipoCertificado getTipoCertificado() {
		return tipoCertificado;
	}

	public void setTipoCertificado(TipoCertificado tipoCertificado) {
		this.tipoCertificado = tipoCertificado;
	}*/

	public Arquitecto getArquitecto() {
		return arquitecto;
	}

	public void setArquitecto(Arquitecto arquitecto) {
		this.arquitecto = arquitecto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaRenovacion() {
		return fechaRenovacion;
	}

	public void setFechaRenovavion(Date fechaRenovacion) {
		this.fechaRenovacion = fechaRenovacion;
	}

	public Date getFechaInspeccion() {
		return fechaInspeccion;
	}

	public void setFechaInspeccion(Date fechaInspeccion) {
		this.fechaInspeccion = fechaInspeccion;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(Date fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaEmisionEstudio() {
		return fechaEmisionEstudio;
	}

	public void setFechaEmisionEstudio(Date fechaEmisionEstudio) {
		this.fechaEmisionEstudio = fechaEmisionEstudio;
	}

	public Date getFechaITV() {
		return fechaITV;
	}

	public void setFechaITV(Date fechaITV) {
		this.fechaITV = fechaITV;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
