package com.repicam.microservicio_estudiantes.services;

import com.repicam.microservicio_estudiantes.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> findAll();
    Estudiante findById(Long id);
    Estudiante save(Estudiante estudiante);
    List<Estudiante> findByIdCurso(Long cursoId);
}
