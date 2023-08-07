package com.gen.day6;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("D:\\data1.txt");
			
			int value = 0 ;
			
			while((value = fis.read())!=-1)
			{
				System.out.print((char)value);
			}
			
			
			System.out.println(" Reading value in bytes form "+value);
			
			
			 fis.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
