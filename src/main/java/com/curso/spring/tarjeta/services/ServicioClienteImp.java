package com.curso.spring.tarjeta.services;

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
