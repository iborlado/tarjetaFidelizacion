package com.curso.spring.tarjeta.dto;

public class Operador extends Usuario{
	
	private int idOperador;
	private String cif;
	private String web;
	private int idTipoProducto;
	private float factorConversion;
	public int getIdOperador() {
		return idOperador;
	}
	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getIdTipoProducto() {
		return idTipoProducto;
	}
	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}
	public float getFactorConversion() {
		return factorConversion;
	}
	public void setFactorConversion(float factorConversion) {
		this.factorConversion = factorConversion;
	}
	
	

}
