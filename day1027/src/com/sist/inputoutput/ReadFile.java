package com.sist.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadFile {

	public static void main(String[] args) {
		
		//아까 생성한 c:/myData/hello.txt파일의 내용을 읽어들여
		//화면에 출력해보기

		try {
			FileReader fr = new FileReader("c:/myData/hello.txt");	
			int n;
			while ((n = fr.read()) != -1) { 
			System.out.print((char) n); //
		}
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		

		
		
	}

}
