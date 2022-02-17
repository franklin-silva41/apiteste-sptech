package com.example.apitestesptech.repository;

import com.example.apitestesptech.domain.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ColaboradorRepository extends JpaRepository<Colaborador,Integer> {
    @Query("SELECT c FROM Colaborador c WHERE c.donopost =:dona AND c.nivelProfissional = :findcolab")
    List<Colaborador> findByNivelProfissionalByDonopost(@Param("findcolab") String nivelColab,
                                                        @Param("dona") String donopost);

    List<Colaborador> findAllByDonopost(String donoPost);
}
