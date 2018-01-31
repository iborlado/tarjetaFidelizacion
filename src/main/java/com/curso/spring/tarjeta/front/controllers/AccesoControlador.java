package com.curso.spring.tarjeta.front.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.tarjeta.dto.ClienteDTO;
import com.curso.spring.tarjeta.dto.Login;
import com.curso.spring.tarjeta.dto.OfertaDTO;
import com.curso.spring.tarjeta.dto.UsuarioDTO;
import com.curso.spring.tarjeta.services.ServicioCliente;
import com.curso.spring.tarjeta.services.ServicioUsuario;

//definir endponnts
@Controller
@SessionAttributes("login")
public class AccesoControlador {
	
	@Autowired
	ServicioUsuario servicioUsuario;
	@Autowired
	ServicioCliente servicioCliente;

	//refactorizar a viewcontroller, los datos del usuario logado ya existe antes de llegar a esta pagina, no hay que precargar nada
	@GetMapping("/bienvenida")
	public String bienvenida(Model model, HttpSession session){
		Object object = session.getAttribute("login");
		String nombreLogado = null;
		if (object != null){
		Login login = (Login)  object;
		nombreLogado = login.getNombre();
		System.out.println("estamos en bienvenida, atributos sesion:"+ nombreLogado+" --- "+login.getPassword());
		}
		model.addAttribute("nombreLogado", nombreLogado);

		return "bienvenida";
	}
	
	
	
	@RequestMapping(value="/bienvenida",params="puntos",method=RequestMethod.POST)
    public String puntosDesdeBienvenida()
    {
        System.out.println("puntos block called");
        return "redirect:/puntos";
    }
    @RequestMapping(value="/bienvenida",params="ofertas",method=RequestMethod.POST)
    public String ofertas()
    {
        System.out.println("ofertas block called");
		return "redirect:/ofertas";

    }
	@RequestMapping(value="/bienvenida",params="reservas",method=RequestMethod.POST)
    public String reservas()
    {
        System.out.println("reservas block called");
		return "redirect:/reservas";

    }
	
	
	//para en las siguientes navegaciones saber quien se ha logado
	@ModelAttribute("login")
	public Login persona(){
		return new Login();
	} 
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	@PostMapping("/login")
	public String procesarLogin(@ModelAttribute Login usuarioLogin, HttpSession session){
		String url = null;
		String nombre = usuarioLogin.getNombre();
		String password = usuarioLogin.getPassword();
		System.out.println("model login : "+ nombre + " - "+password);
		boolean usuarioRegistrado = false;
		UsuarioDTO usuariodto = servicioUsuario.loginUsuario(nombre,password);
		
		if (usuariodto != null){
			url = "redirect:/bienvenida";
		}
		else {
			url = "login";
		}
		
				
		//si error volver a login
		//si exito ir a bienvenida
		Object object = session.getAttribute("login");
		if (object != null){
		Login login = (Login)  object;
		System.out.println("estamos en login, atributos sesion:"+ login.getNombre()+" --- "+login.getPassword());
		}
		
		return url;
	}
	
	
	

	/*@ModelAttribute("usuario")
	public UsuarioDTO usuario(){
		return new UsuarioDTO();
	}*/
	@ModelAttribute("cliente")
	public ClienteDTO cliente(){
		return new ClienteDTO();
	}
	@GetMapping("/registro")
	public String registro(){
		return "registro";
	}
	@PostMapping("/registro")
	public String procesarRegistro(@ModelAttribute ClienteDTO cliente, Map<String,Object> model){
		//si error
		//return "registro";
		
		//si exito se entra a bienvenida o a login para que inicie sesion
		Login clienteNuevo = servicioCliente.altaCLiente(cliente);

		model.put("login", clienteNuevo);
		System.out.println("registro :  "+clienteNuevo.getNombre());
		//return "bienvenida";
		return "redirect:/login";
	}

	//informacion anterior a mostrar esta pagina (dado en el login, sabemos el usuario)
	@GetMapping("/ofertas")
	public String ofertas(HttpSession session, Map<String,Object> model){
		//trabajo previo, para recuperar las ofertas del back
		List<OfertaDTO>ofertaslistado = null;
		Object object = session.getAttribute("login");
		int puntosAcumulados = 0;
		if (object != null){
			Login login = (Login)  object;
			ofertaslistado = servicioCliente.consultaOfertas((int) login.getId());
			System.out.println("estamos en ofertas, atributos sesion:"+ login.getNombre());
			System.out.println("ofertas:"+ ofertaslistado.get(0).getDescripcion());

			model.put("nombreLogado", login.getNombre());
			model.put("ofertas", ofertaslistado);
		}
		
		return "ofertas";
	}

	@GetMapping("/reservas")
	public String reservas(HttpSession session){
		return "reservas";
	}


	@GetMapping("/puntos")
	public String puntos(Model model, HttpSession session){
		Object object = session.getAttribute("login");
		int puntosAcumulados = 0;
		if (object != null){
			Login login = (Login)  object;
			model.addAttribute("nombreLogado", login.getNombre());
			System.out.println("estamos en puntos, atributos sesion:"+ login.getNombre());
			puntosAcumulados = servicioCliente.consultaPuntos((int) login.getId());
			model.addAttribute("numPuntos", puntosAcumulados);
			System.out.println("puntos:"+ puntosAcumulados);

		}
		return "puntos";
	}
	
}
