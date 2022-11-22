package com.venda.controlada.sistema.service;

import com.venda.controlada.sistema.domain.Cliente;
import com.venda.controlada.sistema.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CadastrarClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    public ResponseEntity<String> cadastrarCliente (Cliente cliente) {
        
        clienteRepository.save(cliente);
        return ResponseEntity.ok("Cliente cadastrado com sucesso!");



    }

}
