package com.certus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.certus.demo.Services.UsuarioService;
import com.certus.demo.dto.UsuarioRegistroDTO;

@Controller
@RequestMapping("/registro")

public class RegistroUsuarioController {

	private UsuarioService usuarioService;

	public RegistroUsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new  UsuarioRegistroDTO();
	}
	
	@GetMapping
	public String monstrarFormularioDeRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuarioService.save(registroDTO);
		return "redirect:/registro?exito";
		
	}
}
