package com.athome.Spring_Data_JPA.model;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "emp_address",
            joinColumns = { @JoinColumn( name = "emp_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "addr_id", referencedColumnName = "address_id")}
    )
    private Address address;

    public Employee() {
    }

    public Employee(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}