package com.revature.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.form.Date;
import com.revature.form.Form;
import com.revature.form.FormDao;

/**
 * Servlet implementation class FormServlet
 */
public class FormServlet extends HttpServlet
{
	private static final long serialVersionUID = -7296191674416170035L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession(false);
		System.out.println("USER?: " + sess.getAttribute("username"));
		String[] d = request.getParameter("eventTime").split("-");
		
		Date date = new Date();
		
		if(d.length != 0 && d != null)
		{
			date.setDate(d[1],d[2],d[0]);
		}
		
		else
		{
			date.setDate("0","0","0");
		}
		
		
		Form form = new Form(request.getParameter("firstName"),
		request.getParameter("lastName"), request.getParameter("eventName"),
		request.getParameter("eventAddress"), request.getParameter("eventCity"),
		request.getParameter("eventState"), request.getParameter("eventDescription"),
		Integer.parseInt(request.getParameter("eventPrice")), date,
		Integer.parseInt(request.getParameter("gradingFormat")), request.getParameter("eventType"),
		request.getParameter("workRelatedJust"));
		System.out.println("Form: " + form);		
		FormDao.addForm(form, (String) sess.getAttribute("username"));
		doGet(request, response);
	}

}
