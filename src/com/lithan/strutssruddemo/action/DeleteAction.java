package com.lithan.strutssruddemo.action;

import com.lithan.strutssruddemo.dao.EmployeeDao;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {

	private String email;
	private String message;
	@Override
	public String execute() throws Exception {
		EmployeeDao dao=new EmployeeDao();
		int x=dao.deleteEmployee(email);
		
		if(x>0)
			message="deleted successfully";
		else
			message="error while deleting the records";
		
		return "result";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
