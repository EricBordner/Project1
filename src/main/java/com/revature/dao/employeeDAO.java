package com.revature.dao;

import java.util.List;

import com.revature.clientandmanagers.Employee;
import com.revature.clientandmanagers.Expense;

public interface employeeDAO {
	List<Employee> getAllEmployees();

	 Employee loginEmployee(Employee employeeObject);

	void reimbursementEmployee(String formAmount, String formRT, String formDescription);
	
	
}
