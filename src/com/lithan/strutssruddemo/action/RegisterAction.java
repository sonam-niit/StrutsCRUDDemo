package com.lithan.strutssruddemo.action;


import com.lithan.strutssruddemo.dao.EmployeeDao;
import com.lithan.strutssruddemo.model.Employee;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	private Employee employee=new Employee();
	private String message;
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String execute() throws Exception {
		EmployeeDao dao=new EmployeeDao();
		int x=dao.addEmployee(employee);
		
		if(x>0)
			message="successfully Registered";
		else
			message="error while registration, try after some time";
		
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
