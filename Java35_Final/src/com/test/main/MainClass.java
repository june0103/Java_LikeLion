package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// final
		// ���̻� ������ �� ���ٴ� �ǹ̸� ������ �ִ�.
		// ���� : ������ �ٸ� ���� ������ �� ����.
		// �޼��� : �ڽ� Ŭ�������� overriding�� �Ұ����ϴ�
		// Ŭ���� : ����� �Ұ����ϴ�.

		TestClass1 t1 = new TestClass1();
		System.out.printf("t1.FINAL_VALUE : %d\n", t1.FINAL_VALUE);

		// final ������ ���� �����Ϸ� �ϸ� �����߻�
		t1.FINAL_VALUE = 300;
	}

}

class TestClass1 {
	// final ����
	// final ������ ������ ������ ���Ŀ� ���� ������ �� ����.
	// �̿�, ������ ���� �� �� ���� ����
	// ��� ������ �� ������ ������ �� ���
	final int FINAL_VALUE = 100;

}

class SuperClass1 {

	public final void method1() {
		System.out.println("SuperClass1�� method1");
	}
}

class SubClass1 extends SuperClass1 {
	// SuperClass1�� final �޼��� overriding �Ұ���
	public void method1() {
		System.out.println("SubClass1�� method1");
	}
}

// final class
// ������ ��ü�� �����ؼ� ���������� ���� ������ �� �ֵ��� �Ұ��
final class SuperClass2{
	
}

// final class ��ӹ޴´�
class SubClass2 extends SuperClass2{
	
}