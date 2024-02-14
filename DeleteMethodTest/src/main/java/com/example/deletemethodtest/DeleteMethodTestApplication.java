package com.example.deletemethodtest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeleteMethodTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeleteMethodTestApplication.class, args);
    }
    @Bean
    public ModelMapper modelmapper(){
        return new ModelMapper();
    }
}
