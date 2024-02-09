package com.repicam.microservicio_cursos.services;

import com.repicam.microservicio_cursos.dtos.httpResponse.EstudianteByCursoResponse;
import com.repicam.microservicio_cursos.entities.Curso;

import java.util.List;

public interface ICursoService {

    List<Curso> findAll();
    Curso findById(Long id);
    Curso save(Curso curso);
    EstudianteByCursoResponse findEstudianteByCursoId(Long idCurso);
}
