package com.sist.product;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ǰ ��ü�� �����Ѵ�
		Product product = new Product();
	
		//������ �����尴ü�� �����Ѵ�.
		Producer p = new Producer(product);

		//�Һ��� �����尴ü�� �����Ѵ�.
		Consumer c = new Consumer(product);
	
		//�����ڿ� �Һ��ڸ� ����
		p.start();	
		c.start();
	}
}
