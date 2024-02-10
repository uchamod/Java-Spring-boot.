package com.example.savemethodtest.Controller;

import com.example.savemethodtest.Service.services;
import com.example.savemethodtest.DTO.dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v2/method")
@CrossOrigin

public class SaveController {

    @GetMapping("/getdata")
    public String getdata(){
        return "succssesfully get the data";
    }

    @Autowired
    private services service;
   @PostMapping("/savedata")
    public dto postdata(@RequestBody dto userdto){

        return service.usersave(userdto);


    }

}
