package com.curso.spring.tarjeta.dto;

import com.curso.spring.tarjeta.entities.Reserva;

public class ReservaDTO {

	private int id;
	private int idTipoProducto;
	private int idMovimiento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdTipoProducto() {
		return idTipoProducto;
	}
	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}
	public int getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

}
