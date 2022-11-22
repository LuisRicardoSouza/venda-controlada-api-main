package com.venda.controlada.sistema.repository;


import com.venda.controlada.sistema.domain.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasRepository extends JpaRepository<Vendas, Long> {


}
