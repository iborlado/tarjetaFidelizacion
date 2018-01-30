package com.curso.spring.tarjeta.dto;

import com.curso.spring.tarjeta.entities.Tarjeta;

public class TarjetaDTO {
	
	private Tarjeta data = new Tarjeta();


	public int getId() {
		return data.getId();
	}
	public void setId(int id) {
		this.data.setId(id);
	}
	public int getIdCLiente() {
		return data.getIdCLiente();
	}
	public void setIdCLiente(int idCLiente) {
		this.data.setIdCLiente(idCLiente);
	}
	
	
	

}
