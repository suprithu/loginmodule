package com.login.page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String uName = request.getParameter("uName");
		String pass = request.getParameter("pass");
		
		//PrintWriter out = response.getWriter();
		
		LoginDao dao = new LoginDao();
		
		try {
			if(dao.check(uName, pass))
			{
				HttpSession session = request.getSession();
				session.setAttribute("username", uName);
				
				response.sendRedirect("Welcome.jsp");
			}
			else
			{
				//out.print("Invalid User Name or Password try again");
				response.sendRedirect("Login.jsp");
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
