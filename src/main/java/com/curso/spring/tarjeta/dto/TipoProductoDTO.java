package com.curso.spring.tarjeta.dto;

import com.curso.spring.tarjeta.entities.TipoProducto;

public class TipoProductoDTO {

	private TipoProducto data = new TipoProducto();

	public int getId() {
		return data.getId();
	}
	public void setId(int id) {
		this.data.setId(id);
	}
	public String getDescripcion() {
		return data.getDescripcion();
	}
	public void setDescripcion(String descripcion) {
		this.data.setDescripcion(descripcion);
	}
	
	
}
