package br.com.etechas.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "TBL_CONEXAO")
public class Conexao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONEXAO")
    private Long id;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime dtCriacao;

    @ManyToOne
    @JoinColumn(name = "ID_MONITOR")
    private Monitor monitor;
}
