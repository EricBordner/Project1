package com.revature.controllerhandler;

import java.util.List;

import com.revature.clientandmanagers.Employee;
import com.revature.clientandmanagers.Expense;
import com.revature.logging.LoggingClas;
import com.revature.service.ServiceInt;
import com.revature.service.ServicePostgress;

import io.javalin.http.Handler;

public class EmployeeController {
	static ServiceInt service = new ServicePostgress(); 
	static LoggingClas log = new LoggingClas();
	//add comments
	// End Point /employees
	public static Handler getAllEmployees = ctx-> {
		List<Employee> eList = service.getAllEmployees();
		ctx.json(eList);
	};
	public static Handler loginEmployee = ctx-> {
		Employee employeeObject = ctx.bodyAsClass(Employee.class);
		Employee login = service.loginEmployee(employeeObject);
		ctx.json(login);
		log.loggingLogin(employeeObject.getId());
	};
	
	public static Handler reimbursementEmployee = ctx-> {
		String formAmount= ctx.formParam("amount");
		String formRT= ctx.formParam("reimbursementtype");
		String formDescription = ctx.formParam("description");
		//Expense reimbursementForm =service.reimbursementEmployee(formAmount, formRT, formDescription);
		service.reimbursementEmployee(formAmount, formRT, formDescription);
		//ctx.json(reimbursementEmployee);
		//put a log here....
	};
	
} // this ends class
