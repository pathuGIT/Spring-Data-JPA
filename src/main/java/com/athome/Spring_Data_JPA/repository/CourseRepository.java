package com.athome.Spring_Data_JPA.repository;

import com.athome.Spring_Data_JPA.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.InterfaceAddress;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
