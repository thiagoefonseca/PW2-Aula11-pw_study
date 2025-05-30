package br.com.etechas.study.service;

import br.com.etechas.study.entity.Disciplina;
import br.com.etechas.study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> listar(){
        return repository.findAll();
    }

    public Optional<Disciplina> buscarPorId(Long id){
        return repository.findById(id);
        //return repository.findById(id).orElse;
    }

    public Disciplina cadastrar(Disciplina disciplina){
        return repository.save(disciplina);
    }

    public void excluir(Long id){
        var existe = buscarPorId(id);
        if(existe.isPresent()) //if(existe != null)
            repository.deleteById(id);
    }

}
