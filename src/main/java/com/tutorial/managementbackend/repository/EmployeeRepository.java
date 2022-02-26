package com.tutorial.managementbackend.repository;

import com.tutorial.managementbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // EmployeeRepository now has CRUD functions from Jpa
}
