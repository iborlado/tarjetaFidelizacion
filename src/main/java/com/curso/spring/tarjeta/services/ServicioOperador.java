package com.curso.spring.tarjeta.services;

import com.curso.spring.tarjeta.dto.OperadorDTO;

public interface ServicioOperador {
	
	public OperadorDTO altaOperador(OperadorDTO operador);
	public void acumularPuntos(int idOperador);

}
