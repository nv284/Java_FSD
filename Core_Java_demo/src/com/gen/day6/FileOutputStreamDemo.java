package com.gen.day6;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File  f = new File("D:\\readFile.txt");
		boolean res;
try {
	 res = f.createNewFile(); 
	  System.out.println(" File created "+res);
	  
	  FileOutputStream fout  = new FileOutputStream(f) ;
	  
	  String s = " lets write into the new file ";
	  
	      byte byteArray[] =  s.getBytes();
	  
	      fout.write(byteArray);
	      
	      fout.close();
	      System.out.println(" data is stroed ");
	  
	  
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
