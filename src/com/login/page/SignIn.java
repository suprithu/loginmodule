package com.login.page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.DBConnectionManager;
import com.login.dao.LoginDao;
import com.login.dao.SignInDao;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uName = request.getParameter("uName");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		SignInDao dao = new SignInDao();
		if(uName == "" || pass == "")
		{
			out.print("Invalid");
		}
		else
		{
	
		
			try {
				if(dao.check(uName, pass))
				{
					HttpSession session = request.getSession();
					session.setAttribute("username", uName);
					
					
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("Login.jsp");
		}
	}
	
}
