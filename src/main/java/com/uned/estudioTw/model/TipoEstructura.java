package com.uned.estudioTw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TipoEstructura {

	@Id
	@GeneratedValue
	private long idTipoEstructura;
	private String ref;

	public long getIdTipoEstructura() {
		return idTipoEstructura;
	}

	public void setIdTipoEstructura(long idTipoEstructura) {
		this.idTipoEstructura = idTipoEstructura;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

}
