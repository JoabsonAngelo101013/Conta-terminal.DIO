package com.alunoonline.api.Controller;

import com.alunoonline.api.Model.Aluno;
import com.alunoonline.api.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    AlunoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        Aluno alunoCriado = service.criar(aluno);

        return ResponseEntity.status(201).body(alunoCriado);
    }


    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Aluno> listarTodos() {
        return service.listarTodos();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);

    }
}
