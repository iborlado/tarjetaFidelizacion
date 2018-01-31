package com.curso.spring.tarjeta.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjeta.dto.ClienteDTO;
import com.curso.spring.tarjeta.dto.Login;
import com.curso.spring.tarjeta.dto.OfertaDTO;
import com.curso.spring.tarjeta.dto.ReservaDTO;
import com.curso.spring.tarjeta.dto.UsuarioDTO;
import com.curso.spring.tarjeta.entities.Usuario;

@Service
public class ServicioClienteImp implements ServicioCliente {

	@Override
	public Login altaCLiente(ClienteDTO cliente) {
		//¿se puede hacer aqui un new ?
		Login nuevoCliente = new Login();
		nuevoCliente.setId(cliente.getIdUsuario());
		nuevoCliente.setNombre(cliente.getLogin());
		
		return nuevoCliente;
	}

	@Override
	public int consultaPuntos(int idCliente) {
		int puntos=0;
		if (idCliente%2 == 0 )
		{
			puntos = 100;
		}
		else {
			puntos = 50;
		}
		return puntos;
	}

	@Override
	public List<OfertaDTO> consultaOfertas(int idCliente) {
		List<OfertaDTO> ofertas = new ArrayList<>();
		ofertas.add(new OfertaDTO(1,1,1000,"2x1 en noches", new Date(),new Date()));
		ofertas.add(new OfertaDTO(2,1,1000,"30% descuento en vuelos en noches", new Date(),new Date()));
		ofertas.add(new OfertaDTO(3,1,1000,"500 $dia", new Date(),new Date()));

		
		return ofertas;
	}

	@Override
	public List<ReservaDTO> consultaReservas(int idCliente, int idTarjeta) {
		return null;
	}

}
