package com.curso.spring.tarjeta.dto;

import com.curso.spring.tarjeta.entities.Reserva;

public class ReservaDTO {

	private Reserva data = new Reserva();


	public int getId() {
		return data.getId();
	}
	public void setId(int id) {
		this.data.setId(id);
	}
	public int getIdTipoProducto() {
		return data.getIdTipoProducto();
	}
	public void setIdTipoProducto(int idTipoProducto) {
		this.data.setIdTipoProducto(idTipoProducto);
	}
	public int getIdMovimiento() {
		return data.getIdMovimiento();
	}
	public void setIdMovimiento(int idMovimiento) {
		this.data.setIdMovimiento(idMovimiento);
	}
	
	
}
