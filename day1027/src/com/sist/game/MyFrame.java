package com.sist.game;

import javax.swing.JFrame;


//GUI���α׷��ֿ��� 'â'�� ����� ���� JFrame�� ��ӹ޴´�
public class MyFrame extends JFrame {
	
	//�����ڿ���
	public MyFrame() {
		setTitle("My Game");	//â�� ������ ����
		add(new MyPanel());		//'��','���ּ�','�̻���'�� �����ϰ� �ִ� '�г�'�� �����ؼ� '������'�� ��´�
		setSize(500,500);		//�������� ũ�⸦ ����
		setVisible(true);		//�������� ȭ�鿡 ���̵��� ����
	}
	public static void main(String[] args) {
		new MyFrame();		//�������� ����
	}
}