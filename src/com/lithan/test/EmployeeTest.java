package com.lithan.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import com.lithan.strutssruddemo.dao.EmployeeDao;
import com.lithan.strutssruddemo.model.Employee;

class EmployeeTest {

//	@Test
//	void testAddEmployee()
//	{
//		EmployeeDao dao=new EmployeeDao();
//		Employee emp1=new Employee("gaurav", "gaurav@lithan.com", "123456", "Java Developer");
//		
//		assertEquals(1, dao.addEmployee(emp1));
//	}
	EmployeeDao dao;
	@Before
	public void setUp()
	{
		dao=new EmployeeDao();
	}
	
	@After
	public void tearDown()
	{
		dao=null;
	}
	@Test
	void testGetAllEmployee()
	{
		//EmployeeDao dao=new EmployeeDao();
		List<Employee> list=dao.getAllEmployees();
		assertEquals(2, list.size());
	}
	
	@Test
	void testupdateEmployee()
	{
		//EmployeeDao dao=new EmployeeDao();
		Employee emp1=new Employee("gaurav", "gaurav@lithan.com", "gaurav@123", "Java Developer");
		
		assertEquals(1, dao.updateEmployee(emp1));
	}
	
	@Test
	void testDeleteEmployee()
	{
		//EmployeeDao dao=new EmployeeDao();
		assertEquals(1, dao.deleteEmployee("gaurav@lithan.com"));
	}

}
