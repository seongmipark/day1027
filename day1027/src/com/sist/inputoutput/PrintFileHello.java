package com.sist.inputoutput;

import java.io.FileWriter;

public class PrintFileHello {

	public static void main(String[] args) {
		//���� �̸��� ���̸� ���Ϸ� ����غ���
		//���ڴ����� ����� ���� Writer�� �ļ� �߿� 
		//���Ϸ� ����� ���� FileWriter�� �����غ���
		
		try {
		FileWriter fw = new FileWriter("c:/myData/hello.txt");
		fw.write("���� �̸��� ȫ�浿�̰�\n");
		fw.write("���̴� 20���Դϴ�.");
		
		//������ ����� ������ ������ �ݾ���� �Ѵ�.
		//���� �ʴ��� ���� ���� ������ ���� ���� �� ������
		//�� ������ ���� �ٸ��������� ����Ѵٸ� �ݾ����� �ʾ� �ٸ������� ����� �� ���� �ȴ�.
		fw.close();
		System.out.println("������ �����Ͽ����ϴ�.");
		
		}catch(Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}
