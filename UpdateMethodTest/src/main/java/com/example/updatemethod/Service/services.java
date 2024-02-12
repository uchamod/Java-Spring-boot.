package com.example.updatemethod.Service;


import com.example.updatemethod.DTO.dto;
import com.example.updatemethod.Entity.entities;
import com.example.updatemethod.Repostory.repo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class services {
    @Autowired
    private repo repo;

    @Autowired
    private ModelMapper modelmapper;

    public dto updateData(dto userdto){

        repo.save(modelmapper.map(userdto, entities.class));
        return userdto;

    }

}
