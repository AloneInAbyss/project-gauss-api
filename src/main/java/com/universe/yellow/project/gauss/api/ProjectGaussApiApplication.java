package com.universe.yellow.project.gauss.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ProjectGaussApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectGaussApiApplication.class, args);
	}

}
