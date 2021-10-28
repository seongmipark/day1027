package com.sist.game;
import java.awt.event.KeyEvent;
//���ּ��� ���� Ŭ����
public class SpaceShip extends GraphicObject {
	
	//�����ÿ� �̹������ϸ����Ű������� ���޹޾� �θ��� �����ڿ��� ����
	public SpaceShip(String name) {
		super(name);
		
		//��ó�� ���ּ��� ��ġ x,y�� �����Ѵ�.
		x = 150;
		y = 350;
	}
	
	
	//���ּ��� ������ ����Ű�� ���� ���ּ��� ��ġ�� �̵���Ų��
	//�Ű������� ���޹��� KeyEvent event�� ���� � Ű�� ���������� �� �� �ִ�
	public void keyPressed(KeyEvent event) { 
		
		//���ʹ���Ű�� ��������
		if(event.getKeyCode() == KeyEvent.VK_LEFT) {
			//x��ǥ�� �������� �̵���Ű�� ���� 10�� ����
			x -=10;
		}
		//�����ʹ���Ű�� ��������
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			//x��ǥ�� ���������� �̵���Ű�� ���� 10�� ���ϱ�
			x +=10;
		}
		//���� ����Ű�� ��������
		if(event.getKeyCode() == KeyEvent.VK_UP) {
			//y��ǥ�� �������� �̵���Ű�� ���� 10�� ����
			y -=10;
		}
		//���ʹ���Ű�� ��������
		if(event.getKeyCode() == KeyEvent.VK_DOWN) {
			//y��ǥ�� �Ʒ������� �̵���Ű�� ���� 10�� ����
			y +=10;
		}
		
	}
}

