package com.revature.main;

import com.revature.controllerhandler.EmployeeController;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class mainMethod {
	public static void main(String[] args) {
		Javalin app = Javalin.create(ctx->{ ctx.enableCorsForAllOrigins(); ctx.addStaticFiles("/web", Location.CLASSPATH);}).start();
		//app = Javalin.create(ctx-> {ctx.addStaticFiles("/web", Location.CLASSPATH);});
		//app.start();
		
		app.get("/employees", EmployeeController.getAllEmployees);
		app.post("/login", EmployeeController.loginEmployee);
		
		
		
	}
}
