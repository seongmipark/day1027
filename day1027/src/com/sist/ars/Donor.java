package com.sist.ars;

//"성금자"를 위한 클래스를 쓰레드를 상속받아 구현
public class Donor extends Thread {
	private String name;	//'성금자'의 이름을 위한 멤버변수
	private Account tvArs;	//'성금자'들이 '모금액'을 공유하기 위해 멤버변수로 선언
	
	//성금자 객체 생성시에 성금자의 이름과 공유한 모금액 객체를 매개변수로 전달받아
	//맴버변수에 설정
	public Donor(String name, Account tvArs) {
		this.name = name;
		this.tvArs = tvArs;
	}
	
	
	//스레드가 해야할 일을 run을 오버라이딩하여 써준다
	public void run() {
		
		for(int i=1; ; i++) { // 계속 반복하여 
			
			//입금하기전에 모금액기 십만원이 넘었으면 반복물 탈출
			if(tvArs.getBalance() >= 100000) {
				break;
			}
			
			tvArs.deposit(1000); //모금액객체에 1000원씩 입금
			System.out.println(name+"이(가) "+i+"번째 입금하였습니다."); //몇번째 입금했는지 출력
			try {
				Thread.sleep(200); // 0.2초 대기
			}catch(Exception e) {
				
			}
		}
	}

}
