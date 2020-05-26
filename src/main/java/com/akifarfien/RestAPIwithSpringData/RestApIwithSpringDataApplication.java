package com.akifarfien.RestAPIwithSpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RestApIwithSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApIwithSpringDataApplication.class, args);
	}

}
