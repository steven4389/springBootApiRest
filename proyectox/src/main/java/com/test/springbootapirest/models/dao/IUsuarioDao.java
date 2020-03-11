package com.test.springbootapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.springbootbackendapirest.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

}
