package com.example.sqlhandling.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Dto {

    private int userId;
    private String userName;
    private String userAddress;
    private int age;
}
