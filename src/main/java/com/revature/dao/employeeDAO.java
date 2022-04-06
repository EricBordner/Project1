package com.revature.dao;

import java.util.List;

import com.revature.clientandmanagers.Employee;

public interface employeeDAO {
	List<Employee> getAllEmployees();

	boolean loginEmployee(Employee employeeObject);
	
	
}
