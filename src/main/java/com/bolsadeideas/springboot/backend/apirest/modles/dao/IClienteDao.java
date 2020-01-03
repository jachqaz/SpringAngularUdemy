package com.bolsadeideas.springboot.backend.apirest.modles.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
    
}
