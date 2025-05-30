package br.com.etechas.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_disciplina")
public class Disciplina {

    @Column(name = "id_disciplina") //configurando o nome do campo no bd
    @Id //Define a chave primária (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tx_nome")
    private String nome;

    public String getNome() {
        return nome;
    }
}
