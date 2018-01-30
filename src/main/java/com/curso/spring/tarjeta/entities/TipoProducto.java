package com.curso.spring.tarjeta.entities;

public class TipoProducto {
	private int id;
	private String descripcion;

	public TipoProducto() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}