package com.revature.clientandmanagers;

public class Employee {

	private int id; 
	private String type;
	private String email;
	private String name; 
	private String password;
	private String user;
	

	public Employee() {
		super();
	}


	public Employee(int id, String type, String email, String name, String user) {
		super();
		this.id = id;
		this.type = type;
		this.email = email;
		this.name = name;
		this.user = user;
	}


	public Employee(int id, String type, String email, String name, String password, String user) {
		super();
		this.id = id;
		this.type = type;
		this.email = email;
		this.name = name;
		this.password = password;
		this.user = user;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", type=" + type + ", email=" + email + ", name=" + name + ", password="
				+ password + ", user=" + user + "]";
	}



	
}
