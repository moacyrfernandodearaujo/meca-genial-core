package com.mecagenial.controller;

import com.mecagenial.model.RecursoIndustrial;
import com.mecagenial.repository.RecursoIndustrialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos")
public class RecursoIndustrialController {

    @Autowired
    private RecursoIndustrialRepository repository;

    @PostMapping("/atualizar")
    public RecursoIndustrial atualizarEstoque(@RequestBody RecursoIndustrial recurso) {
        return repository.save(recurso);
    }

    @GetMapping("/balanco")
    public List<RecursoIndustrial> listarRecursos() {
        return repository.findAll();
    }
}
