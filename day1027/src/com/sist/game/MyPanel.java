package com.sist.game;

import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.Graphics;

//��,�̻���.���ּ��� ���ÿ�(�Ѳ�����) ���� �� �ִ� '�г�'Ŭ����
//��, '�г�'�� Ű���尡 �������� �̺�Ʈ�� ó���ϱ� ���Ͽ� KeyListener�� ����
public class MyPanel extends JPanel implements KeyListener {
	
	//��,�̻���,���ּ��� �г��� ��������� ����
	//Enermy enermy;
	
	ArrayList<Enermy> enermylist = new ArrayList<Enermy>();
	
	SpaceShip spaceship;
	Missile missile;
	
	//�����ڿ� ��, �г��� �����ʿ� ���ÿ� �����Ͽ�
	public MyPanel() {
		super();
		this.addKeyListener(this);  //�г��� Ű���� �̺�Ʈ�� ���
		this.requestFocus();        //�г��� Ű���� ��û�� �����Ѵ� A
		setFocusable(true);			//�г��� ��Ŀ���� ����        B
		//�г��� ȭ�鱸������߿� �������� Ű����κ��� �Է¹޾� ���̴� �뵵�� �ƴϱ� ������
		//Ű����κ��� �Է��� �޾Ƶ��̰� �Ϸ��� '�г�'�� �ϴ� '��Ŀ��(Ȱ��ȭ)'�� �����ؾ� �Ѵ�.
		
		//enermy = new Enermy("enermy.png");		//�̹������ϸ��� ���� '��' ��ü�� ����
		
		//'��'�� 5�� �����ؼ� ����Ʈ�� ���
		enermylist = new ArrayList<Enermy>();
		enermylist.add(new Enermy("enermy.png"));
		enermylist.add(new Enermy("enermy.png"));
		enermylist.add(new Enermy("enermy.png"));
		enermylist.add(new Enermy("enermy.png"));
		enermylist.add(new Enermy("enermy.png"));
		
		
		
		
		spaceship = new SpaceShip("spaceship.png");   //�̹������ϸ��� ���� '���ּ�' ��ü�� ����
		missile = new Missile("missile.png");   //�̹������ϸ��� ���� '�̻���' ��ü�� ����
		
		
		//�г��� ��������� '��', '�̻���' , '���ּ�'�� ���� ����������(=���ÿ�=�����ϰ�) 
		//�����̵��� �ϱ� ���� ��Ƽ������ ����
		//���ÿ� �����̰� �ϴ� ����� �гο����� �ʿ��ϴ�. �̷� �� Ŭ���� �ȿ� Ŭ������ ����� �ִ�
		//�̰��� inner class��� �Ѵ�.
		class MyThread extends Thread{		//ThreadŬ������ ��ӹ޾� ��Ƽ������ ����
			public void run() {				//run�� �������̵� �Ͽ� ���ÿ� �����ų ��ɾ�(��)�� ���ش�
				while(true) {			
					
					
					//'��'�� ����Ʈ��ŭ 
					for(Enermy enermy :enermylist) {
						enermy.update();
						//'��'�� '�̻���'�� �¾Ҵ��� �Ǻ��ϴ� �޼ҵ� ȣ��
						enermy.crush(missile);
					}

					//spaceship.update();		//'���ּ�'�� �����̰� �ϱ� ���� '���ּ�'�� ��ġ�� �����ϴ� �޼ҵ� ȣ��
												//'���ּ�'�� Ű���尡 ������ �������� �ѹ� �����̵��� �Ǿ� �־� ȣ������ �ʾƵ� �ȴ�.
			
					missile.update();		//'�̻���'�� �����̵��� �ϱ� ���� '�̻���'�� ��ġ�� �����ϴ� �޼ҵ� ȣ��
							
					repaint();				
					
					try {Thread.sleep(50);}
					catch(InterruptedException e) {}
				}
			}
		}
		
		//'��','�̻���','���ּ�'�� ���� ���������� �����̵��� ���� 
		//��Ƽ������ ��ü MyThread�� ����
		Thread t = new MyThread();
		
		//�����带 �����Ѵ�.
		t.start();
	}
	
	
	
	//'��','�̻���','���ּ�'�� ����� ��ġ�� �׷����� �ٽ� �׷��ش�.
	//'�г�'�� �׷����� ǥ���ϱ� ���ؼ� paintComponent�� �������̵� ���ش�
	//�̶� �Ű������� ���޹��� Graphics�� �׷����� ǥ���ϱ����� �پ��� �޼ҵ���� �ִ�.
	public void paint(Graphics g) { 
		super.paint(g);
		
		//'��'�� ����Ʈ�� �ִ� ��ŭ '��'�� �׷��ֱ�
		for(Enermy enermy :enermylist) {
		enermy.draw(g);  
		}
		spaceship.draw(g);
		missile.draw(g);
	}
	
	
	//'�г�'���� Ű���尡 ��������
	public void keyPressed(KeyEvent event) {
		spaceship.keyPressed(event);    	//������ Ű�����̺�Ʈ�� ������ '���ּ�'���� ����
		missile.keyPressed(event, spaceship.x,spaceship.y);
		//������ Ű�����̺�Ʈ�� ������ ���ּ��� ��ġ�� '�̻���'���� ����
		
	}
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}

	
}
