package com.github.mkriiger.portalalunos.entity;

import com.github.mkriiger.portalalunos.entity.user.Professor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "turma")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Turma extends BaseEntity {

    @Column(nullable = false, unique = true, length = 30)
    private String codigo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "disciplina_id", nullable = false, foreignKey = @ForeignKey(name = "fk_turma_disciplina"))
    private Disciplina disciplina;

    @ManyToOne(optional = false)
    @JoinColumn(name = "professor_id", nullable = false, foreignKey = @ForeignKey(name = "fk_turma_professor"))
    private Professor professor;

    @Column(nullable = false, length = 10)
    private String semestre;

    @Column(nullable = false)
    private Integer vagas;

    @Column(name = "vagas_ocupadas", nullable = false)
    private Integer vagasOcupadas;

    @Column(name = "data_inicio", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "data_fim", nullable = false)
    private LocalDateTime dataFim;

    @Column(length = 50)
    private String horario;

    @Column(length = 100)
    private String local;
}