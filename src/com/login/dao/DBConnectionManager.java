package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager
{
	static
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		Connection conn = null;
		try 
		{
			 conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/login","sada","sada");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return conn;
		
	}
}
