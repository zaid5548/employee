package com.nagarro.employeeapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nagarro.employeeapi.entities.Employee;


@EnableJpaRepositories
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
