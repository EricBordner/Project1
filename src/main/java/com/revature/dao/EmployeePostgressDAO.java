package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.clientandmanagers.Employee;
import com.revature.clientandmanagers.Expense;
import com.revature.connection.ConnectionUtility;
import com.revature.logging.LoggingClas;

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

	public Employee loginEmployee(Employee employeeObject) {
		boolean returnValue = false; 
		Employee employeeObjectReturn = new Employee(); 
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
						employeeObjectReturn.setUser(employeeUsername);
						employeeObjectReturn.setPassword(employeePassword);
						employeeObjectReturn.setType(type);
						//returnValue = true;
						break; //ends while loop
					};
						
					}//ends while
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return employeeObjectReturn;
	}

	@Override
	public void reimbursementEmployee(String formAmount, String formRT, String formDescription) {
		         LoggingClas log = new LoggingClas();
		         System.out.println("In the DAO postgress");
			String insertFormData = "INSERT INTO manager(reimbursementid, amount,description,reimbursementtype) VALUES(?,?,?,?)";
			try (Connection conn = ConnectionUtility.createConnection();){
				PreparedStatement ptsmt = conn.prepareStatement(insertFormData);
				ptsmt.setInt(1, 100);
				ptsmt.setFloat(2,Float.parseFloat(formAmount));
				ptsmt.setString(3, formRT);
				ptsmt.setString(4, formDescription);
			
				ptsmt.executeQuery();
				System.out.println("In the try in DAO " +formAmount+ " " + formRT + " " +formDescription);
				log.loggingTroubleShoot();
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		
	}

}

