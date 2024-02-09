package com.repicam.microservicio_cursos.persistence;

import com.repicam.microservicio_cursos.entities.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long> {
}
