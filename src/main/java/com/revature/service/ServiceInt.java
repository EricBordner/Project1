package com.revature.service;

import java.util.List;

import com.revature.clientandmanagers.Employee;

public interface ServiceInt {
	List<Employee> getAllEmployees();

	Employee loginEmployee(Employee employeeObject);
	
}
