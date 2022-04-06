package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.clientandmanagers.Employee;
import com.revature.connection.ConnectionUtility;

public class EmployeePostgressDAO implements employeeDAO {

	public List<Employee> getAllEmployees() {
		Connection conn = ConnectionUtility.createConnection();
		String selectEmployees = "select * from employee";
		ArrayList<Employee> eList = new ArrayList<Employee>();
		Employee em; 
		try {
			PreparedStatement ptsmt = conn.prepareStatement(selectEmployees);
			ResultSet rs;
			rs = ptsmt.executeQuery();
				while (rs.next()) {
					int id = rs.getInt("user_id");
					String type = rs.getString("employeetype");
					String email = rs.getString("email");
					String name = rs.getString("full_name");
					String password = rs.getString("password");
					String user = rs.getString("username");
					em = new Employee (id, type, email, name, password, user);
					eList.add(em);
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return eList;
	}

	public boolean loginEmployee(Employee employeeObject) {
		boolean returnValue = false; 
		String selectEmployees = "select * from employee";
		try (Connection conn = ConnectionUtility.createConnection();){
			PreparedStatement ptsmt = conn.prepareStatement(selectEmployees);
			ResultSet rs;
			rs = ptsmt.executeQuery();
			String employeeUsername = employeeObject.getUser();
			String employeePassword = employeeObject.getPassword();
				while (rs.next()) {
					int id = rs.getInt("user_id");
					String type = rs.getString("employeetype");
					String password = rs.getString("password");
					String user = rs.getString("username"); 
					if (employeeUsername.equals(user) && employeePassword.equals(password)) {
						returnValue = true;
						break; //ends while loop
					};
						
					}//ends while
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return returnValue;
	}

}

