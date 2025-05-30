package br.com.etechas.study.repository;

import br.com.etechas.study.entity.Disponibilidade;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DisponibilidadeRepository extends JpaRepository<Disponibilidade, Long> {
}
