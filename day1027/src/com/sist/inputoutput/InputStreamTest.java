package com.sist.inputoutput;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fs = new FileInputStream("c:/myData/hello.txt");
			
			int n;
			while ((n = fs.read()) != -1) { 
			System.out.print((char) n); //
			}  
		} catch (Exception e) {
			// TODO: handle exception
		}
      }

}



