package com.example.getmethodtest.Repostory;

import com.example.getmethodtest.Entity.entities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<entities,Integer> {
}
