package com.revature.form;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormDaoTest {

	@Test
	public void testAddForm()
	{
		Date date = new Date("3","4","2015");
		Form form = new Form("firstName","lastName","eventName","eventAddress",
		"eventCity","eventState","eventDescription",0, date,1,"eventType",
		"workRelatedJust");	
		FormDao.addForm(form, "USERNAME");
		
		assertEquals(true,true);
	}

}
