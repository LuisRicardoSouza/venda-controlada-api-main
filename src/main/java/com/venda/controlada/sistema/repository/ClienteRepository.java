package com.venda.controlada.sistema.repository;

import com.venda.controlada.sistema.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
