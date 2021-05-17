package com.nagarro.employeeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.employeeapi.entities.Employee;
import com.nagarro.employeeapi.service.EmployeeService;



@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	// get the employee details
	@GetMapping("/employee")
	public List<Employee> getEmployee() {

		return this.empService.getEmployee();

	}

	@GetMapping("/employee/{emp_Code}")
	public Employee getEmployee(@PathVariable Integer emp_Code) {

		return this.empService.getEmployee(emp_Code);

	}

	// add employee- PUT request
	@PostMapping("employee")
	public Employee addEmployee(@RequestBody Employee emp_Code) {

		return this.empService.addEmployee(emp_Code);

	}

	// update employee using PUT request
	@PutMapping("employee/{emp_Code}")
	public Employee updateEmployee(@RequestBody Employee emp_Code) {

		return this.empService.updateEmployee(emp_Code);

	}

}
