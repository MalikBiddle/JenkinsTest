package com.revature.form;

public class Form
{
	private String firstName = "";
	private String lastName = "";
	private String eventName = "";
	private String eventAddress = "";
	private String eventCity = "";
	private String eventState = "";
	private String description = "";
	private double price = 0;
	private Date date = new Date();
	private int gradeFormat = -1;
	private String eventType = "";
	private String eventJust = "";
	
	public Form()
	{
		
	}
	
	public Form(String firstName, String lastName, String eventName, String eventAddress, String eventCity,
			String eventState, String description, double price, Date date, int gradeFormat, String eventType,
			String eventJust)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eventName = eventName;
		this.eventAddress = eventAddress;
		this.eventCity = eventCity;
		this.eventState = eventState;
		this.description = description;
		this.price = price;
		this.date = date;
		this.gradeFormat = gradeFormat;
		this.eventType = eventType;
		this.eventJust = eventJust;
	}



	public String getFirstName()
	{
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEventName() {
		return eventName;
	}



	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	public String getEventAddress() {
		return eventAddress;
	}



	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}



	public String getEventCity() {
		return eventCity;
	}



	public void setEventCity(String eventCity) {
		this.eventCity = eventCity;
	}



	public String getEventState() {
		return eventState;
	}



	public void setEventState(String eventState) {
		this.eventState = eventState;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public int getGradeFormat() {
		return gradeFormat;
	}



	public void setGradeFormat(int gradeFormat) {
		this.gradeFormat = gradeFormat;
	}



	public String getEventType() {
		return eventType;
	}



	public void setEventType(String eventType) {
		this.eventType = eventType;
	}



	public String getEventJust() {
		return eventJust;
	}



	public void setEventJust(String eventJust) {
		this.eventJust = eventJust;
	}



	@Override
	public String toString()
	{
		return "Form [firstName=" + firstName + ", lastName=" + lastName + ", eventName=" + eventName
				+ ", eventAddress=" + eventAddress + ", eventCity=" + eventCity + ", eventState=" + eventState
				+ ", description=" + description + ", price=" + price + ", date=" + date + ", gradeFormat="
				+ gradeFormat + ", eventType=" + eventType + ", eventJust=" + eventJust + "]";
	}
	
	
}
