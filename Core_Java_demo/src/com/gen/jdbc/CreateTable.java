package com.gen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class CreateTable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
         try {
        	 
        		
     		Class.forName("com.mysql.cj.jdbc.Driver");
     		System.out.println(" Driver loaded ");

     		//step 2
     		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/genpact1","root", "root");
     		System.out.println("Connected...");
        	 
        	 Scanner s=new Scanner(System.in);
             System.out.println("Enter city id:");
             int id =s.nextInt();
             System.out.println("Enter city name:");
             String name =s.next();
             System.out.println("Enter city pin:");
             int pin =s.nextInt();
             
		String query = "insert into student values('" + id + "','" + name +"','"+ pin + "')"; 
	
		
		//step3 
		Statement stm = con.createStatement();
		
		int count = stm.executeUpdate(query);
		if (count == 0) { 
            System.out.println("Record Inserted Failed"); 
        } else { 
            System.out.println(count+ " Record(s) Inserted "); 
        } 
    
		
		con.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
         
		
	}

}
