package com.curso.spring.tarjeta.dto;

import com.curso.spring.tarjeta.entities.TipoProducto;

public class TipoProductoDTO {

	private int id;
	private String descripcion;


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
