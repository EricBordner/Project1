package com.revature.main;

import com.revature.controllerhandler.EmployeeController;
import com.revature.logging.LoggingClas;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class mainMethod {
	public static void main(String[] args) {
		Javalin app = Javalin.create(ctx->{ ctx.enableCorsForAllOrigins(); ctx.addStaticFiles("/web", Location.CLASSPATH);}).start();
		LoggingClas log = new LoggingClas();
		log.loggingMethod();
		app.get("/employees", EmployeeController.getAllEmployees);
		app.post("/second", EmployeeController.loginEmployee);
		app.post("/reimbursementEmployee", EmployeeController.reimbursementEmployee);
		
		//making a change to check Github
	}
}
