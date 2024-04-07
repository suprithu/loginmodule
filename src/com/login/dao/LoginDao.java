package com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao
{
	public boolean check(String uName, String pass) throws ClassNotFoundException, SQLException
	{
//		String url = "jdbc:postgresql://localhost:5432/login";
//		String userName = "postgres";
//		String password = "Suprith@123";
//		
		String sql = "select * from logins where uname = ? and pass = ?";
//		
//		Class.forName("org.postgresql.Driver");
//		
		Connection conn = DBConnectionManager.getConnection();
//		
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setString(1, uName);
		st.setString(2, pass);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next())
		{
			return true;
		}
		
		
		return false;
	}
}
