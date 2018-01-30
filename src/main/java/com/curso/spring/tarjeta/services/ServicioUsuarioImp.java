package com.curso.spring.tarjeta.services;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjeta.dto.UsuarioDTO;

@Service
public class ServicioUsuarioImp implements ServicioUsuario {

	@Override
	public UsuarioDTO loginUsuario(String login, String password) {
		
		UsuarioDTO usuarioDTO = null;
		
		if (login.equals("admin") && password.equals("admin")){
			usuarioDTO = new UsuarioDTO();
			usuarioDTO.setIdUsuario(1);
			usuarioDTO.setLogin(login);
			usuarioDTO.setNombre("nombre usuario");
		}
		return usuarioDTO;
	}

}
