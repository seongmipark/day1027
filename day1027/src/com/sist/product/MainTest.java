package com.sist.product;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제품 객체를 생성한다
		Product product = new Product();
	
		//생산자 쓰레드객체를 생성한다.
		Producer p = new Producer(product);

		//소비자 쓰레드객체를 생성한다.
		Consumer c = new Consumer(product);
	
		//생산자와 소비자를 가동
		p.start();	
		c.start();
	}
}
