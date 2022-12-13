package com.certus.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class RegistroController {
	
	@GetMapping("/login")
	public String IniciarSecion() {
		return "login";
	}

		
	@Value("${titulo.home}")
	public String mensaj;
	@Value("${text.uno}")
	public String un;
	@Value("${text.dos}")
	public String doss;
	
	@GetMapping("/")
	public String verPaginaDeInicio (Model model) {
	
		model.addAttribute("home", mensaj);
		model.addAttribute("uno", un);
		model.addAttribute("dos", doss);
		
		
		
		return "index";
		
	}

}
