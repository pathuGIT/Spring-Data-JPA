package com.athome.Spring_Data_JPA.controller;

import com.athome.Spring_Data_JPA.model.EmpCourse;
import com.athome.Spring_Data_JPA.service.EmpCourseServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enroll")
public class EmpCourseController {
    @Autowired
    private EmpCourseServise empCourseServise;

    @PostMapping
    public EmpCourse enroll(@RequestParam int empId, @RequestParam int couId){
        System.out.println("t 1");
        return empCourseServise.enroll(empId, couId);
    }
}
