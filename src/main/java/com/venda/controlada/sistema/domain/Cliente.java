package com.venda.controlada.sistema.domain;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "tbcliente")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String rua;

    @NotNull
    private String numero;

    @NotNull
    private String bairro;

    @NotNull
    private String cidade;

    public Cliente (String nome, String rua, String numero, String bairro, String cidade) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }
}
