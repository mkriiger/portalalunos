package com.github.mkriiger.portalalunos.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "administrador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Administrador extends Usuario {

    @Column(nullable = false, length = 50)
    private String cargo;

    @Column(length = 100)
    private String departamento;
}