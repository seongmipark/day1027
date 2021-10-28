package com.sist.ars;

public class Account {
	//전체 모금액을 위한 변수
	private int balance;
	
	//입금을 하는 메소드 - 임계영역으로 설정
	public synchronized void deposit(int amount) {
		balance += amount;
	}
	
	//현재 모금액을 반환하는 메소드
	public int getBalance(){
		return balance;
	}
}
