package com.repicam.microservicio_estudiantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //no obligatorio
@SpringBootApplication
public class MicroservicioEstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioEstudiantesApplication.class, args);
	}

}
