package com.test.zoo;

public class AnimalClass {
	// �ٸ� ����
	int numberLegs;
	// ���� ����
	String lengthNose;
	// ���� ũ��
	String bodySize;
	// �̸�
	String name;
	// ���� Ÿ��
	String type;

	// �Ļ� ���
	public void howEat() {

	}

	// ���
	public void printInfo() {
		System.out.printf("���� Ÿ�� : %s\n", type);
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("�ٸ� ���� : %d\n", numberLegs);
		System.out.printf("���� ���� : %s\n", lengthNose);
		System.out.printf("���� ũ�� : %s\n", bodySize);
	}
}