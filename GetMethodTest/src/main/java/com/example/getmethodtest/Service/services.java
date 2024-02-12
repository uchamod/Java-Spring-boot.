package com.example.getmethodtest.Service;


import com.example.getmethodtest.DTO.dto;
import com.example.getmethodtest.Entity.entities;
import com.example.getmethodtest.Repostory.repo;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class services {

    @Autowired
    private repo userrepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<dto> get(){
        List<entities> userdata=userrepo.findAll();

        return modelMapper.map(userdata,new TypeToken<List<dto>>(){}.getType());
    }

}
