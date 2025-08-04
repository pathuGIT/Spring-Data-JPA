package com.athome.Spring_Data_JPA.controller;

import com.athome.Spring_Data_JPA.model.Employee;
import com.athome.Spring_Data_JPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmp(@RequestBody Employee employee){
        return employeeService.addEmp(employee);
    }

}
