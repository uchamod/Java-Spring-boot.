package com.example.updatemethod.Controller;


import com.example.updatemethod.DTO.dto;
import com.example.updatemethod.Service.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v4/updateMethod")
@CrossOrigin

public class control {

    @Autowired
    private services service;

    @PutMapping("/put")
    public dto update(@RequestBody dto userdto){

        return service.updateData(userdto);
    }


}
