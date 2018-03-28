package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.employee.EmployeeDao;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -501631436667805671L;

	//private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println("Username: " + user);
		System.out.println("Password: " + pass);
		//System.out.println(EmployeeDao.isEmployed(user, pass));
		
		user = user != null && !user.toString().isEmpty()? user : "x";
		pass = pass != null && !pass.toString().isEmpty()? pass : "x";

		if(EmployeeDao.isEmployed(user, pass))
		{
			//setting up a session with user after logging in
			HttpSession sess = request.getSession();
			sess.setAttribute("username", user);
			response.sendRedirect("home.html");
			//request.getRequestDispatcher("home.html").forward(request, response);
		} 
		
		else
		{
			response.sendRedirect("login.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
