package com.sist.game;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Enermy extends GraphicObject {
	
	//'��'�� x������ �����̴� ������ ���� ����
	//�� ó������ ������ ������ �������� �����̵��� �ϱ� ���Ͽ� ������ ����
	//int dx = -10;
	//int dy = 10;
	
	//���� �̵���θ� ������
	int dx;
	int dy;
	
	//�����ÿ� '��'���� ǥ���� �׷��� �����̸��� �Ű������� ���޹޾�
	//�θ�Ŭ������ �����ڿ��� �����Ѵ�.
	public Enermy(String name) {
		super(name);
		
		//�� ó���� ���α׷� �����ῴ�� �� '��'�� ��ġ�� 
		//������ ��ܿ� ��ġ��Ű�� ���� �Ʒ������� ����
		//x = 500;
		//y = 0;
		
		
		//��ó���� ���� ��ġ�� ������ ����
		Random r = new Random();
		x = r.nextInt(500);
		y = r.nextInt(300);
		

		//���� �̵���ΰ��� �����ÿ� ������ �����.
		//�̵��ϴ� �ּҰ�: 10
		//�̵��ϴ� �ִ�: 100
		//� ������ ���� 90���� ���� ���������ٰ� 10�� ���Ѵ�.

		
		dx=r.nextInt() % 20;
		dy=r.nextInt() % 20;
		
		if(dx>=0) {
			dx+= 10;
		}else {
			dx-= 10;
		}
		if(dy>=0) {
			dy+= 10;
		}else {
			dy-= 10;
		}
				
		
		System.out.println(dx); 
		System.out.println(dy); 
	}

	public void update() {
		// x��ǥ�� dx��ŭ �����Ų��.
		x += dx;
		y += dy;
		
		//x������ ���� ���������� ��ȣ�� �ٲ��ش�
		if(x<0 || x>500) {
			dx = dx*-1; //���ǹ����� �����,���� ������ ������
		}
		//y������ ���� ���������� ��ȣ�� �ٲ��ش�
		if(y<0 || y>=300) {
			dy = dy*-1; //���ǹ����� �����,���� ������ ������
		}
		
		
		
		
		//���� ���� ���� �����ϸ� ���������� �̵���Ű�� ���Ͽ� dx�� ����� �����.
		/*if(x<0) {
			dx = 10;
		}
		
		//���� ������ ���� �����ϸ� �ٽ� �������� �̵���Ű�� ���� dx�� ������ �����.
		if(x>500) {
			dx = -10;
		}
		if(y>50) {
			dx = -10; //���οö󰡴°��� ����
		}
		if(y<0) {
			dy = 10;
		}*/
	}
	
	
	//'��'�� '�̻���'�� �¾Ҵ��� �Ǻ��ϴ� �޼ҵ�
	public void crush(Missile missile){
		
		//'��'�� '�̻���'�� �¾Ҵ���
		if(missile.x >=x && missile.x <= x+51 && missile.y >= y && missile.y <= y+72) {
			System.out.println("���� �¾ҽ��ϴ�.");
			y= -1000; //���� �Ⱥ��̰� ��ǥ����
			
			//�浹�ɶ� �Ҹ� �߰�
			File file = new File("EXPLODE.WAV");
			try {
			//����� ������ �о���� ���� �غ�
			Clip clip = AudioSystem.getClip();
			//����� ������ �о�´�
			clip.open(AudioSystem.getAudioInputStream(file));
			//����� ������ ���
			clip.start();
			}catch(Exception e) {
		}
			
			
		}
	}
	
	
	
	
	
	
	
}
