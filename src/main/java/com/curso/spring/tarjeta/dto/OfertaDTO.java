package com.curso.spring.tarjeta.dto;

import java.util.Date;

import com.curso.spring.tarjeta.entities.Oferta;

public class OfertaDTO {

	private Oferta data = new Oferta();

	public int getId() {
		return data.getId();
	}
	public void setId(int id) {
		this.data.setId(id);
	}
	public int getIdCliente() {
		return data.getIdCliente();
	}
	public void setIdCliente(int idCliente) {
		this.data.setIdCliente(idCliente);
	}
	public int getCoste() {
		return data.getCoste();
	}
	public void setCoste(int coste) {
		this.data.setCoste(coste);
	}
	public String getDescripcion() {
		return data.getDescripcion();
	}
	public void setDescripcion(String descripcion) {
		this.data.setDescripcion(descripcion);
	}
	public Date getFechaInicio() {
		return data.getFechaInicio();
	}
	public void setFechaInicio(Date fechaInicio) {
		this.data.setFechaInicio(fechaInicio);
	}
	public Date getFechaFin() {
		return data.getFechaFin();
	}
	public void setFechaFin(Date fechaFin) {
		this.data.setFechaFin(fechaFin);
	}
	
	
}
