package com.athome.Spring_Data_JPA.service;

import com.athome.Spring_Data_JPA.model.Employee;
import com.athome.Spring_Data_JPA.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee addEmp(Employee employee) {
        return employeeRepository.save(employee);
    }
}
