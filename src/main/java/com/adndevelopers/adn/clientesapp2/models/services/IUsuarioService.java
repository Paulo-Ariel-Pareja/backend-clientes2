package com.adndevelopers.adn.clientesapp2.models.services;

import com.adndevelopers.adn.clientesapp2.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
