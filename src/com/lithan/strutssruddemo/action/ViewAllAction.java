package com.lithan.strutssruddemo.action;

import java.util.List;

import com.lithan.strutssruddemo.dao.EmployeeDao;
import com.lithan.strutssruddemo.model.Employee;
import com.opensymphony.xwork2.ActionSupport;

public class ViewAllAction extends ActionSupport{

	List<Employee> list;
	@Override
	public String execute() throws Exception {
		EmployeeDao dao=new EmployeeDao();
		list=dao.getAllEmployees();
		
		return "result";
	}
	public List<Employee> getList() {
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	
}
