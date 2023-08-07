package com.gen.day6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strs[ ] = { "This is a dog", 
			     "This is a cat", 
			     "This is an elephant", 
			     "This is a lion"};
		File inFile = new File("D:\\input.txt");

		try {
			
			FileWriter fw = new FileWriter("D:\\readFile.txt");
			
			fw.write("Writing on the reaFile.txt with the filewriter class ");
			fw.write(" Java is fun ");
			
			//  read the file and write into the new file till the end 
			FileReader read = new FileReader("D:\\readFile.txt");
			FileWriter write = new FileWriter("D:\\input.txt");
			
			int ch ; 
			while((ch = read.read()) !=-1) {
				write.write(ch);
			}
			
			
			
			fw.close();
			read.close();write.close();
			System.out.println("successfully written in the file ");
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
