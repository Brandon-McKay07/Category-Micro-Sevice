package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EnableJpaRepositories(basePackages = "com.repository")
@EntityScan(basePackages = "com.bean")
public class CategoryMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryMicroServiceApplication.class, args);
		System.out.println("Category Micro Service up!!");
	
	}

}
