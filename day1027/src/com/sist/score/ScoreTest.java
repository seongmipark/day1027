package com.sist.score;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class ScoreTest {

	//split으로 분리
	public static void splitTest(String data) {

		String []arr = data.split(",");
		String name = arr[0];
		//String을 int로 변환
		int kor = Integer.parseInt(arr[1]);
		int eng = Integer.parseInt(arr[2]);	
		int math = Integer.parseInt(arr[3]);
		
		int tot = kor + eng + math;
		double avg = tot / 3.0; 
		
		System.out.printf("이름:%s,국어점수:%d,영어점수:%d,수학점수:%d\n",name,kor,eng,math);
		System.out.printf("총점:%d,평균:%.1f\n",tot,avg);

		}	
	
	//StringTokenizer으로 분리
	public static void StringTokenizerTest (String data) {
		
		StringTokenizer st = new StringTokenizer(data, ",");
		while(st.hasMoreTokens()){
			String name = st.nextToken();
			//String을 int로 변환
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());

			int tot = kor + eng + math;
			double avg = tot / 3.0; 
			
			System.out.printf("이름:%s,국어점수:%d,영어점수:%d,수학점수:%d\n",name,kor,eng,math);
			System.out.printf("총점:%d,평균:%.1f\n",tot,avg);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("C:/myData/Student.txt");			
			//이름,국어점수,영어점수,수학점수
			fw.write("홍길동,100,80,90");
			fw.close();
			System.out.println("파일생성 완료");

			
			FileReader fr = new FileReader("C:/myData/Student.txt");
			char[] ch = new char[50]; //ch를 담을 배열선언
				int n;
				while ((n = fr.read(ch)) != -1) { //char배열에 문자들을 담는다
			System.out.println(ch);
				}  
			fr.close();
				
			String data = String.valueOf(ch).trim();
			//char배열을 String으로하고 char의 빈인덱스값을 없애기 위해서 공백제거
			
			System.out.println("================split===============");
			ScoreTest.splitTest(data);
			
			System.out.println("=============StringTokenizer============");
			ScoreTest.StringTokenizerTest(data);

			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
	

