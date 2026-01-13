package com.github.mkriiger.portalalunos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "professor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends Usuario {

    @Column(nullable = false, unique = true, length = 20)
    private String siape;

    @Column(nullable = false, length = 100)
    private String departamento;

    @Column(nullable = false, length = 50)
    private String titulacao;

    @Column(length = 100)
    private String especializacao;
}
