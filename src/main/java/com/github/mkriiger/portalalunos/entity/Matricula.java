package com.github.mkriiger.portalalunos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "matricula", uniqueConstraints = {
        @UniqueConstraint(name = "uk_aluno_turma", columnNames = {"aluno_id", "turma_id"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Matricula extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "aluno_id", nullable = false, foreignKey = @ForeignKey(name = "fk_matricula_aluno"))
    private Aluno aluno;

    @ManyToOne(optional = false)
    @JoinColumn(name = "turma_id", nullable = false, foreignKey = @ForeignKey(name = "fk_matricula_turma"))
    private Turma turma;

    @Column(name = "data_matricula", nullable = false)
    private LocalDateTime dataMatricula;

    @Column(length = 20)
    private String status;

    @Column(name = "data_cancelamento")
    private LocalDateTime dataCancelamento;

    @Column(columnDefinition = "TEXT")
    private String observacoes;
}