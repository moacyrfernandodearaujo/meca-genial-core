package com.mecagenial.dto;

public class RecursoDTO {
    private String nome;
    private Double quantidade;
    private String status;

    // Construtor padrão
    public RecursoDTO() {}

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getQuantidade() { return quantidade; }
    public void setQuantidade(Double quantidade) { this.quantidade = quantidade; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
