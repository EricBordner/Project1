package com.revature.service;

import java.util.List;

import com.revature.clientandmanagers.Employee;
import com.revature.dao.EmployeePostgressDAO;
import com.revature.dao.employeeDAO;

public class ServicePostgress implements ServiceInt {
	static employeeDAO dao = new EmployeePostgressDAO();
	
	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public boolean loginEmployee(Employee employeeObject) {
		return dao.loginEmployee(employeeObject);
	}

}
