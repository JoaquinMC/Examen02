package com.examen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "rutas")
public class Rutas {

	@Id
    private int idrutas;
    
	private String nombre;

	public int getIdrutas() {
		return idrutas;
	}

	public void setIdrutas(int idrutas) {
		this.idrutas = idrutas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Rutas [idrutas=" + idrutas + ", nombre=" + nombre + ", getIdrutas()=" + getIdrutas() + ", getNombre()="
				+ getNombre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
