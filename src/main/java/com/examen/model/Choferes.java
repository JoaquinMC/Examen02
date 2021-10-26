package com.examen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="choferes")
public class Choferes {
	
	@Id
	private int idchoferes;
	
	private String apellidos;

	public int getIdchoferes() {
		return idchoferes;
	}

	public void setIdchoferes(int idchoferes) {
		this.idchoferes = idchoferes;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Choferes [idchoferes=" + idchoferes + ", apellidos=" + apellidos + ", getIdchoferes()="
				+ getIdchoferes() + ", getApellidos()=" + getApellidos() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
