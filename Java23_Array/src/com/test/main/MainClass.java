package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ ������ 10���� �����ϴ� �迭
		int[] array1 = new int[10];

		// ���� ��´�.
		array1[0] = 100;
		array1[1] = 200;
		array1[2] = 300;

		// ���
		System.out.printf("arra1[0] : %d\n", array1[0]);
		System.out.printf("arra1[1] : %d\n", array1[1]);
		System.out.printf("arra1[2] : %d\n", array1[2]);

		// �迭 ������ ������ ���� �־��ش�.
		int[] array2 = { 1, 2, 3 };
		System.out.printf("array2[0] : %d\n", array2[0]);
		System.out.printf("array2[1] : %d\n", array2[1]);
		System.out.printf("array2[2] : %d\n", array2[2]);

		// for in ����
		// �迭 ��� ���� ������ ������ �����͸� �����ϴ� ��ҿ� ����
		// �ݺ����� �������� �� �� ����Ѵ�.
		// �� �ݺ� Ƚ���� ���� �� ��°�� �ش��ϴ� ���� ������ ����.
		for (int value : array2) {
			System.out.printf("value : %d\n", value);
		}

		// ��ü�� ID�� ���� �迭�� �����Ѵ�.
		TestClass1[] array3 = new TestClass1[3];
		// ���� �迭�� ��ü�� ID�� ���� �� �ִ� ���� ���� 3����
		// ���� �迭�� ������ ���̴�.
		// �̿� �迭 ���� �� ��ü�� �����Ͽ� ������ �Ѵ�.
		array3[0] = new TestClass1();
		array3[1] = new TestClass1();
		array3[2] = new TestClass1();

		for (TestClass1 t1 : array3) {
			System.out.printf("t1 : %s\n", t1);
		}

		// ��ü�� �����ϴ� �������� ����
		System.out.printf("array3 length : %d\n", array3.length);
	}

}

class TestClass1 {
	int memberA;
}
