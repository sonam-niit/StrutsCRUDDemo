package com.lithan.strutssruddemo.model;

public class Employee {

	/**
	* uname: username for employee
	* explain its unique
	*/
	private String uname;
	private String uemail;
	private String upass;
	private String udeg;
	
	//default constructor
	public Employee()
	{
		
	}
	//parameterized constructor
	public Employee(String uname, String uemail, String upass, String udeg) {
		super();
		this.uname = uname;
		this.uemail = uemail;
		this.upass = upass;
		this.udeg = udeg;
	}
	//getters & setters
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUdeg() {
		return udeg;
	}
	public void setUdeg(String udeg) {
		this.udeg = udeg;
	}
	@Override
	public String toString() {
		return "Employee [uname=" + uname + ", uemail=" + uemail + ", upass=" + upass + ", udeg=" + udeg + "]";
	}
	
	
}
