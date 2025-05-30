package br.com.etechas.study.tests;

import br.com.etechas.study.entity.Disciplina;
import br.com.etechas.study.service.DisciplinaService;

import java.util.ArrayList;
import java.util.List;

public class TesteDisciplina {
    public static void main(String[] args) {
        DisciplinaService service = new DisciplinaService();

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas = service.listar();
        disciplinas.forEach(disc -> System.out.println(disc.getNome()));
    }
}
