package com.mecagenial.service;

import com.mecagenial.model.RecursoIndustrial;
import com.mecagenial.repository.RecursoIndustrialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoIndustrialRepository repository;

    public RecursoIndustrial salvarRecurso(RecursoIndustrial recurso) {
        // Aqui é onde a mágica acontece: lógica de validação
        // Antes de salvar, poderíamos verificar se o recurso é reutilizável
        return repository.save(recurso);
    }

    public List<RecursoIndustrial> listarTudo() {
        return repository.findAll();
    }
}
