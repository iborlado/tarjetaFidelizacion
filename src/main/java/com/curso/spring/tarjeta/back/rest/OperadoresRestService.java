package com.curso.spring.tarjeta.back.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.tarjeta.dto.MovimientoDTO;

@RestController
@RequestMapping("/movimientosPuntos")
public class OperadoresRestService {
	
	//da de alta un Movimiento y modificando puntos dentro de CLiente
	//pasando un objeto MovimientoDTO tiene toda la informacion(incluida la tarjeta y el cliente)
	//se puede usar directamente la entidad en vez DTO
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> acumularPuntos(@RequestBody MovimientoDTO movimiento){
		return null;
		
	}

}
