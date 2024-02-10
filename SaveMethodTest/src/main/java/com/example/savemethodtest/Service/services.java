package com.example.savemethodtest.Service;

import com.example.savemethodtest.Entity.entities;
import com.example.savemethodtest.Repostory.repo;
import com.example.savemethodtest.DTO.dto;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class services {

    @Autowired
    private repo userrepo;
    @Autowired
    private ModelMapper modelMapper;

    public dto usersave(dto userdto){

        userrepo.save(modelMapper.map(userdto, entities.class));
        return userdto;
    }

}
