package com.lithan.strutssruddemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.lithan.strutssruddemo.model.Employee;


public class EmployeeDao {

	public Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/strutsdemo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return con;
	}
	
	public int addEmployee(Employee employee)
	{
		int result=0;
		String sql="insert into struts2crud (uname,uemail,upass,udeg) values (?,?,?,?)";
		try(Connection con=getConnection();PreparedStatement pst=con.prepareStatement(sql)) {
			pst.setString(1, employee.getUname());
			pst.setString(2, employee.getUemail());
			pst.setString(3, employee.getUpass());
			pst.setString(4, employee.getUdeg());
			
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int updateEmployee(Employee employee)
	{
		int result=0;
		String sql="update struts2crud set uname=?,upass=?,udeg=? where uemail=?";
		try(Connection con=getConnection();PreparedStatement pst=con.prepareStatement(sql)) {
			pst.setString(1, employee.getUname());
			pst.setString(2, employee.getUpass());
			pst.setString(3, employee.getUdeg());
			pst.setString(4, employee.getUemail());
			
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int deleteEmployee(String email)
	{
		int result=0;
		String sql="delete from struts2crud where uemail=?";
		try(Connection con=getConnection();PreparedStatement pst=con.prepareStatement(sql)) {
			pst.setString(1, email);
			
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public List<Employee> getAllEmployees()
	{
		Employee empl;
		List<Employee> list=new ArrayList<Employee>();
		String sql="select * from struts2crud";
		try(Connection con=getConnection();PreparedStatement pst=con.prepareStatement(sql)) {
			
			ResultSet result= pst.executeQuery();
			while(result.next())
			{
				empl=new Employee();
				empl.setUname(result.getString(1));
				empl.setUemail(result.getString(2));
				empl.setUpass(result.getString(3));
				empl.setUdeg(result.getString(4));
				System.out.println(empl);
				list.add(empl);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}
