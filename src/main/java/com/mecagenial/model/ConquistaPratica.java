package com.mecagenial.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ConquistaPratica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long alunoId; 
    private String habilidade;
    private String setor;
    private LocalDateTime dataValidacao;
    private String feedbackMestre;

    public ConquistaPratica() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAlunoId() { return alunoId; }
    public void setAlunoId(Long alunoId) { this.alunoId = alunoId; }
    public String getHabilidade() { return habilidade; }
    public void setHabilidade(String habilidade) { this.habilidade = habilidade; }
    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
    public LocalDateTime getDataValidacao() { return dataValidacao; }
    public void setDataValidacao(LocalDateTime dataValidacao) { this.dataValidacao = dataValidacao; }
    public String getFeedbackMestre() { return feedbackMestre; }
    public void setFeedbackMestre(String feedbackMestre) { this.feedbackMestre = feedbackMestre; }
}
