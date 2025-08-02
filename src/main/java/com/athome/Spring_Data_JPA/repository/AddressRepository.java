package com.athome.Spring_Data_JPA.repository;

import com.athome.Spring_Data_JPA.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}