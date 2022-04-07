package com.revature.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.revature.logging.LoggingClas;

public class ConnectionUtility {
	static LoggingClas log = new LoggingClas();
	public static Connection createConnection() {
		try {
			Connection conn;
			conn = DriverManager.getConnection(System.getenv("SQL_PROJECTONE"));
			log.loggingConnectionMethod();
			return conn;
		} catch (SQLException e) {
			log.loggingConnectionError();
			e.printStackTrace();
			return null;
		}
	} //this ends method createConnection
}
