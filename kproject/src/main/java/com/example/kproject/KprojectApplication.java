package com.example.kproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@CrossOrigin(origins = "http://localhost:3000/")
@EntityScan(basePackages="entity")
@EnableJpaRepositories(basePackages ="repository")
@ComponentScan(basePackages = {"repository", "entity", "controller", "services", "com.example.kproject"})
public class KprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KprojectApplication.class, args);
	}

}
