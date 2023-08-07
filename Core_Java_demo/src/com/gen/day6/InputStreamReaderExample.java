package com.gen.day6;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	 //Create an object of FileInputStream class and pass path of filename.
	 FileInputStream fst = new FileInputStream("D:\\readFile.txt");
	 
	 // Create an object of InputStreamReader class and pass reference variable fis to its constructor. 
	 InputStreamReader instm = new InputStreamReader(fst);
	 
	int data = instm.read();//calling to read method to read data fro the file 
			while (data != -1) {
				System.out.print((char )data);
				data = instm.read();
			}instm.close();
	 
	 
 }catch (Exception e) {
	// TODO: handle exception
}
	}

}
