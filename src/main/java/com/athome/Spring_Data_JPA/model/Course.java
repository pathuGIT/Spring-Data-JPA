package com.athome.Spring_Data_JPA.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int credit;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    @JsonBackReference       // ← prevents serializing back into EmpCourse.course
    private Set<EmpCourse> empCourses = new HashSet<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Set<EmpCourse> getEmpCourses() {
        return empCourses;
    }

    public void setEmpCourses(Set<EmpCourse> empCourses) {
        this.empCourses = empCourses;
    }
}
