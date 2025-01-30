package com.ygornacif.loans_api;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "YgorBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ygor Nacif",
						email = "ygor.nacif31@gmail.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "YgorBanl Loans microservice REST API Documentation"
		)
)
public class LoansApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApiApplication.class, args);
	}

}
