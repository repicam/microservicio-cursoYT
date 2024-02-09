package com.repicam.microservicio_cursos.dtos.httpResponse;

import com.repicam.microservicio_cursos.dtos.EstudianteDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteByCursoResponse {

    private String curso;
    private String profesor;
    private List<EstudianteDto> estudianteDtoList;
}