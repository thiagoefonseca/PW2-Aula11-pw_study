package br.com.etechas.study.service;

import br.com.etechas.study.entity.Disciplina;
import br.com.etechas.study.entity.Disponibilidade;
import br.com.etechas.study.enums.DiaSemanaEnum;
import br.com.etechas.study.repository.DisponibilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisponibilidadeService {
    @Autowired
    private DisponibilidadeRepository repository;

    public List<Disponibilidade> listar(){
        return repository.findAll();
    }

    public Optional<Disponibilidade> buscarPorId(Long id){
        return repository.findById(id);
    }

    public Disponibilidade cadastrar(Disponibilidade disponibilidade){
        disponibilidade.setDiaSemana(DiaSemanaEnum.QUINTA);
        return repository.save(disponibilidade);
    }
}
