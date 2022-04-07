package com.revature.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingClas {
	 static Logger logger = LogManager.getLogger(LoggingClas.class);
	 
	 public void LoggingMethod() {
	     logger.debug("This is about to start HTTP requests on main method");
} // this ends LoggingMethod
}// this ends class LoggingClas
