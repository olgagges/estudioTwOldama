package com.uned.estudioTw.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import utils.Utils;

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


	public Proyecto() {
	}

	public Proyecto(String ref, Date fechaInicio,
			Date fechaSolicitud, Date fechaEntrega, Date fechaFin, long duracionObra, float presupuestoTotal,
			long duracionPresupuesto, String direccion, long superficeTerreno, long superficeEdificio,
			long superficeReforma, long plantas, long habitaciones, long banyos, float coste, String finalidadObra) {
		super();
		this.ref = ref;
		this.fechaInicio = fechaInicio;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaEntrega = fechaEntrega;
		this.fechaFin = fechaFin;
		this.duracionObra = duracionObra;
		this.presupuestoTotal = presupuestoTotal;
		this.duracionPresupuesto = duracionPresupuesto;
		this.direccion = direccion;
		this.superficeTerreno = superficeTerreno;
		this.superficeEdificio = superficeEdificio;
		this.superficeReforma = superficeReforma;
		this.plantas = plantas;
		this.habitaciones = habitaciones;
		this.banyos = banyos;
		this.coste = coste;
		this.finalidadObra = finalidadObra;
	}

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
