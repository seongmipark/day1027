package com.sist.game;

import javax.swing.JFrame;


//GUI프로그래밍에서 '창'을 만들기 위해 JFrame을 상속받는다
public class MyFrame extends JFrame {
	
	//생성자에서
	public MyFrame() {
		setTitle("My Game");	//창의 제목을 설정
		add(new MyPanel());		//'적','우주선','미사일'을 포함하고 있는 '패널'을 생성해서 '프레임'에 담는다
		setSize(500,500);		//프레임의 크기를 설정
		setVisible(true);		//프레임을 화면에 보이도록 설정
	}
	public static void main(String[] args) {
		new MyFrame();		//프레임을 생성
	}
}