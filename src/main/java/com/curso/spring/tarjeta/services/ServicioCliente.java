package com.curso.spring.tarjeta.services;

import java.util.List;

import com.curso.spring.tarjeta.dto.ClienteDTO;
import com.curso.spring.tarjeta.dto.Login;
import com.curso.spring.tarjeta.dto.OfertaDTO;
import com.curso.spring.tarjeta.dto.ReservaDTO;
import com.curso.spring.tarjeta.dto.UsuarioDTO;


public interface ServicioCliente {

	public Login altaCLiente(ClienteDTO cliente);
	public ClienteDTO consultaPuntos(int idCliente);
	public List<OfertaDTO> consultaOfertas(int idCliente);
	public List<ReservaDTO> consultaReservas(int idCliente, int idTarjeta);
	
}
