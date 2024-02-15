package com.example.sqlhandling.Controller;


import com.example.sqlhandling.DTO.Dto;
import com.example.sqlhandling.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/newVersion/controller")
@CrossOrigin

public class Control {

    @Autowired
    private Services service;

    @PostMapping("/saveData")
    public String post(@RequestBody Dto dto){
        return service.savedata(dto);
    }

    @GetMapping("/getData")
    public List<Dto> get(){
        return service.getdata();
    }

    @PutMapping("/putData")
    public String put(@RequestBody Dto dto){

        return service.updatadata(dto);
    }

    @DeleteMapping("/deleteData")
    public String delete(@RequestBody Dto dto){
        return service.deletdata(dto);
    }
}
