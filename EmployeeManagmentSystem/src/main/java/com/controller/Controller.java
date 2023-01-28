package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.services.EmployeeServices;

@RestController
public class Controller {
	@Autowired
	private EmployeeServices employeeServices;

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeServices.addEmployee(employee);
	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeServices.getEmployee(id);
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeServices.allEmployee();
	}

	@PutMapping("update/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return employeeServices.UpdateEmployee(id, employee);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeServices.DeleteEmployee(id);
	}
}
