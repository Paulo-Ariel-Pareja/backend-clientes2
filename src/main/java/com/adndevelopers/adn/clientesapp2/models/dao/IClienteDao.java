package com.adndevelopers.adn.clientesapp2.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adndevelopers.adn.clientesapp2.models.entity.Cliente;
import com.adndevelopers.adn.clientesapp2.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

	@Query("from Region")
	public List<Region> findAllRegiones();
}
