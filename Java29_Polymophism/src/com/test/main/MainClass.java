package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ : ���°� �پ��ϴٶ�� ��.
		// ��ü ���⿡�� �������� �ǹ̴� ������ ��ü�� ���°� �پ��ϴٴ� �ǹ̷� ���

		TestClass1 t1 = new TestClass1();
		// TestClass1�� ���� ���� ��ü�� TestClass2 Ÿ���� ������ ��´�
		// ��ü�� �������� �� ����ߴ� Ŭ���� Ÿ���� ������ ��ü�� ID�� ���� �� �ִ�.
		// �ٸ� Ŭ���� Ÿ���� ������ ��ü�� ID�� ���°� ����
		// TestClass t2 = t1;

		// ������ ��ü��ID�� �θ� Ŭ������ ������ ��� ���� ����
		TestClass4 t4 = new TestClass4();
		TestClass3 t3 = t4;
		System.out.printf("t4 : %s\n", t4);
		System.out.printf("t3 : %s\n", t3);

		// ��ü�� �������� �� ����ߴ� Ŭ���� Ÿ���� ������ �̿��� ��� ���
		// �θ��� ������ ��� ��� ����
		System.out.printf("t4.memberA : %d\n", t4.memberA);
		System.out.printf("t4.memberB : %d\n", t4.memberB);
		System.out.printf("t4.memberC : %d\n", t4.memberC);
		System.out.printf("t4.memberD : %d\n", t4.memberD);

		// �θ� Ŭ���� Ÿ���� ������ �̿��� ��� ���
		System.out.printf("t3.memberA : %d\n", t3.memberA);
		System.out.printf("t3.memberB : %d\n", t3.memberB);
		// TestClass4�� ������ ��ü�� �����ߴٰ� �ϴ��� ������ �θ�Ŭ����
		// Ÿ���� �����̱� ������ �θ� Ŭ���� ������ ������ �� �ִ�.
		// System.out.printf("t3.memberC : %d\n",t3.memberC);
		// System.out.printf("t3.memberD : %d\n",t3.memberD);

	}

}

class TestClass1 {

}

class TestClass2 {

}

class TestClass3 {
	int memberA = 100;
	int memberB = 200;
}

class TestClass4 extends TestClass3 {
	int memberC = 300;
	int memberD = 400;
}