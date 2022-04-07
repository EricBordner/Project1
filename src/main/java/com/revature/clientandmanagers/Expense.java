package com.revature.clientandmanagers;

public class Expense {
	private int reimbursementid;
	private boolean accepted;
	private double amount;
	private String description; 
	private String reimbursementtype;
	private String resolvetime;
	private boolean resolved;
	private String submittime;
	private int authorid;
	private int resolverid;
	
	
	public Expense() {
		super();
	}

	
	
	
	public Expense(double amount, String description, String reimbursementtype) {
		super();
		this.amount = amount;
		this.description = description;
		this.reimbursementtype = reimbursementtype;
	}




	public Expense(int reimbursementid, double amount, String description, String reimbursementtype) {
		super();
		this.reimbursementid = reimbursementid;
		this.amount = amount;
		this.description = description;
		this.reimbursementtype = reimbursementtype;
	}



	public Expense(int reimbursementid, boolean accepted, double amount, String reimbursementtype, String resolvetime,
			boolean resolved, String submittime, int authorid, int resolverid) {
		super();
		this.reimbursementid = reimbursementid;
		this.accepted = accepted;
		this.amount = amount;
		this.reimbursementtype = reimbursementtype;
		this.resolvetime = resolvetime;
		this.resolved = resolved;
		this.submittime = submittime;
		this.authorid = authorid;
		this.resolverid = resolverid;
	}



	public Expense(int reimbursementid, boolean accepted, double amount, String description, String reimbursementtype,
			String resolvetime, boolean resolved, String submittime, int authorid, int resolverid) {
		super();
		this.reimbursementid = reimbursementid;
		this.accepted = accepted;
		this.amount = amount;
		this.description = description;
		this.reimbursementtype = reimbursementtype;
		this.resolvetime = resolvetime;
		this.resolved = resolved;
		this.submittime = submittime;
		this.authorid = authorid;
		this.resolverid = resolverid;
	}




	public int getReimbursementid() {
		return reimbursementid;
	}




	public void setReimbursementid(int reimbursementid) {
		this.reimbursementid = reimbursementid;
	}




	public boolean isAccepted() {
		return accepted;
	}




	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}




	public double getAmount() {
		return amount;
	}




	public void setAmount(double amount) {
		this.amount = amount;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getReimbursementtype() {
		return reimbursementtype;
	}




	public void setReimbursementtype(String reimbursementtype) {
		this.reimbursementtype = reimbursementtype;
	}




	public String getResolvetime() {
		return resolvetime;
	}




	public void setResolvetime(String resolvetime) {
		this.resolvetime = resolvetime;
	}




	public boolean isResolved() {
		return resolved;
	}




	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}




	public String getSubmittime() {
		return submittime;
	}




	public void setSubmittime(String submittime) {
		this.submittime = submittime;
	}




	public int getAuthorid() {
		return authorid;
	}




	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}




	public int getResolverid() {
		return resolverid;
	}




	public void setResolverid(int resolverid) {
		this.resolverid = resolverid;
	}




	@Override
	public String toString() {
		return "Expense [reimbursementid=" + reimbursementid + ", accepted=" + accepted + ", amount=" + amount
				+ ", description=" + description + ", reimbursementtype=" + reimbursementtype + ", resolvetime="
				+ resolvetime + ", resolved=" + resolved + ", submittime=" + submittime + ", authorid=" + authorid
				+ ", resolverid=" + resolverid + "]";
	}
	
		
	
	
	
}
