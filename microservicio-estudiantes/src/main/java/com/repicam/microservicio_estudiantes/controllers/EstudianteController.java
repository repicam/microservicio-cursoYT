package com.repicam.microservicio_estudiantes.controllers;

import com.repicam.microservicio_estudiantes.entities.Estudiante;
import com.repicam.microservicio_estudiantes.services.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @PostMapping
    public @ResponseBody ResponseEntity saveEstudiante(@RequestBody Estudiante estudiante){
        Estudiante nuevoEstudiante = estudianteService.save(estudiante);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEstudiante);
    }

    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity findById(@PathVariable Long id){
        Estudiante estudiante = estudianteService.findById(id);
        return ResponseEntity.ok(estudiante);
    }

    @GetMapping
    public @ResponseBody ResponseEntity findAll(){
        List<Estudiante> estudiantesList = estudianteService.findAll();
        return ResponseEntity.ok(estudiantesList);
    }

    @GetMapping("/curso/{idCurso}")
    public @ResponseBody ResponseEntity findByIdCurso(@PathVariable Long idCurso){
        List<Estudiante> estudiantesList = estudianteService.findByIdCurso(idCurso);
        return ResponseEntity.ok(estudiantesList);
    }
}
