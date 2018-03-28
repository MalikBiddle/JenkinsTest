package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -166471184373138841L;

	//private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// Serve login.html
		HttpSession sess = request.getSession();
		
		if (sess != null)
		{

			String user = (String) sess.getAttribute("username");
			//user="user1";
			if ("user1".equals(user)) {
				response.sendRedirect("home.html");
			} else {
				request.getRequestDispatcher("login.html").forward(request, response);
			}

		} else {
			request.getRequestDispatcher("login.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// sending a redirect
		// response.sendRedirect("home");
		// forward to maintain request scope
		
		request.getRequestDispatcher("home").forward(request, response);
	}

}
