package com.repicam.microservicio_cursos.controllers;

import com.repicam.microservicio_cursos.dtos.httpResponse.EstudianteByCursoResponse;
import com.repicam.microservicio_cursos.entities.Curso;
import com.repicam.microservicio_cursos.services.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @PostMapping
    public @ResponseBody ResponseEntity saveCurso(@RequestBody Curso curso){
        Curso nuevoCurso = cursoService.save(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCurso);
    }

    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity findById(@PathVariable Long id){
        Curso curso = cursoService.findById(id);
        return ResponseEntity.ok(curso);
    }

    @GetMapping
    public @ResponseBody ResponseEntity findAll(){
        List<Curso> cursosList = cursoService.findAll();
        return ResponseEntity.ok(cursosList);
    }

    @GetMapping("/{id}/estudiantes")
    public @ResponseBody ResponseEntity findEstudiantesByCursoId(@PathVariable Long id){
        EstudianteByCursoResponse response = cursoService.findEstudianteByCursoId(id);
        return ResponseEntity.ok(response);
    }
}
