package com.qudus.jpa;

import java.util.NoSuchElementException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepo repository) {
		return args -> {
			// Person person = new Person();
			Person person2 = new Person();
			person2.setName("John");

			// 	Saves the given entity.
			repository.save(person2);
			Person saved = repository.findById(person2.getId()).orElseThrow(NoSuchElementException::new);
			System.out.println(saved.getId());
			System.out.println(saved.getName());
		};
	}

}
