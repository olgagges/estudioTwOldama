package com.uned.estudioTw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TipoProyecto {

	@Id
	@GeneratedValue
	private long idTipoProyecto;
	private String ref;

	public long getIdTipoProyecto() {
		return idTipoProyecto;
	}

	public void setIdTipoProyecto(long idTipoProyecto) {
		this.idTipoProyecto = idTipoProyecto;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

}
