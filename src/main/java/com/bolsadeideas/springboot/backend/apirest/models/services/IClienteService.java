package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Factura;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    List<Cliente> findAll();

    Page<Cliente> findAll(Pageable pageable);

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);

    List<Region> findAllRegiones();

    Factura findFacturaById(Long id);

    Factura saveFactura(Factura factura);

    void deleteFacturaById(Long id);

    List<Producto> findProductoByNombre(String term);

}
