package com.uned.estudioTw.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Admin {
	@Id
	@GeneratedValue
	private long idAdmin;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
	private Persona persona;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public long getIdAmin() {
		return idAdmin;
	}

	public void setIdAmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}

}
