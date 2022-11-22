package com.venda.controlada.sistema.domain;

import lombok.*;
import org.springframework.http.ResponseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "tbproduto")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String produto;

    @NotNull
    private String pagamento;



 ;

    public Vendas(String nome, String produto, String pagamento) {
        this.nome = nome;
        this.produto = produto;
        this.pagamento = pagamento;
    }

}
