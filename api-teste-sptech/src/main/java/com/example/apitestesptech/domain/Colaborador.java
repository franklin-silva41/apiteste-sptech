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


    @JoinColumn(name = "id_especialidade")
    @OneToOne(cascade = CascadeType.ALL)
    private Especialidades especialidades;

    public Integer getColaborador_id() {
        return colaborador_id;
    }

    public void setColaborador_id(Integer colaborador_id) {
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

    public String getDonopost() {
        return donopost;
    }

    public void setDonopost(String donopost) {
        this.donopost = donopost;
    }

    public Especialidades getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }
}
