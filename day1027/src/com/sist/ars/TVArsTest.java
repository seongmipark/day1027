package com.sist.ars;

public class TVArsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ݾ��� ���¸� ���� ��ü ����
		Account account = new Account();
		
		//5���� ������ ��ü�� �����Ѵ�
		Donor d1 = new Donor("�����", account);
		Donor d2 = new Donor("��þ�", account);
		Donor d3 = new Donor("�ӻ���", account);
		Donor d4 = new Donor("������", account);
		Donor d5 = new Donor("���ڿ�", account);
	
		//5���� �����ڵ��� �����ϰ� �Ա��ϵ��� ������ ����
		d1.start();
		d2.start();
		d3.start();
		d4.start();
		d5.start();
		
		//�������� �۾��� �Ϸ�ɶ����� ����Ű�� ���� join�޼ҵ带 ȣ��
		try {
			d1.join();			
			d2.join();			
			d3.join();			
			d4.join();			
			d5.join();			
		} catch (Exception e) {
			// TODO: handle exception
		} {
			
		}
		
		System.out.println("��ü ��ݾ�:"+account.getBalance());
		
	}

}
