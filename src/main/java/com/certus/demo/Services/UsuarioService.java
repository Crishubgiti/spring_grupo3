package com.certus.demo.Services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.certus.demo.dto.UsuarioRegistroDTO;
import com.certus.demo.model.Usuario;

public interface UsuarioService extends UserDetailsService {
	
	public Usuario save(UsuarioRegistroDTO registroDTO);

}
