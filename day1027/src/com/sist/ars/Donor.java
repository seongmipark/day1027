package com.sist.ars;

//"������"�� ���� Ŭ������ �����带 ��ӹ޾� ����
public class Donor extends Thread {
	private String name;	//'������'�� �̸��� ���� �������
	private Account tvArs;	//'������'���� '��ݾ�'�� �����ϱ� ���� ��������� ����
	
	//������ ��ü �����ÿ� �������� �̸��� ������ ��ݾ� ��ü�� �Ű������� ���޹޾�
	//�ɹ������� ����
	public Donor(String name, Account tvArs) {
		this.name = name;
		this.tvArs = tvArs;
	}
	
	
	//�����尡 �ؾ��� ���� run�� �������̵��Ͽ� ���ش�
	public void run() {
		
		for(int i=1; ; i++) { // ��� �ݺ��Ͽ� 
			
			//�Ա��ϱ����� ��ݾױ� �ʸ����� �Ѿ����� �ݺ��� Ż��
			if(tvArs.getBalance() >= 100000) {
				break;
			}
			
			tvArs.deposit(1000); //��ݾװ�ü�� 1000���� �Ա�
			System.out.println(name+"��(��) "+i+"��° �Ա��Ͽ����ϴ�."); //���° �Ա��ߴ��� ���
			try {
				Thread.sleep(200); // 0.2�� ���
			}catch(Exception e) {
				
			}
		}
	}

}
