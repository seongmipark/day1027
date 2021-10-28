package com.sist.game;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Missile extends GraphicObject {
	
	//�̻����� �߻� �Ǿ����� �Ǻ��ϱ� ���� ����
	boolean launched = false;
	
	//�����ÿ� �̹��������̸��� �Ű������� ���޹޾�
	public Missile(String name) {
		
		//�θ��� �����ڿ��� �����Ѵ�.
		super(name);
		y = -200;
	}
	
	public void update() {
		//���࿡ �̻����� �߻� �Ǿ��ٸ� y��ǥ�� 1�� ����
		if(launched) {
			y -= 30;
		}
		
		//�̻����� y��ǥ�� ȭ���� ���� �Ⱥ��̴� �����̸� launched�� false�� ����
		if(y < -100) {
			launched = false;
		}
	}
		
		//Ű���尡 �������� ���� ���ּ��� �ִ� ��ġ x,y��ǥ�������� ����Ͽ�
		//�̻����� �߻��Ű�� ���Ͽ� keyPressed�޼ҵ带 �������̵� �Ѵ�.
		//���� �Ű������� ���޹޴� KeyEvent event�� ���ؼ� � key�� ���ȴ��� �˼� �ִ�.
		//��, �Ű����� x,y�� ���ּ��� ��ġ x,y�� ���޹޴´�.
		public void keyPressed(KeyEvent event, int x , int y) {
			//������ Ű�� �����̽��ٶ��
			if(event.getKeyCode() == KeyEvent.VK_SPACE) {
				launched = true; //�̻����� �߻��Ű�� ���Ͽ� launched�� true�� ����
				
				//�̻����� x,y��ǥ�� ���ּ��� x,y�� ����
				this.x = x;
				this.y = y;
				
				//�̻����� �߻�ɶ� �Ҹ� �߰�
				File file = new File("LASER.WAV");
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

