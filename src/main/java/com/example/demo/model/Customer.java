package com.example.demo.model;

import com.example.demo.enumaration.Gender;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @CsvBindByName(required = true)
    private String name;
    @CsvBindByName(column = "Email")
    private String email;
    @CsvBindByName(required = true)
    private String department;
    @CsvBindByName(required = true)
    private Gender gender;
}
