package com.example.sqlhandling.Service;


import com.example.sqlhandling.DTO.Dto;
import com.example.sqlhandling.Entitys.UserDetail;
import com.example.sqlhandling.Repostory.repo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class Services {

    @Autowired
    private repo repo;


    @Autowired
    private ModelMapper modelmapper;

    public String savedata(Dto dto){
          try {
              repo.save(modelmapper.map(dto, UserDetail.class));
              return "Querry insert succsussfuly";
          }catch (Exception e){
              return "Qurrey insert failed :"+e;
          }

    }

    public List<Dto> getdata(){

            List<UserDetail> details=repo.findAll();
            return modelmapper.map(details,new TypeToken<List<Dto>>(){}.getType());


    }

    public String updatadata(Dto dto){
        try{
            repo.save(modelmapper.map(dto, UserDetail.class));
            return "Querry Updated succsussfuly";
        }catch (Exception e){
            return "Querry not updated :"+e;
        }

    }

    public String deletdata(Dto dto){
        try{
            repo.delete(modelmapper.map(dto,UserDetail.class));
            return "Querry deleted succsussfuly";
        }catch (Exception e){
            return "Querry not deleted :"+e;
        }

    }
}



