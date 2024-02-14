package com.example.deletemethodtest.Controller;

import com.example.deletemethodtest.DTO.dto;
import com.example.deletemethodtest.Service.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v5/deleteMethod")
@CrossOrigin

public class contril {

    @Autowired
    private services service;

    @DeleteMapping("/delete")
    public boolean delete(@RequestBody dto userdto){

       return service.deleteData(userdto);
    }
}
