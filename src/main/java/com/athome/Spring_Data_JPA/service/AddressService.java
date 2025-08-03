package com.athome.Spring_Data_JPA.service;

import com.athome.Spring_Data_JPA.model.Address;
import com.athome.Spring_Data_JPA.model.Employee;
import com.athome.Spring_Data_JPA.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public void addAddress(Address address) {
        for(Employee emp : address.getEmployees()){
            emp.setAddress(address);
        }
        addressRepository.save(address);
    }
}
