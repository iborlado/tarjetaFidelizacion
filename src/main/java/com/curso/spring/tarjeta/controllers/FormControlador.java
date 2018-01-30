package com.curso.spring.tarjeta.controllers;

import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.tarjeta.dto.UsuarioDTO;;


@Controller
@RequestMapping(path="/formularios")

public class FormControlador {
	
	@Autowired
	private MessageSource messageSource;
	
	@ModelAttribute("usuario")
	public UsuarioDTO usuario(){
		return new UsuarioDTO();
	}

	//se usa para cargar la primera vez los generos para cualquier peticion que le llegue al controlador
	//sin metodo que lo defina es necesario ir a configuracionWeb y añadir view formulario 
	@ModelAttribute
	public String[] productos(){
		return new String[]{"Coche","Hotel","Avion"};
	}
	
	
	//se comenta registry.addViewController("/formulario").setViewName("formulario"); del metodo
	//addViewControllers en configuracionWeb y esto lo equivale
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String iniciarFormulario(Map<String, Object> model){
		
		model.put("nombre", "pepo");
		System.out.println(messageSource.getMessage("formulario.login.nombre", null, Locale.getDefault()));

		return "login";
	}
	
	
	
	
	@RequestMapping(path="/formulario", method=RequestMethod.POST)
	public String procesarFormulario(@ModelAttribute UsuarioDTO usuario){
		
		System.out.println(usuario.getNombre() + " ---> "+usuario.getLogin());
		return "formulario";
	}
	
	
	
	
	
}

