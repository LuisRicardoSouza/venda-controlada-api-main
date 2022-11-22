package com.venda.controlada.sistema.service;

import com.venda.controlada.sistema.domain.Vendas;
import com.venda.controlada.sistema.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVendasService {

    @Autowired
    VendasRepository vendasRepository;


    public ResponseEntity<String> cadastrarVendas (Vendas vendas) {

        vendasRepository.save(vendas);
        return ResponseEntity.ok("Venda cadastrada com sucesso!");

    }

}
