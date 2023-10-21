package com.last.dioproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL") })
@SpringBootApplication
public class DioProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioProjectApplication.class, args);
	}

}
