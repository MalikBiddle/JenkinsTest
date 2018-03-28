package com.revature.employee;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeDaoTest {

	@Test
	public void testAddEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmployee()
	{
		String username = "USERNAME";
		String password = "PASSWORD";
		assertNotEquals(null,EmployeeDao.getEmployee(username,password));
		System.out.println(EmployeeDao.getEmployee(username,password));
	}

	@Test
	public void testIsEmployed()
	{
		String username = "USERNAME";
		String password = "PASSWORD";
		assertEquals("Worked",true,EmployeeDao.isEmployed(username,password));
	}
	
	@Test
	public void testIsEmployed2()
	{
		String username = "NOT";
		String password = "TRUE";
		assertEquals(false,EmployeeDao.isEmployed(username,password));
	}
	
	@Test
	public void testGetEmployeeId()
	{
		String username = "USERNAME";
		assertEquals(21,EmployeeDao.getEmployeId(username));
	}

}
