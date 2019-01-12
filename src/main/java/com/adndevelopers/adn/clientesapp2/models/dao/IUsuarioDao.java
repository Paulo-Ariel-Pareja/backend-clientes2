package com.adndevelopers.adn.clientesapp2.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.adndevelopers.adn.clientesapp2.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	public Usuario findByUsername(String username);
	
	/* otra forma igual
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername(String username);
	*/
}
