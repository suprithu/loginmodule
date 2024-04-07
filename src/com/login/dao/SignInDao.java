package com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignInDao 
{
	public boolean check(String uName, String pass) throws ClassNotFoundException, SQLException
	{

		String sql = "Insert into logins values(?,?)";
		
		Connection conn = DBConnectionManager.getConnection();
		
		try 
		{
			PreparedStatement st = conn.prepareStatement(sql);
			
			
			st.setString(1, uName);
			st.setString(2, pass);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
			
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
