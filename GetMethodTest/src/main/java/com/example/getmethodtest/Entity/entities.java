package com.example.getmethodtest.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data

public class entities {

    @Id
    private int userId;
    private String userName;
    private int userAge;
}
