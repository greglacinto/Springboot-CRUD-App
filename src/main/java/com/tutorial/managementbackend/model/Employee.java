package com.tutorial.managementbackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="greg_employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "email", nullable = false)
    private String email;

}
