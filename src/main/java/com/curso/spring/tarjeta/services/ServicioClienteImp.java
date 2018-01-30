package com.curso.spring.tarjeta.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjeta.dto.ClienteDTO;
import com.curso.spring.tarjeta.dto.OfertaDTO;
import com.curso.spring.tarjeta.dto.ReservaDTO;

@Service
public class ServicioClienteImp implements ServicioCliente {

	@Override
	public ClienteDTO altaCLiente(ClienteDTO cliente) {
		return null;
	}

	@Override
	public ClienteDTO consultaPuntos(int idCliente) {
		return null;
	}

	@Override
	public List<OfertaDTO> consultaOfertas(int idCliente) {
		return null;
	}

	@Override
	public List<ReservaDTO> consultaReservas(int idCliente, int idTarjeta) {
		return null;
	}

}
