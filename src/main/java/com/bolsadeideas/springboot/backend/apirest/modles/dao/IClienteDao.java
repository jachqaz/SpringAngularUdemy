package com.bolsadeideas.springboot.backend.apirest.modles.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface IClienteDao extends CrudRepository<Cliente, Long> { }
public interface IClienteDao extends JpaRepository<Cliente, Long> {
}
