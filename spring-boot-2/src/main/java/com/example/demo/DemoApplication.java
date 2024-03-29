package com.example.demo;

import com.lib.LibModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.BeanPropertyBindingResult;
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
            LibModel objectToValidate = LibModel.builder().build();
            Errors errors = new BeanPropertyBindingResult(objectToValidate, "objectName");
            validator.validate(objectToValidate, errors);
            log.info(MessageFormat.format("Has error: {0}", errors.hasErrors()));
        };
    }

}
