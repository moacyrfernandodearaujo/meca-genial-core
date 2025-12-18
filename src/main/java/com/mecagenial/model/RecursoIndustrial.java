package com.mecagenial.model;

import jakarta.persistence.*;

@Entity
public class RecursoIndustrial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeRecurso; // Ex: Energia Solar, Água Reutilizada
    private Double quantidadeAtual;
    private String unidadeMedida; // Ex: kWh, Litros, Kg

    public RecursoIndustrial() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNomeRecurso() { return nomeRecurso; }
    public void setNomeRecurso(String nomeRecurso) { this.nomeRecurso = nomeRecurso; }
    public Double getQuantidadeAtual() { return quantidadeAtual; }
    public void setQuantidadeAtual(Double quantidadeAtual) { this.quantidadeAtual = quantidadeAtual; }
    public String getUnidadeMedida() { return unidadeMedida; }
    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }
}
