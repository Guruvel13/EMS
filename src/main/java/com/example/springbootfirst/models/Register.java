package com.example.springbootfirst.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Register {

    private int empid;
    private String empName;
    private String email;
    private String password;
    private String gender;
    private LocalDate dob;
}
