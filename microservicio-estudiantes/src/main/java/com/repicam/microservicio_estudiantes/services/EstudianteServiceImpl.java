package com.repicam.microservicio_estudiantes.services;

import com.repicam.microservicio_estudiantes.entities.Estudiante;
import com.repicam.microservicio_estudiantes.persistence.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> findAll() {
        return (List<Estudiante>) estudianteRepository.findAll();
    }

    @Override
    public Estudiante findById(Long id) {
        return estudianteRepository.findById(id).orElseThrow();
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> findByIdCurso(Long cursoId) {
        return estudianteRepository.findAllByCursoId(cursoId);
    }
}
