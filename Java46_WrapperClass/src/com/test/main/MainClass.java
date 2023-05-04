package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Wrapper Ŭ���� : �⺻ �ڷ��� ���� �����ϱ� ���� �������� ���� Ŭ����
		// �⺻ �ڷ��� ���� �ľ�, ��ü�� �����ϰ� �����ϴ� �뵵�� ���

		// �ڷ����� ���� ������ �ľ��Ѵ�
		System.out.printf("Byte : %d\n", Integer.BYTES);
		System.out.printf("Size : %d\n", Integer.SIZE);
		System.out.printf("MAX : %d\n", Integer.MAX_VALUE);
		System.out.printf("MIN : %d\n", Integer.MIN_VALUE);

		// �⺻ �ڷ��� ���� ��ÿ �����ϴ� �뵵
		Integer a1 = new Integer(100);
		int a2 = a1.intValue();
		System.out.printf("a1 : %s\n", a1);
		System.out.printf("a2 : %d\n", a2);

		// Boxing
		// �⺻ �ڷ��� ���� Wrapper Ŭ���� Ÿ������ ������ش�.
		// ���� 100�� �����ϴ� Integer Ÿ�� ��ü�� �����ϰ� ��ü�� id��
		// a3 ������ ����ش�.
		Integer a3 = 100;
		// UnBoxing
		// Wrapper ��ü�� ��� ���� �����Ͽ� �⺻ �ڷ��� ���� ����ش�.
		int a4 = a3;
		System.out.printf("a3 : %d\n", a3);
		System.out.printf("a4 : %d\n", a4);

		int r1 = add(100, 200);
		System.out.printf("r1 : %d\n", r1);
	}

	public static int add(Integer a1, Integer a2) {
		return a1 + a2;
	}

}
