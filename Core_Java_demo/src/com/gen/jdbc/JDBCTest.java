package com.gen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//step 1 
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println(" Driver loaded ");

	//step 2
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/genpact1","root", "root");
	System.out.println("Connected...");
	
	//step3 
	Statement stm = con.createStatement();
	//PreparedStatement pstmt = connection.prepareStatement("insert into student values(?,?,?)");
	
	//step4
	ResultSet rs = stm.executeQuery("select * from city ");
	System.out.println(" Detials of City table ");
	System.out.println("==========================");
	
	while(rs.next()) {
		
		System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
		
	}
	
	con.close();
	
     }catch (Exception e) {
	// TODO: handle exception
}
	}

}
