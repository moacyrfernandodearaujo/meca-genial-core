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

    // Esse comando permite que o Mestre salve uma nova habilidade do aluno
    @PostMapping("/validar")
    public ConquistaPratica validarHabilidade(@RequestBody ConquistaPratica conquista) {
        conquista.setDataValidacao(LocalDateTime.now());
        return repository.save(conquista);
    }

    // Esse comando mostra todas as habilidades que um aluno já conquistou
    @GetMapping("/aluno/{id}")
    public List<ConquistaPratica> listarHabilidades(@PathVariable Long id) {
        // Aqui o sistema buscaria no banco de dados
        return repository.findAll(); 
    }
}
