package com.test.springbootbackendapirest.models.services;

import com.test.springbootbackendapirest.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
}
