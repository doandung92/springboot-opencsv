package com.example.demo.service;

import com.example.demo.enumaration.Gender;
import com.example.demo.model.Customer;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;

public class CSVService {

    public static void writeToCSV() throws Exception {
        List<Customer> customers = List.of(
                new Customer("Cus1", "abc@gmail.com", "CMC", Gender.MALE),
                new Customer("Cus2", "kaka@gmail.com", "CMC", Gender.FEMALE)
        );
        Writer writer = new FileWriter("customers.csv");
        StatefulBeanToCsv<Customer> beanToCsv = new StatefulBeanToCsvBuilder<Customer>(writer).build();
        beanToCsv.write(customers);
        writer.close();
    }

    public static void readFromCSV() throws Exception {
        List<Customer> customers = new CsvToBeanBuilder<Customer>(new FileReader("customers.csv"))
                .withType(Customer.class)
                .build()
                .parse();

        System.out.println(customers);
    }
}
