package com.nagarro.employeeapi.service;

import java.util.List;

import com.nagarro.employeeapi.entities.Employee;


public interface EmployeeService {

	public List<Employee> getEmployee();

	public Employee getEmployee(Integer emp_Code);

	public Employee addEmployee(Employee emp_Code);

	public Employee updateEmployee(Employee emp_Code);

}
