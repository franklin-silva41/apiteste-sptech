package com.example.apitestesptech.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Colaborador {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "colaborador_id")
    private Integer colaborador_id;

    private String nome;

    private String nivelProfissional;

    private String semestreAtual;

    private String donopost;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_especialidade")
    private Especialidades especialidades;

    public String getDonopost() {
        return donopost;
    }

    public void setDonopost(String donopost) {
        this.donopost = donopost;
    }

    public Integer getId() {
        return colaborador_id;
    }

    public void setId(Integer id) {
        this.colaborador_id = colaborador_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelProfissional() {
        return nivelProfissional;
    }

    public void setNivelProfissional(String nivelProfissional) {
        this.nivelProfissional = nivelProfissional;
    }

    public String getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(String semestreAtual) {
        this.semestreAtual = semestreAtual;
    }
}
