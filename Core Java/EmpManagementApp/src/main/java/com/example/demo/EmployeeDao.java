package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	public static Connection getConnection()throws Exception
	{
		Connection con=null;
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empapp");
		
		return con;
	}
	public static int save(Employee e)
	{
		int status=0;
		try
		{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into employee(eno,ename,dept,salary)values(?,?,?,?)");
			ps.setString(1, e.getEno());
			ps.setString(2, e.getEname());
			ps.setString(3, e.getDept());
			ps.setString(4, e.getSalary());
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		return status;
	}
	public static List<Employee> getAllEmployees()
	{
		List<Employee> emps=new ArrayList<Employee>();
		try 
		{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Employee e=new Employee();
				e.setEno(rs.getString(1));
				e.setEname(rs.getString(2));
				e.setDept(rs.getString(3));
				e.setSalary(rs.getString(4));
				emps.add(e);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return emps;
	}
}
