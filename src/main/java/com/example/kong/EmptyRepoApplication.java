package com.example.kong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmptyRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmptyRepoApplication.class, args);
	}

}
