package com.athome.Spring_Data_JPA.controller;

import com.athome.Spring_Data_JPA.model.Address;
import com.athome.Spring_Data_JPA.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }
}
