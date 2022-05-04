package com.uned.estudioTw.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Proyecto {
	@Id
	@GeneratedValue
	private long idProyecto;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idTipoProyecto", referencedColumnName = "idTipoProyecto")
	private TipoProyecto tipoProyecto;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
	private Cliente cliente;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idArquitecto", referencedColumnName = "idArquitecto")
	private Arquitecto arquitecto;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Arquitecto getArquitecto() {
		return arquitecto;
	}
	public void setArquitecto(Arquitecto arquitecto) {
		this.arquitecto = arquitecto;
	}
	private String ref;
	private Date fechaInicio;
	private Date fechaSolicitud;
	private Date fechaEntrega;
	private Date fechaFin;
	
	private long duracionObra;
	private float presupuestoTotal;
	private long duracionPresupuesto;

	public long getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(long idProyecto) {
		this.idProyecto = idProyecto;
	}
	public TipoProyecto getTipoProyecto() {
		return tipoProyecto;
	}
	public void setTipoProyecto(TipoProyecto tipoProyecto) {
		this.tipoProyecto = tipoProyecto;
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
	
	
	
	
}

