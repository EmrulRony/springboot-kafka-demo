package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee) {
        System.out.println(employee.getFirstName());
    }
}
