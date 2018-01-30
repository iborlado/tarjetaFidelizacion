package com.curso.spring.tarjeta.services;

import com.curso.spring.tarjeta.dto.UsuarioDTO;

public interface ServicioUsuario {

	public UsuarioDTO loginUsuario(String login, String password);
}
