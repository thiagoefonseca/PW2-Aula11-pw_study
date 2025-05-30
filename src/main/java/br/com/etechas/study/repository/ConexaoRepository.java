package br.com.etechas.study.repository;

import br.com.etechas.study.entity.Conexao;
import org.springframework.data.jpa.repository.JpaRepository;
//                                                       Classe, tipo da chave primária
public interface ConexaoRepository extends JpaRepository<Conexao, Long> {
}
