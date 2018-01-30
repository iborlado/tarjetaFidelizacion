package com.curso.spring.tarjeta.dto;

import java.util.Date;

import com.curso.spring.tarjeta.entities.Movimiento;

public class MovimientoDTO {

	private Movimiento data = new Movimiento();

	public int getId() {
		return data.getId();
	}
	public void setId(int id) {
		this.data.setId(id);
	}
	public int getIdTarjeta() {
		return data.getIdTarjeta();
	}
	public void setIdTarjeta(int idTarjeta) {
		this.data.setIdTarjeta(idTarjeta);
	}
	public int getIdOperador() {
		return data.getIdOperador();
	}
	public void setIdOperador(int idOperador) {
		this.data.setIdOperador(idOperador);
	}
	public int getCantidad() {
		return data.getCantidad();
	}
	public void setCantidad(int cantidad) {
		this.data.setCantidad(cantidad);
	}
	public String getDescripcion() {
		return data.getDescripcion();
	}
	public void setDescripcion(String descripcion) {
		this.data.setDescripcion(descripcion);
	}
	public Date getFechaOperacion() {
		return data.getFechaOperacion();
	}
	public void setFechaOperacion(Date fechaOperacion) {
		this.data.setFechaOperacion(fechaOperacion);
	}
	
	
}
