package com.revature.employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.utility.ConnectionFactory;

public class EmployeeDao
{
	public static void addEmployee(Employee e)
	{
		String sql = "INSERT INTO EMPLOYEE"
				+ " (FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL,EMPLOYEETYPE,DEPARTMENT)"
				+ " VALUES(?, ?, ?, ?, ?, ?, ?)";
		
		try 
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = ConnectionFactory.getInstance().getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,e.getFirstName());
			ps.setString(2,e.getLastName());
			ps.setString(3,e.getUsername());
			ps.setString(4,e.getPassword());
			ps.setString(5,e.getEmail());
			ps.setInt(6,e.getEmployeeType());
			ps.setString(7,e.getDepartment());
			ps.executeUpdate();	
		}
		
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static Employee getEmployee(String username, String password)
	{
		String sql = "SELECT * FROM EMPLOYEE"
				+ " WHERE USERNAME = ? AND PASSWORD = ?";
		
		try 
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = ConnectionFactory.getInstance().getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Employee temp = new Employee(
				rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), 
				rs.getString("USERNAME"), rs.getString("PASSWORD"), 
				rs.getString("EMAIL"), rs.getString("DEPARTMENT"),
				rs.getInt("EMPLOYEETYPE"), /*rs.getInt("SUPERVISORID")*/ 0, 
				rs.getInt("EMPLOYEEID"));
				return temp;
			}
		}
		
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("yo");
		return null;
	}
	
	public static Boolean isEmployed(String username, String password)
	{
		String sql = "SELECT * FROM EMPLOYEE"
				+ " WHERE USERNAME = ? AND PASSWORD = ?";
		
		try 
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = ConnectionFactory.getInstance().getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			
			ResultSet rs = ps.executeQuery();
			
			if (!rs.next())
			{
				//ResultSet is empty
				return false;
			}
			
			else
			{
				return true;
			}
		}
		
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static int getEmployeId(String username)
	{
		String sql = "SELECT EMPLOYEEID FROM EMPLOYEE"
				+ " WHERE USERNAME = ?";
		
		try 
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = ConnectionFactory.getInstance().getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next())
			{
				//ResultSet is empty
				return rs.getInt("EMPLOYEEID");
			}
			
			else
			{
				return -1;
			}
		}
		
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return -999;
	}
}