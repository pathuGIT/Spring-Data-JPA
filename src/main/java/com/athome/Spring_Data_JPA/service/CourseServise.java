package com.athome.Spring_Data_JPA.service;

import com.athome.Spring_Data_JPA.model.Course;
import com.athome.Spring_Data_JPA.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServise {
    @Autowired
    private CourseRepository courseRepository;


    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
}
