package com.example.sqlhandling;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqlHandlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlHandlingApplication.class, args);
    }
    @Bean
    public ModelMapper modelmapper(){
        return new ModelMapper();
    }
}

