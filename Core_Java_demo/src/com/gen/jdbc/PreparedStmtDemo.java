package com.gen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class PreparedStmtDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
      
    //  Scanner sc = null ;
       try {
    	   
    	   
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println(" Driver loaded ");

    		//step 2
    		Connection con =	 DriverManager.getConnection("jdbc:mysql://localhost:3306/genpact1","root", "root");
    		System.out.println("Connected...");
    	   
    		
    		
			PreparedStatement ps= con.prepareStatement("insert into city values (?,?,?)");
    		System.out.println("insert");
    		ps.setInt(1, 199);ps.setString(2, "jakarta");ps.setInt(3, 1233);
    		int i = ps.executeUpdate();
    		System.out.println(i+"inserted ");
    		
 		   
    	   con.close();
    	   
       }catch (Exception e) {
		// TODO: handle exception
	}
	
	}

}
