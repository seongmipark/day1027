package com.sist.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadFile {

	public static void main(String[] args) {
		
		//�Ʊ� ������ c:/myData/hello.txt������ ������ �о�鿩
		//ȭ�鿡 ����غ���

		try {
			FileReader fr = new FileReader("c:/myData/hello.txt");	
			int n;
			while ((n = fr.read()) != -1) { 
			System.out.print((char) n); //
		}
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		

		
		
	}

}
