package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static
		// ��ü�� �������� �ʰ� ����ϴ� ��ҷν� Ŭ���� �̸��� ���� ������ �� �ִ�.
		// ���� : ���α׷��� ���۵Ǿ� Ŭ�������� �޸𸮿� �ö� �� �����Ǵ� ����
		// ��ü ���� ������ ���ؼ��� ����� �����ϸ� �� �ϳ��� ������ �����ȴ�.
		// ���α׷� ��ü���� �� �ϳ��� �����ϴ� ���� ������ �� ����Ѵ�.
		// �޼��� : static ������, �Ű������� ������ ���������� ����� �����ϴ�.
		// static������ �Ű������� ������ ���������� ����ϴ� �޼����� ��� static���� �����ϸ� ���ϰ� ����� �� �ִ�.

		// static ��� ���
		System.out.printf("TestClass1.memberB : %d\n", TestClass1.memberB);
		TestClass1.method2();

		// ��ü �������� ������� ���
		// static�� �ƴ� ��� ���� ��ü�� �����ؾ����� ����� �� �ֱ� ������ static ó�� Ŭ���� �̸����� �����ϴ� ���� �Ұ��� �ϴ�.
		System.out.printf("TestClass1.memberA : %d\n", TestClass1.memberA);
		TestClass1.method1();

		// ��ü�� ����
		TestClass1 t1 = new TestClass1();
		// ��ü ���� ������ ���� ��ü�� ����� ����
		System.out.printf("t1.memberA : %d\n", t1.memberA);
		t1.method1();
		// ��ü ���� ������ ���� static ��ҿ� �����Ѵ�.
		System.out.printf("t1.memberB : %d\n", t1.memberB);
		t1.method2();

	}

}

class TestClass1 {
	// �������
	int memberA = 100;
	// static ����
	static int memberB = 200;

	// ��� �޼���
	public void method1() {
		System.out.println("method1 ȣ��");
		// ��ü�� �����ؾ����� ����� �� �ִ� �޼���� ��� static ��ҿ� ���ٰ���
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
		method2();
		
	}

	// static �޼���
	public static void method2() {
		System.out.println("method2 ȣ��");
		// static �޼���� ��ü�� �������� �ʾƵ� ȣ���� �����ϱ� ������ ��ü�� ������� ���� �Ұ���
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
		method1();
		
	}
}