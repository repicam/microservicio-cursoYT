package com.repicam.microservicio_cursos.client;

import com.repicam.microservicio_cursos.dtos.EstudianteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "micro-estudiantes", url = "localhost:8000/api/estudiante") //nombre indicado en yml del microservicio a consultar
public interface EstudianteClient {

    @GetMapping("/curso/{idCurso}")
    List<EstudianteDto> findAllEstudianteByCursoId(@PathVariable Long idCurso);
}
