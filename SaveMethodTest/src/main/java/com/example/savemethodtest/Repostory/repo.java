package com.example.savemethodtest.Repostory;

import com.example.savemethodtest.Entity.entities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<entities,Integer> {

}
