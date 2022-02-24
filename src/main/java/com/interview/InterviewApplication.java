package com.interview;

import com.interview.entity.UserEntity;
import com.interview.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveUser(new UserEntity("Claudia", "Claudia@gmail.com", "12345"));
			userService.saveUser(new UserEntity("Gheorghe", "Gheorghe@gmail.com", "54321"));
		};
	}

}
