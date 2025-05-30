package br.com.etechas.study.service;

import br.com.etechas.study.entity.Conexao;
import br.com.etechas.study.repository.ConexaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConexaoService {

    @Autowired
    private ConexaoRepository repository;

    public List<Conexao> listar(){
        return repository.findAll();
    }
}
