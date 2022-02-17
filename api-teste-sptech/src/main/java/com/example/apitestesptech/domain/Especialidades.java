package com.example.apitestesptech.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Especialidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer especialidade_id;

    private String especialidade;

    private String nivel;

    @ManyToOne
    @JoinColumn(name = "colaborador_id",referencedColumnName = "colaborador_id")
    private Colaborador colaborador;


}
