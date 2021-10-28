package com.sist.product;

//생산자를 위한 클래스를 만든다.
public class Producer extends Thread {
	
	//'제품'을 위한 클래스를 멤버변수로 선언
	private Product product;

	//생산자 객체 생성시에 제품 객체를 매개변수로 전달받아 멤버변수 '제품'을 초기화한다
	public Producer(Product product) {
		this.product = product;
	}
	
	//생산자 클래스는 계속하여 새로운 제품을 생성하기 위한 메소드를 호출시키기 위해
	//쓰레드가 해야하는 일을 run메소드를 오버라이딩하여 써준다.
	public void run() {
		
		//10개의 새로운 제품을 생산하도록 하자
		for(int i=1;i<=10;i++) {
			product.makeNumber(); 
			//새로운 제품(정수)를 생산하기 위해 '제품'객체의 makeNumber메소드 호출 
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
