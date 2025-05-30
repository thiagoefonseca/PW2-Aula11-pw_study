package br.com.etechas.study.controller;

import br.com.etechas.study.entity.Disciplina;
import br.com.etechas.study.entity.Disponibilidade;
import br.com.etechas.study.service.DisponibilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disponibilidades")
public class DIsponibilidadeController {

    @Autowired
    private DisponibilidadeService service;

    @GetMapping
    public List<Disponibilidade> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Disponibilidade> buscarPorId(@PathVariable("id") Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public Disponibilidade cadastrar(@RequestBody Disponibilidade disponibilidade){
        return service.cadastrar(disponibilidade);
    }

}
