package br.com.etechas.study.repository;

import br.com.etechas.study.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
