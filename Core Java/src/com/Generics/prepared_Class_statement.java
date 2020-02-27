package com.Generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class prepared_Class_statement {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","4466");
		System.out.println("Connection established!!\n");
		PreparedStatement pstmt= dbcon.prepareStatement("INSERT INTO NEWTABLE VALUES(?,?,?)");
		pstmt.setInt(1,222);
		pstmt.setString(2,"Dembele");
		pstmt.setDouble(3,1234.5678);
		int updates=pstmt.executeUpdate();
		pstmt.close();
		dbcon.close();
		
	}

}
