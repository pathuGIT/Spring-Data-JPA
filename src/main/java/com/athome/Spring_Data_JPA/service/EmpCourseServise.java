package com.athome.Spring_Data_JPA.service;

import com.athome.Spring_Data_JPA.model.Course;
import com.athome.Spring_Data_JPA.model.EmpCourse;
import com.athome.Spring_Data_JPA.model.Employee;
import com.athome.Spring_Data_JPA.repository.CourseRepository;
import com.athome.Spring_Data_JPA.repository.EmpCourseRepository;
import com.athome.Spring_Data_JPA.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpCourseServise {
    @Autowired
    private EmpCourseRepository empCourseRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CourseRepository courseRepository;

    @Transactional
    public EmpCourse enroll(int empId, int couId) {
        System.out.println("t 2");
        Course course = courseRepository.findById(couId)
                .orElseThrow(()-> new IllegalArgumentException("Not found this course id: " + couId));

        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(()-> new IllegalArgumentException("Not pound this emp id: " + empId));

        System.out.println("t 3");
        EmpCourse ec = new EmpCourse();
        ec.setCourse(course);
        ec.setEmployee(employee);


        return empCourseRepository.save(ec);

    }
}
