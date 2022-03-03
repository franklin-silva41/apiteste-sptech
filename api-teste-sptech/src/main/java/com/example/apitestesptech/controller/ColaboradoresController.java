package com.example.apitestesptech.controller;

import com.example.apitestesptech.domain.Colaborador;
import com.example.apitestesptech.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sptech")
public class ColaboradoresController {

    // TODO usar para testar no postman ☑
    // TODO filtrar pelo dono do post ☑

    @Autowired
    private ColaboradorRepository repository;

    /**
     * @GetMapping() public String getStringTeste(){
     * return "Teste api";
     * }
     **/

    @PostMapping("/colaborador")
    public ResponseEntity<?> postColab(@RequestBody Colaborador colaborador) {
        repository.save(colaborador);

        return ResponseEntity.status(201).build();

    }

    @GetMapping("/{donopost}/procurarcolab/{findColab}")
    public List<Colaborador> getEstagiario(@PathVariable String findColab,
                                           @PathVariable String donopost) {
        return repository.findByNivelProfissionalByDonopost(findColab, donopost);
    }

    @GetMapping("/todos")
    public List<Colaborador> getTodos() {
        return repository.findAll();
    }

    @GetMapping("/todos/dono/{donopost}")
    //

    public List<Colaborador> getColaboradorWhereDonoPost(@PathVariable String donopost) {

        return repository.findAllByDonopost(donopost);
    }
}
