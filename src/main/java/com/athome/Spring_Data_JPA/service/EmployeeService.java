package com.athome.Spring_Data_JPA.service;

import com.athome.Spring_Data_JPA.model.Employee;
import com.athome.Spring_Data_JPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(int id, Employee employeeDetails) {
        Employee employee = getEmployeeById(id);
        employee.setName(employeeDetails.getName());
        employee.setAge(employeeDetails.getAge());
        employee.setAddress(employeeDetails.getAddress());
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        employeeRepository.delete(employee);
    }

    public List<Employee> searchByAddress(String keyword) {
        return employeeRepository.findByAddress_AddressContainingIgnoreCase(keyword);
    }

}