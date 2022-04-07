package com.revature.main;

import com.revature.controllerhandler.EmployeeController;
import com.revature.logging.LoggingClas;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class mainMethod {
	public static void main(String[] args) {
		Javalin app = Javalin.create(ctx->{ ctx.enableCorsForAllOrigins(); ctx.addStaticFiles("/web", Location.CLASSPATH);}).start();
		//app = Javalin.create(ctx-> {ctx.addStaticFiles("/web", Location.CLASSPATH);});
		//app.start();
		LoggingClas log = new LoggingClas();
		log.LoggingMethod();
		app.get("/employees", EmployeeController.getAllEmployees);
		app.post("/secondlogin", EmployeeController.loginEmployee);
		
		
		//making a change to check Github
	}
}
