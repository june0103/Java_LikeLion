package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java39 AbstractEx �������� �迭�κ��� ArrayList�� ����

		// Factory ��ü ����
		Factory factory = new Factory();

		// �ڵ��� ����
		int carType = 0;

		do {
			// �ڵ��� ���� �Է�
			carType = factory.inputCarType();

			if (carType != 0) {
				// �ڵ��� ���� �Է�
				factory.inputCarInfo(carType);
			}
		} while (carType != 0);

		factory.printCarInfo();

	}

}
