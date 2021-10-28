package com.sist.score;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class ScoreTest {

	//split���� �и�
	public static void splitTest(String data) {

		String []arr = data.split(",");
		String name = arr[0];
		//String�� int�� ��ȯ
		int kor = Integer.parseInt(arr[1]);
		int eng = Integer.parseInt(arr[2]);	
		int math = Integer.parseInt(arr[3]);
		
		int tot = kor + eng + math;
		double avg = tot / 3.0; 
		
		System.out.printf("�̸�:%s,��������:%d,��������:%d,��������:%d\n",name,kor,eng,math);
		System.out.printf("����:%d,���:%.1f\n",tot,avg);

		}	
	
	//StringTokenizer���� �и�
	public static void StringTokenizerTest (String data) {
		
		StringTokenizer st = new StringTokenizer(data, ",");
		while(st.hasMoreTokens()){
			String name = st.nextToken();
			//String�� int�� ��ȯ
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());

			int tot = kor + eng + math;
			double avg = tot / 3.0; 
			
			System.out.printf("�̸�:%s,��������:%d,��������:%d,��������:%d\n",name,kor,eng,math);
			System.out.printf("����:%d,���:%.1f\n",tot,avg);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C:/myData/Student.txt");			
			//�̸�,��������,��������,��������
			fw.write("ȫ�浿,100,80,90");
			fw.close();
			System.out.println("���ϻ��� �Ϸ�");

			
			FileReader fr = new FileReader("C:/myData/Student.txt");
			char[] ch = new char[50]; //ch�� ���� �迭����
				int n;
				while ((n = fr.read(ch)) != -1) { //char�迭�� ���ڵ��� ��´�
			System.out.println(ch);
				}  
			fr.close();
				
			String data = String.valueOf(ch).trim();
			//char�迭�� String�����ϰ� char�� ���ε������� ���ֱ� ���ؼ� ��������
			
			System.out.println("================split===============");
			ScoreTest.splitTest(data);
			
			System.out.println("=============StringTokenizer============");
			ScoreTest.StringTokenizerTest(data);

			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
	

