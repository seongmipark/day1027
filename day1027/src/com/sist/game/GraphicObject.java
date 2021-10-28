package com.sist.game;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

//��,���ּ�,�̻��� Ŭ�������� ���������� �������� �Ӽ��� ������ �̾� "�Ϲ�ȭ"�Ѵ�.
public class GraphicObject {
	BufferedImage img = null;//ȭ�鿡 �׸��� ǥ���ϱ� ���� ��ü
	int x=0, y=0;//�׸��� ��µ� ��ġ
	
	//�����ÿ� �׷����̹��� ������ �Ű������� ���޹޴´�
	public GraphicObject(String name) {
		//�Ű������� ���޹��� ���ϸ����� BufferdImage��ü�� ����
		try {
		img = ImageIO.read(new File(name));
		}catch(Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
	
	
	//�׷����̹����� ��ġ�� �����ϱ� ���� �޼ҵ��̸�
	//�ڽ�Ŭ�������� �ڽſ��� �µ��� ������ �� ��.
	public void update() {}
	
	//����� ��ġ�� �̹����� �ٽ� �׸��� ���� �޼ҵ�
	public void draw(Graphics g) {
		g.drawImage(img,x,y,null); //x,y��ǥ�� �̹����� �׷��ش�.
	}
	
	//��,�̻���,���ּ� ������ ��ü���� keyPressed�� �ڽſ��� �µ��� �������̵� �� ��.
	public void keyPressed(KeyEvent event) {}
	
}

