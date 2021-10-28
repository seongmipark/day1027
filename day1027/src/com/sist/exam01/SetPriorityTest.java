package com.sist.exam01;

public class SetPriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person("김유신");
		Person hong = new Person("홍길동");
		Person lee = new Person("이순신");
		//lee.setPriority(10);
		lee.setPriority(Thread.MAX_PRIORITY);//위처럼해도되고 아래처럼해도되고.
		
		kim.start();
		hong.start();
		lee.start();
		
		//kim,hong,lee 쓰레드가 모두 끝날때까지 대기시킨다.
		//이때 사용하는 메소드 join()
		try {
		kim.join();
		hong.join();
		lee.join();
		}catch(Exception e) {	
		}
		
		System.out.println("kim의 우선순위:"+kim.getPriority());  //기본값 5
		System.out.println("hong의 우선순위:"+hong.getPriority()); //기본값 5
		System.out.println("lee의 우선순위:"+lee.getPriority());
	}

}
