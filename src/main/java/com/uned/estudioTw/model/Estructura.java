package com.uned.estudioTw.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Estructura {
	@Id
	@GeneratedValue
	private long idEstructura;

	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idTipoEstructura", referencedColumnName = "idTipoEstructura")
	private TipoEstructura TipoEstructura;*/

	private String ref;
	private String direccion;
	private String tipo;

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

	
}
