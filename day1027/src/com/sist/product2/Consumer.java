package com.sist.product2;

//�Һ��ڸ� ���� Ŭ���� �����
public class Consumer extends Thread {
	
	//��ǰ�� ���� Ŭ������ �ɹ������� ����
	//�� ��ǰ��ü�� �����ڰ� �����ִ� ��ǰ�� ������ ��ü�̴�. ==>���� ��ǰ�� �����ڿ����� ��
	private Product product;
	
	//�Һ��� ��ü �����ÿ� ��ǰ��ü�� �Ű������� ���޹޾� ��������� �����Ѵ�.
	public Consumer(Product product) {
		this.product = product;
	}
	
	//�����尡 �ؾ��� ���� run�� �������̵��Ͽ� ���ش�.
	public void run() {
		
		//�ݺ������Ͽ� 10���� ��ǰ�� ����ϵ��� ����
		for(int i=1;i<=10;i++) {
			product.getNumber();  //��ǰ�� �Һ��ϱ� ���� getNumber�޼ҵ带 ȣ��
		
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
}
