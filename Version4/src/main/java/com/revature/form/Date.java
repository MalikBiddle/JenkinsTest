package com.revature.form;

public class Date
{
	private String month = "";
	private String day = "";
	private String year = "";
	
	public Date()
	{
		
	}
	
	public Date(String month, String day, String year)
	{
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String getMonth()
	{
		return month;
	}
	
	public void setMonth(String month)
	{
		this.month = month;
	}
	
	public String getDay()
	{
		return day;
	}
	
	public void setDay(String day)
	{
		this.day = day;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public void setYear(String year)
	{
		this.year = year;
	}
	
	public void setDate(String month, String day, String year)
	{
		this.month = month;
		this. day = day;
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
}
