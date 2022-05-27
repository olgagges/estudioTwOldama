package com.uned.estudioTw.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ProyectoDTO {



	private String idTipoProyecto;
	private String idCliente;
	private String idArquitecto;


	private String ref;
	private Date fechaInicio;
	private Date fechaSolicitud;
	private Date fechaEntrega;
	private Date fechaFin;

	private long duracionObra;
	private float presupuestoTotal;
	private long duracionPresupuesto;
	
	private String direccion;
	private long superficeTerreno;
	private long superficeEdificio;
	private long superficeReforma;
	private long plantas;
	private long habitaciones;
	private long banyos;
	private float coste;
	private String finalidadObra;
	public String getIdTipoProyecto() {
		return idTipoProyecto;
	}
	public void setIdTipoProyecto(String idTipoProyecto) {
		this.idTipoProyecto = idTipoProyecto;
	}
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
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
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
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public long getDuracionObra() {
		return duracionObra;
	}
	public void setDuracionObra(long duracionObra) {
		this.duracionObra = duracionObra;
	}
	public float getPresupuestoTotal() {
		return presupuestoTotal;
	}
	public void setPresupuestoTotal(float presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}
	public long getDuracionPresupuesto() {
		return duracionPresupuesto;
	}
	public void setDuracionPresupuesto(long duracionPresupuesto) {
		this.duracionPresupuesto = duracionPresupuesto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getSuperficeTerreno() {
		return superficeTerreno;
	}
	public void setSuperficeTerreno(long superficeTerreno) {
		this.superficeTerreno = superficeTerreno;
	}
	public long getSuperficeEdificio() {
		return superficeEdificio;
	}
	public void setSuperficeEdificio(long superficeEdificio) {
		this.superficeEdificio = superficeEdificio;
	}
	public long getSuperficeReforma() {
		return superficeReforma;
	}
	public void setSuperficeReforma(long superficeReforma) {
		this.superficeReforma = superficeReforma;
	}
	public long getPlantas() {
		return plantas;
	}
	public void setPlantas(long plantas) {
		this.plantas = plantas;
	}
	public long getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(long habitaciones) {
		this.habitaciones = habitaciones;
	}
	public long getBanyos() {
		return banyos;
	}
	public void setBanyos(long banyos) {
		this.banyos = banyos;
	}
	public float getCoste() {
		return coste;
	}
	public void setCoste(float coste) {
		this.coste = coste;
	}
	public String getFinalidadObra() {
		return finalidadObra;
	}
	public void setFinalidadObra(String finalidadObra) {
		this.finalidadObra = finalidadObra;
	}
	

	

}
