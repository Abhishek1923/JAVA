package com.hs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserAuth {
	
	public boolean isAuthenticated(String username, String password)throws Exception {
		boolean status=false;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		System.out.println("Connection created");
		String sql = "SELECT *FROM USER_DETAILS WHERE USERNAME=? AND PASSWORD=?";
		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, username);
		psmt.setString(2, password);
		ResultSet rs= psmt.executeQuery();
		if(rs.next()) {
			status = true;
		}else {
			status = false;
		}		
		return status;
	}
}
