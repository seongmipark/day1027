package com.sist.product2;

import java.util.Random;

//'생산자'와 '소비자'가 공유할 '제품'클래스를 만든다.
public class Product {

	//생산되는 제품을 임의의 정수라고 하자.
	int number;
	
	//제품을 새로 생산하였는지 소비하였는지 판별하기 위한 변수
	//생산자가 새로운 제품을 생산하면 true를 설정
	//소비자가 제품을 소비하면 false를 설정
	public boolean isNew=false;
	
	//생산자가 사용할 새로운 제품을 생성하는 메소드 정의
	//생산자가 제품을 생산하고 있는 동안에는 소비자가 접근할 수 없도록 하기 위해
	//'임계영역'으로 설정한다
	public synchronized void makeNumber() {
		
		//새로운제품(정수)을 생산하기 전에 소비가 일어나지않는 동안 대기상태로 있도록
		//소비가자 제품을 소비하고 isNew에 false를 설정하고 notify로 깨워주면 반복문을 탈출한다.
		while(isNew == true) {
			try {
				wait();	//예외를 갖고있어 예외처리를 해준다.			
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//새로운제품(정수)는 난수로 만들어보기
		Random r = new Random();
		number = r.nextInt(100); //새로운 제품생산
		System.out.println("생산자가 새로운 제품 생성 ==>"+number);
		//대기중인 쓰레드(소비자)를 깨운다.
	}
	
	
	//소비자가 사용할 제품을 소비하기 위한 메소드 정의
	public synchronized int getNumber() {

		System.out.println("소비자가 제품 소비함 ==>"+number);//소비자가 제품을 소비함
		return number;
	}
	
}
