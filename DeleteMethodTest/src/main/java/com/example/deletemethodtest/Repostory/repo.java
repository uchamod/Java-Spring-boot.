package com.example.deletemethodtest.Repostory;

import com.example.deletemethodtest.Entity.entities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<entities,Integer> {
}
