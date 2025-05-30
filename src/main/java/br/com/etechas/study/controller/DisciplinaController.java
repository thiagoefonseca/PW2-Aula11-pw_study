package br.com.etechas.study.controller;

import br.com.etechas.study.entity.Disciplina;

import br.com.etechas.study.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<Disciplina> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Disciplina> buscarPorId(@PathVariable("id") Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina){
        return service.cadastrar(disciplina);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        service.excluir(id);
    }
}
