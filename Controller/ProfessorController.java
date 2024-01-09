package com.alunoonline.api.Controller;


import com.alunoonline.api.Model.Aluno;
import com.alunoonline.api.Model.Professor;
import com.alunoonline.api.Service.AlunoService;
import com.alunoonline.api.Service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Professor> criar(@RequestBody Professor professor) {
        Professor professorCriado = service.criar(professor);

        return ResponseEntity.status(201).body(professorCriado);
    }

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> listarTodos() {
        return service.listarTodos();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
