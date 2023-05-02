package com.test.main;

import com.test.zoo.ZooClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ��ü�� �����Ѵ�.
		ZooClass zooClass = new ZooClass();
		
		// �Է¹��� ������ Ÿ�� ��ȣ
		int typeNumber = 0;
		
		// �Է� �޴� ���� ��ȣ�� 0�� �ƴ� ���� �ݺ��Ѵ�.
		do {
			typeNumber = zooClass.inputAnimalType();
			
			// ���� Ÿ�� ��ȣ�� 0�� �ƴ϶��...
			if(typeNumber != 0) {
				// ���� ��ü�� ����ش�.
				zooClass.addAnimal(typeNumber);	
			}
			
		} while(typeNumber != 0);
		
		// �Է��� �������� ������ ����Ѵ�.
		zooClass.printAnimalInfo();
	}
}
