package org.sencillo.repository;

import org.sencillo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, String> {

}
