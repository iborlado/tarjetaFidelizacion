package com.curso.spring.tarjeta.dto;

import java.util.Date;

import com.curso.spring.tarjeta.entities.Oferta;

public class OfertaDTO {

	private int id;
	private int idCliente;
	private int coste;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	
	
	public OfertaDTO(int id, int idCliente, int coste, String descripcion, Date fechaInicio, Date fechaFin) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.coste = coste;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public OfertaDTO(){
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getCoste() {
		return coste;
	}
	public void setCoste(int coste) {
		this.coste = coste;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
		
}
