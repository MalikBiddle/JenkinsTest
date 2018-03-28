package com.revature.employee;

public class Employee 
{
	private String firstName="";
	private String lastName="";
	private String username="";
	private String password="";
	private String email="";
	private String department="";
	private int employeeType=0;
	private int supervisorID=0;
	
	public Employee(String firstName, String lastName, String username, String password, String email, int employeeType,
			int supervisorID, int employeeID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.employeeType = employeeType;
		this.supervisorID = supervisorID;
		this.employeeID = employeeID;
	}

	private int employeeID; //EMPID get from DB after added to DB
	
	public Employee() 
	{
		super();
	}
	
	public Employee(String firstName, String lastName, String username, String password, String email, String department, int employeeType)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.employeeType = employeeType;
		this.email = email;
		this.department = department;
	}

	public Employee(String firstName, String lastName, String username, String password, int employeeType,
			int supervisorID, int employeeID)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.employeeType = employeeType;
		this.supervisorID = supervisorID;
		this.employeeID = employeeID;
	}

	public Employee(String firstName, String lastName, String username, String password, String email, String department,
			int employeeType, int supervisorID, int employeeID)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.department = department;
		this.employeeType = employeeType;
		this.supervisorID = supervisorID;
		this.employeeID = employeeID;
	}

	public Employee (Employee e)
	{
		super();
		this.firstName = e.firstName;
		this.lastName = e.lastName;
		this.username = e.username;
		this.password = e.password;
		this.email = e.email;
		this.department = e.department;
		this.employeeType = e.employeeType;
		this.supervisorID = e.supervisorID;
		this.employeeID = e.employeeID;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public int getEmployeeType()
	{
		return employeeType;
	}
	
	public void setEmployeeType(int employeeType)
	{
		this.employeeType = employeeType;
	}
	
	public int getSupervisorID()
	{
		return supervisorID;
	}
	
	public void setSupervisorID(int supervisorID)
	{
		this.supervisorID = supervisorID;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", email=" + email + ", department=" + department + ", employeeType=" + employeeType
				+ ", supervisorID=" + supervisorID + ", employeeID=" + employeeID + "]";
	}
}
