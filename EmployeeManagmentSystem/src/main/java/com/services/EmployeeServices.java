package com.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Employee;

@Service
public interface EmployeeServices {
	Employee addEmployee(Employee employee);
	Employee getEmployee(int id);
	List<Employee>allEmployee();
	Employee UpdateEmployee(int id,Employee e);
	void DeleteEmployee(int id);

}
