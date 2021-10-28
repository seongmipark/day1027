package com.sist.inputoutput;

import java.io.FileWriter;

public class PrintFileHello {

	public static void main(String[] args) {
		//나의 이름과 나이를 파일로 기록해보기
		//문자단위의 출력을 위한 Writer의 후손 중에 
		//파일로 출력을 위한 FileWriter를 생성해보자
		
		try {
		FileWriter fw = new FileWriter("c:/myData/hello.txt");
		fw.write("나의 이름은 홍길동이고\n");
		fw.write("나이는 20살입니다.");
		
		//파일의 사용이 끝나면 파일을 닫아줘야 한다.
		//닫지 않더라도 지금 당장 오류가 나지 않을 수 있지만
		//이 파일을 만약 다른곳에서도 써야한다면 닫아주지 않아 다른곳에서 사용할 수 없게 된다.
		fw.close();
		System.out.println("파일을 생성하였습니다.");
		
		}catch(Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}
