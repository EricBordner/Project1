package com.revature.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingClas {
	 static Logger logger = LogManager.getLogger(LoggingClas.class);
	 
	 public void loggingMethod() {
	     logger.debug("This is about to start HTTP requests on main method");
	 } // this ends LoggingMethod
	 public void loggingConnectionMethod() {
		 logger.info("The Connection to Database has been established");
	 } // this ends LoggingConnectionMethod
	 public void loggingConnectionError() {
		 logger.error("There has been an error with the connection to DB");
	 } // this ends LoggingConnectionError
	 public void loggingLogin(int id) {
		 logger.info("An employee has just logged in " + id);
	 }
	
}// this ends class LoggingClas
