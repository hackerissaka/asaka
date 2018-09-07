package com.cg.project.NewProjectWithSpringBDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cg.project")
@ComponentScan("com.cg.project")
@EnableJpaRepositories("com.cg.project")
public class NewProjectWithSpringBddApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewProjectWithSpringBddApplication.class, args);
	}
}
