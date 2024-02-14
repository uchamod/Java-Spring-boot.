package com.example.deletemethodtest.Service;

import com.example.deletemethodtest.DTO.dto;
import com.example.deletemethodtest.Entity.entities;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.deletemethodtest.Repostory.repo;

@Service
@Transactional

public class services {

    @Autowired
    private repo repo;

    @Autowired
    private ModelMapper modelmapper;

    public boolean deleteData(dto userdto){

        repo.delete(modelmapper.map(userdto, entities.class));
        return true;
    }

}
