package com.example.personproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PersonProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonProjectApplication.class, args);
    }

}
