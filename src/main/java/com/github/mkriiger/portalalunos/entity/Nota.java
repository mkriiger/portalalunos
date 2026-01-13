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
@Table(name = "nota", uniqueConstraints = {
        @UniqueConstraint(name = "uk_matricula_avaliacao", columnNames = {"matricula_id", "tipo_avaliacao"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Nota extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "matricula_id", nullable = false, foreignKey = @ForeignKey(name = "fk_nota_matricula"))
    private Matricula matricula;

    @Column(nullable = false, length = 50)
    private String tipoAvaliacao;

    @Column(nullable = false)
    private Double valor;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "data_lancamento", nullable = false)
    private LocalDateTime dataLancamento;

    @Column(columnDefinition = "TEXT")
    private String observacoes;
}
