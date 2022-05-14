package com.uned.estudioTw.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEstructura", referencedColumnName = "idEstructura")
	private Estructura estructura;

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
	
	private String direccion;
	private long superficeTerreno;
	private long superficeEdificio;
	private long superficeReforma;
	private long plantas;
	private long habitaciones;
	private long banyos;
	private float coste;
	private String finalidadObra;
	

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

	public Estructura getEstructura() {
		return estructura;
	}

	public void setEstructura(Estructura estructura) {
		this.estructura = estructura;
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
