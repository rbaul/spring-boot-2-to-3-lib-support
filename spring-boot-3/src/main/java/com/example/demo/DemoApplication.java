package com.example.demo;

import com.lib.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.text.MessageFormat;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(Validator validator) {
		return args -> {
			Errors errors = validator.validateObject(LibModel.builder().build());
			log.info(MessageFormat.format("Has error: {0}", errors.hasErrors()));
		};
    }

}
