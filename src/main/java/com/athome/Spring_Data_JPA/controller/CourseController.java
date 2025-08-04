package com.athome.Spring_Data_JPA.controller;

import com.athome.Spring_Data_JPA.model.Course;
import com.athome.Spring_Data_JPA.service.CourseServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseServise courseServise;

    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return courseServise.addCourse(course);
    }
}
