package com.venda.controlada.sistema.controller;

import com.venda.controlada.sistema.domain.Cliente;
import com.venda.controlada.sistema.domain.Vendas;
import com.venda.controlada.sistema.service.CadastrarClienteService;
import com.venda.controlada.sistema.service.CadastrarVendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/admin")
@PreAuthorize("hasRole('ROLE_ADMIN')")


public class AdminController {

    @Autowired
    CadastrarClienteService cadastrarClienteService;
    CadastrarVendasService cadastrarVendasService;

    @PostMapping("/clientes/cadastrar")
    public ResponseEntity<?> cadastrarCliente(@Valid @RequestBody Cliente cadastrarCliente) {
        return (cadastrarClienteService.cadastrarCliente(cadastrarCliente));
    }

    @PostMapping("/vendas/cadastrar")
    public ResponseEntity<?> cadastrarVendas(@Valid @RequestBody Vendas cadastrarVendas) {
        return (cadastrarVendasService.cadastrarVendas(cadastrarVendas));
    }

}
