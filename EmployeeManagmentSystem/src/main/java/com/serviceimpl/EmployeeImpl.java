package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repo.EmployeeRepo;
import com.services.EmployeeServices;

@Service
public class EmployeeImpl implements EmployeeServices {
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub

		return employeeRepo.findById(id).get();
	}

	@Override
	public List<Employee> allEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee UpdateEmployee(int id, Employee e) {
		// TODO Auto-generated method stub
		return employeeRepo.save(e);
	}

	@Override
	public void DeleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);

	}

}
