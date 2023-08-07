package com.gen.day6;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileReader fr = new FileReader("D:\\readFile.txt");
			int i ;
			
			while((i = fr.read())!=-1) {
				System.out.print((char)i);
			}
		System.out.println(" ");
		fr.close();
		
	}catch (Exception e) {
		// TODO: handle exception
	}

	}
}
