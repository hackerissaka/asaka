package com.cg.equipTrack.EquipTrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.cg.equipTrack.repo")
@EntityScan("com.cg.equipTrack.Bean")
@ComponentScan("com.cg.equipTrack")
@SpringBootApplication
public class EquipTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipTrackApplication.class, args);
	}
}
