package com.projeto.ada.apirest.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "detran")
public class Detran {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_inversa")
    private String dataInversa;

    @Column(name = "dia_semana")
    private String diaSemana;

    @Column(name = "horario")
    private String horario;

    @Column(name = "uf")
    private String uf;

    @Column(name = "br")
    private String br;

    @Column(name = "km")
    private String km;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "causa_acidente")
    private String causaAcidente;

    @Column(name = "tipo_acidente")
    private String tipoAcidente;

    @Column(name = "classificacao_acidente")
    private String classificacaoAcidente;

    @Column(name = "fase_dia")
    private String faseDia;

    @Column(name = "sentido_via")
    private String sentidoVia;

    @Column(name = "condicao_meteorologica")
    private String condicaoMeteorologica;

    @Column(name = "tipo_pista")
    private String tipoPista;

    @Column(name = "tracado_via")
    private String tracadoVia;

    @Column(name = "uso_solo")
    private String usoSolo;

    @Column(name = "ano")
    private String ano;

    @Column(name = "pessoas")
    private String pessoas;

    @Column(name = "mortos")
    private String mortos;

    @Column(name = "feridos_leves")
    private String feridosLeves;

    @Column(name = "feridos_graves")
    private String feridosGraves;

    @Column(name = "ilesos")
    private String ilesos;

    @Column(name = "ignorados")
    private String ignorados;

    @Column(name = "feridos")
    private String feridos;

    @Column(name = "veiculos")
    private String veiculos;

}


