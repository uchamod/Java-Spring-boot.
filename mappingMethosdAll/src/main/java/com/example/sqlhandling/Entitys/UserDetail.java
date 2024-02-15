package com.example.sqlhandling.Entitys;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserDetail {

    @Id
    private int userId;
    private String userName;
    private String userAddress;
    private int age;
}
