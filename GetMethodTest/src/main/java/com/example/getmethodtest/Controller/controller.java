package com.example.getmethodtest.Controller;


import com.example.getmethodtest.DTO.dto;
import com.example.getmethodtest.Service.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v3/getpackage")
@CrossOrigin

public class controller {
    @Autowired
    private services service;

    @GetMapping("/getdata")
    public List<dto> get(){

        return service.get();

    }

}
