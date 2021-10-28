package com.sist.product;

//�����ڸ� ���� Ŭ������ �����.
public class Producer extends Thread {
	
	//'��ǰ'�� ���� Ŭ������ ��������� ����
	private Product product;

	//������ ��ü �����ÿ� ��ǰ ��ü�� �Ű������� ���޹޾� ������� '��ǰ'�� �ʱ�ȭ�Ѵ�
	public Producer(Product product) {
		this.product = product;
	}
	
	//������ Ŭ������ ����Ͽ� ���ο� ��ǰ�� �����ϱ� ���� �޼ҵ带 ȣ���Ű�� ����
	//�����尡 �ؾ��ϴ� ���� run�޼ҵ带 �������̵��Ͽ� ���ش�.
	public void run() {
		
		//10���� ���ο� ��ǰ�� �����ϵ��� ����
		for(int i=1;i<=10;i++) {
			product.makeNumber(); 
			//���ο� ��ǰ(����)�� �����ϱ� ���� '��ǰ'��ü�� makeNumber�޼ҵ� ȣ�� 
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
