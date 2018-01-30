package com.curso.spring.tarjeta.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.http.MediaType;

import com.curso.spring.tarjeta.dto.UsuarioDTO;

//como hacer un new controller
@Controller 
//filtros para poder llegar al controlador (se tienen que cumplir todas)
@RequestMapping(path="/saludo")
public class Controlador {
	
	//beans de logica(vista, servicio...)
	@Autowired
	//si hay mas de una vista fallaria, por eso se usa qualifier para saber cual hay que inyectar
	@Qualifier("miVista")
	private View miVista;
	
	
	//para recibir parametros en el path, ej entero llamado id y en el body un objeto tipo Persona
	@RequestMapping(path="/bienvenida/{id}", method = RequestMethod.GET, consumes= MediaType.APPLICATION_XML_VALUE)
	public String bienvenida(Map<String, Object> model,  @RequestBody UsuarioDTO usuario,@PathVariable int id){
		return "miVista";
	}
	

	@RequestMapping(path="/despedida", method = RequestMethod.GET)
	public View despedida(Model model, @RequestParam int id){
		//en el index.jsp se puede acceder al atributo ${saludo}
		model.addAttribute("saludo", "Adios...."+id);
		return miVista;
	}
	
	/**
	 * Metodo que recibiendo una usuario en formato JSON, la cambia el nombre y la retorna en formato XML
	 * @param persona
	 * @param nombreNuevo
	 * @return
	 */
	@RequestMapping(path="/cambioDeNombre", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_XML_VALUE)
	@ResponseBody public UsuarioDTO cambiarElNombreALaPersona(@RequestBody UsuarioDTO usuario, @RequestParam(required=true) String nombreNuevo) {
		usuario.setNombre(nombreNuevo);
		return usuario;
	}
}
