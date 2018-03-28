package com.revature.form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.employee.Employee;
import com.revature.employee.EmployeeDao;
import com.revature.utility.ConnectionFactory;

public class FormDao
{
	public static void addForm (Form f, String user)
	{
		String sql = "INSERT INTO FORM"
				+ " (NAME,MONTH,DAY,YEAR,ADDRESS,CITY,STATE,DESCRIPTION,EVENTTYPE,COST,EMPLOYEEID,GRADINGFORMAT,ACCEPTANCESTAGE)"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int id = EmployeeDao.getEmployeId(user);
		try 
		{	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = ConnectionFactory.getInstance().getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,f.getEventName());
			ps.setString(2,f.getDate().getMonth());
			ps.setString(3,f.getDate().getDay());
			ps.setString(4,f.getDate().getYear());
			ps.setString(5,f.getEventAddress());
			ps.setString(6,f.getEventCity());
			ps.setString(7,f.getEventState());
			ps.setString(8,f.getDescription());
			ps.setString(9,f.getEventType());
			ps.setDouble(10,f.getPrice());
			ps.setInt(11,id);
			ps.setInt(12,f.getGradeFormat());
			ps.setInt(13,0);
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
}
