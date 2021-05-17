package com.nagarro.employeeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employeeapi.dao.EmployeeDao;
import com.nagarro.employeeapi.entities.Employee;



@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}

	@Override
	public Employee getEmployee(Integer emp_Code) {
		// TODO Auto-generated method stub
		return empDao.getOne(emp_Code);
	}

	@Override
	public Employee addEmployee(Employee emp_Code) {
		// TODO Auto-generated method stub
		empDao.save(emp_Code);
		return emp_Code;
	}

	@Override
	public Employee updateEmployee(Employee emp_Code) {
		// TODO Auto-generated method stub
		empDao.save(emp_Code);
		return emp_Code;
	}

}
