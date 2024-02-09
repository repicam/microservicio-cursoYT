package com.repicam.microservicio_cursos.services;

import com.repicam.microservicio_cursos.client.EstudianteClient;
import com.repicam.microservicio_cursos.dtos.EstudianteDto;
import com.repicam.microservicio_cursos.dtos.httpResponse.EstudianteByCursoResponse;
import com.repicam.microservicio_cursos.entities.Curso;
import com.repicam.microservicio_cursos.persistence.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private EstudianteClient estudianteClient;

    @Override
    public List<Curso> findAll() {
        return (List<Curso>) cursoRepository.findAll();
    }

    @Override
    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElseThrow();
    }

    @Override
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public EstudianteByCursoResponse findEstudianteByCursoId(Long idCurso) {
        Curso curso = cursoRepository.findById(idCurso).orElse(new Curso());

        List<EstudianteDto> estudianteDtoList = estudianteClient.findAllEstudianteByCursoId(idCurso);

        return EstudianteByCursoResponse.builder()
                .curso(curso.getNombre())
                .profesor(curso.getProfesor())
                .estudianteDtoList(estudianteDtoList)
                .build();
    }
}
