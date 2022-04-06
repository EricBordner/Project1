package com.revature.controllerhandler;

import java.util.List;

import com.revature.clientandmanagers.Employee;
import com.revature.service.ServiceInt;
import com.revature.service.ServicePostgress;

import io.javalin.http.Handler;

public class EmployeeController {
	static ServiceInt service = new ServicePostgress(); 
	
	public static Handler getAllEmployees = ctx-> {
		List<Employee> eList = service.getAllEmployees();
		ctx.json(eList);
	};
	public static Handler loginEmployee = ctx-> {
		Employee employeeObject = ctx.bodyAsClass(Employee.class);
		Employee login = service.loginEmployee(employeeObject);
		ctx.json(login);
	};
}
