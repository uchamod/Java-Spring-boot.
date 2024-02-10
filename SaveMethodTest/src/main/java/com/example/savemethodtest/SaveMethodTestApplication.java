package com.example.savemethodtest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SaveMethodTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaveMethodTestApplication.class, args);
    }
    @Bean
    public ModelMapper modelmapper(){
        return new ModelMapper();
    }
}
