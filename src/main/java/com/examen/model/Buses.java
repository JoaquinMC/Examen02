package com.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="buses")
public class Buses {

	@Id
	@Column(name="idbuses")
	private int	id;

	@Column(name="matricula")
	private String mat;

	@Column(name="capacidad")
	private int cap;

	@Column(name="modelo")
	private	String mod;

	@Column(name="idchoferes")
	private int chof;

	@Column(name="idrutas")
	private int ruta;


	@Override
	public String toString() {
	return "Buses [id=" + id + ", mat=" + mat + ", cap=" + cap + ", mod=" + mod + ", chof=" + chof + ", ruta=" + ruta
			+ ", getId()=" + getId() + ", getMat()=" + getMat() + ", getCap()=" + getCap() + ", getMod()=" + getMod()
			+ ", getChof()=" + getChof() + ", getRuta()=" + getRuta() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public String getMat() {
	return mat;
	}

	public void setMat(String mat) {
	this.mat = mat;
	}

	public int getCap() {
	return cap;
	}

	public void setCap(int cap) {
	this.cap = cap;
	}

	public String getMod() {
	return mod;
	}

	public void setMod(String mod) {
	this.mod = mod;
	}

	public int getChof() {
	return chof;
	}

	public void setChof(int chof) {
	this.chof = chof;
	}

	public int getRuta() {
	return ruta;
	}

	public void setRuta(int ruta) {
	this.ruta = ruta;
	}




	
}
