package com.athome.Spring_Data_JPA.repository;

import com.athome.Spring_Data_JPA.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByAddress_AddressContainingIgnoreCase(String keyword);
}