package com.example.demo;

import com.example.demo.service.CSVService;

public class DemoApplication {

    public static void main(String[] args) throws Exception {
        CSVService.writeToCSV();
        CSVService.readFromCSV();
    }

}
