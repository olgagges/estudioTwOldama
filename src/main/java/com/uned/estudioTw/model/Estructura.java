package com.uned.estudioTw.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estructura {
	@Id
	@GeneratedValue
	private long idEstructura;

	private String ref;
	private String direccion;
	private String tipo;
	private Date fechaConstruccion;
	
	public Estructura() {}
	
	public Estructura(String ref,  String tipo, String direccion, Date fechaConstruccion) {
		super();
		this.tipo=tipo;
		this.ref=ref;
		this.direccion=direccion;
		this.fechaConstruccion = fechaConstruccion;	
	}

	public long getIdEstructura() {
		return idEstructura;
	}

	public void setIdEstructura(long idEstructura) {
		this.idEstructura = idEstructura;
	}

	/*public TipoEstructura getTipoEstructura() {
		return TipoEstructura;
	}

	public void setTipoEstructura(TipoEstructura tipoEstructura) {
		TipoEstructura = tipoEstructura;
	}*/

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaConstruccion() {
		return fechaConstruccion;
	}

	public void setFechaConstruccion(Date fechaConstruccion) {
		this.fechaConstruccion = fechaConstruccion;
	}

}
