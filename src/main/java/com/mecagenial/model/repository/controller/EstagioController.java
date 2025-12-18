package com.mecagenial.controller;

import com.mecagenial.model.ConquistaPratica;
import com.mecagenial.repository.ConquistaPraticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/estagio")
public class EstagioController {

    @Autowired
    private ConquistaPraticaRepository repository;

    @PostMapping("/validar")
    public ConquistaPratica validarHabilidade(@RequestBody ConquistaPratica conquista) {
        conquista.setDataValidacao(LocalDateTime.now());
        return repository.save(conquista);
    }

    @GetMapping("/progresso")
    public List<ConquistaPratica> listarTudo() {
        return repository.findAll();
    }
}
