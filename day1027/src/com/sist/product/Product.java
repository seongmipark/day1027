package com.sist.product;

import java.util.Random;

//'������'�� '�Һ���'�� ������ '��ǰ'Ŭ������ �����.
public class Product {

	//����Ǵ� ��ǰ�� ������ ������� ����.
	int number;
	
	//��ǰ�� ���� �����Ͽ����� �Һ��Ͽ����� �Ǻ��ϱ� ���� ����
	//�����ڰ� ���ο� ��ǰ�� �����ϸ� true�� ����
	//�Һ��ڰ� ��ǰ�� �Һ��ϸ� false�� ����
	public boolean isNew=false;
	
	//�����ڰ� ����� ���ο� ��ǰ�� �����ϴ� �޼ҵ� ����
	//�����ڰ� ��ǰ�� �����ϰ� �ִ� ���ȿ��� �Һ��ڰ� ������ �� ������ �ϱ� ����
	//'�Ӱ迵��'���� �����Ѵ�
	public synchronized void makeNumber() {
		
		//���ο���ǰ(����)�� �����ϱ� ���� �Һ� �Ͼ���ʴ� ���� �����·� �ֵ���
		//�Һ��� ��ǰ�� �Һ��ϰ� isNew�� false�� �����ϰ� notify�� �����ָ� �ݺ����� Ż���Ѵ�.
		while(isNew == true) {
			try {
				wait();	//���ܸ� �����־� ����ó���� ���ش�.			
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		//���ο���ǰ(����)�� ������ ������
		Random r = new Random();
		number = r.nextInt(100); //���ο� ��ǰ����
		System.out.println("�����ڰ� ���ο� ��ǰ ���� ==>"+number);
		isNew = true; // ���ο� ��ǰ�� ����Ǿ��ٴ� ǥ�÷� isNew�� true�� ����
		notify();     //������� ������(�Һ���)�� �����.
	}
	
	
	//�Һ��ڰ� ����� ��ǰ�� �Һ��ϱ� ���� �޼ҵ� ����
	public synchronized int getNumber() {
		
		//�����ڰ� ���ο� ��ǰ�� ������ ������ �����·� �ֵ��� �Ѵ�.(=���ο� ��ǰ�� �������� �ʴ� ����)
		//�����ڰ� ���ο� ��ǰ�� �����ϰ� isNew�� true�� ��� notify�� �����ָ� �ݺ��� Ż��
		while(isNew = false) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("�Һ��ڰ� ��ǰ �Һ��� ==>"+number);//�Һ��ڰ� ��ǰ�� �Һ���
		isNew = false;  //�Һ��ڰ� ��ǰ�� �Һ��Ͽ��ٴ� ǥ�÷� isNew�� false�� ����
		notify();		//������� �����ڸ� �����ش�.
		return number;
	}
	
}
