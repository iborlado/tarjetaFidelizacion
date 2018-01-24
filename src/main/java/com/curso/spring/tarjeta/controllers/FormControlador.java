package com.curso.spring.tarjeta.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.tarjeta.dto.Usuario;;

@Controller
public class FormControlador {
	
	//pnemos este objeto en el request pq formulario.jsp lo busca y la 1 vez q se renderiza, no pasara por el controlador y no existe persona
	@ModelAttribute
	public Usuario usuario(){
		return new Usuario();
	}

	//se usa para cargar la primera vez los generos para cualquier peticion que le llegue al controlador
	//sin metodo que lo defina es necesario ir a configuracionWeb y añadir view formulario 
	@ModelAttribute
	public String[] productos(){
		return new String[]{"Coche","Hotel","Avion"};
	}
	
	
	//se comenta registry.addViewController("/formulario").setViewName("formulario"); del metodo
	//addViewControllers en configuracionWeb y esto lo equivale
	@RequestMapping(path="/formulario", method=RequestMethod.GET)
	public String iniciarFormulario(Map<String, Object> model){
		
		return "formulario";
	}
	
	
	
	
	@RequestMapping(path="/formulario", method=RequestMethod.POST)
	public String procesarFormulario(@ModelAttribute Usuario usuario){
		
		System.out.println(usuario.getNombre() + " --- "+usuario.getLogin());
		return "formulario";
	}
	
	
	
	
	
}

