package com.uned.estudioTw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TipoCertificado {

	@Id
	@GeneratedValue
	private long idTipoCertificado;
	private String nombre;
	private long tiempoCaducidad;
	private boolean obligatorio;
	private int anyosInicioInspeccion;
	private int anyosRenovacion;

	public long getIdTipoCertificado() {
		return idTipoCertificado;
	}

	public void setIdTipoCertificado(long idTipoCertificado) {
		this.idTipoCertificado = idTipoCertificado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTiempoCaducidad() {
		return tiempoCaducidad;
	}

	public void setTiempoCaducidad(long tiempoCaducidad) {
		this.tiempoCaducidad = tiempoCaducidad;
	}

	public boolean isObligatorio() {
		return obligatorio;
	}

	public void setObligatorio(boolean obligatorio) {
		this.obligatorio = obligatorio;
	}

	public int getAnyosInicioInspeccion() {
		return anyosInicioInspeccion;
	}

	public void setAnyosInicioInspeccion(int anyosInicioInspeccion) {
		this.anyosInicioInspeccion = anyosInicioInspeccion;
	}

	public int getAnyosRenovacion() {
		return anyosRenovacion;
	}

	public void setAnyosRenovacion(int anyosRenovacion) {
		this.anyosRenovacion = anyosRenovacion;
	}

}
