package com.repicam.microservicio_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicioEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioEurekaApplication.class, args);
	}

}
