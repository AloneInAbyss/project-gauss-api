package com.universe.yellow.project.gauss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ProjectGaussApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectGaussApplication.class, args);
	}

}
