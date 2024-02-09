package com.repicam.microservicio_estudiantes.persistence;

import com.repicam.microservicio_estudiantes.entities.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {

    List<Estudiante> findAllByCursoId(Long idCurso);

}
