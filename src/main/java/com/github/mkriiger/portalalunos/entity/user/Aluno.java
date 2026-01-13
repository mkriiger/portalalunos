package com.github.mkriiger.portalalunos.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aluno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno extends Usuario {

    @Column(nullable = false, unique = true, length = 20)
    private String matricula;

    @Column(nullable = false, length = 100)
    private String curso;

    @Column(name = "data_transferencia")
    private LocalDateTime dataTransferencia;

    @Column(length = 50)
    private String statusAcademico;
}
