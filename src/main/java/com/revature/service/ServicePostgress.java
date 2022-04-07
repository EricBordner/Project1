package com.revature.service;

import java.util.List;

import com.revature.clientandmanagers.Employee;
import com.revature.clientandmanagers.Expense;
import com.revature.dao.EmployeePostgressDAO;
import com.revature.dao.employeeDAO;

public class ServicePostgress implements ServiceInt {
	static employeeDAO dao = new EmployeePostgressDAO();
	
	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public Employee loginEmployee(Employee employeeObject) {
		return dao.loginEmployee(employeeObject);
	}

	@Override
	public void reimbursementEmployee(String formAmount, String formRT, String formDescription) {
		//Expense reimbursementEmployee = new Expense();
		dao.reimbursementEmployee(formAmount, formRT, formDescription);
		//return reimbursementEmployee; 
		
		
	}

}
