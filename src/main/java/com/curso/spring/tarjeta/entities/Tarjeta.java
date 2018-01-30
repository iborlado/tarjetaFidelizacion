package com.curso.spring.tarjeta.entities;

public class Tarjeta {
	private int id;
	private int idCLiente;

	public Tarjeta() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCLiente() {
		return idCLiente;
	}

	public void setIdCLiente(int idCLiente) {
		this.idCLiente = idCLiente;
	}
}