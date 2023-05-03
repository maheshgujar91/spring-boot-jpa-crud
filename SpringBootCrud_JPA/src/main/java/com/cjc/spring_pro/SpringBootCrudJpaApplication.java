package com.cjc.spring_pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootCrudJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudJpaApplication.class, args);
	}

}
