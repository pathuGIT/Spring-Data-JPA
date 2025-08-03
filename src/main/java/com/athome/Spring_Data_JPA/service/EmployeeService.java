package com.athome.Spring_Data_JPA.service;

import com.athome.Spring_Data_JPA.model.Address;
import com.athome.Spring_Data_JPA.model.Employee;
import com.athome.Spring_Data_JPA.repository.AddressRepository;
import com.athome.Spring_Data_JPA.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Transactional
    public void addEmpToCurrAddress(int id, Employee employee) {
        Address address = addressRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Not found this address Id.."));

        //employee.setAddress(address);
        address.addEmployee(employee);
        employeeRepository.save(employee);

    }

}
