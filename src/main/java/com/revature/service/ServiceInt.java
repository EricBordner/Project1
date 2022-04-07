package com.revature.service;

import java.util.List;

import com.revature.clientandmanagers.Employee;
import com.revature.clientandmanagers.Expense;

public interface ServiceInt {
	List<Employee> getAllEmployees();

	Employee loginEmployee(Employee employeeObject);

	//Expense reimbursementEmployee(String formAmount, String formRT, String formDescription);
	void reimbursementEmployee(String formAmount, String formRT, String formDescription);
}
