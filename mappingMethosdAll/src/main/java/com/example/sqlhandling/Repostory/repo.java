package com.example.sqlhandling.Repostory;

import com.example.sqlhandling.Entitys.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<UserDetail,Integer> {

}
