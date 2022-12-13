package com.certus.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class plantillasController {
	
	@Value("${nosotros.mensaje}")
	private String texto;
	
	@Value("${titulo.nosotros}")
	private String mensaje;
	
	@GetMapping("/nosotros")
	public String viewNosotros(Model model) {
		
		model.addAttribute("titulo", mensaje);
		model.addAttribute("mensaje", texto);
		
		return "nosotros";
	}

}
