package com.revature.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	public static Connection createConnection() {
		try {
			Connection conn;
			conn = DriverManager.getConnection(System.getenv("SQL_PROJECTONE"));
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	} //this ends method createConnection
}
