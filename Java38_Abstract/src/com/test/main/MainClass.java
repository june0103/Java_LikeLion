package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �߻� �޼���
		// �ڵ� �κ��� ���� �̿ϼ� �޼���
		// �߻� Ŭ����
		// �߻� �޼��带 ������ �ִ� Ŭ����
		// �߻� Ŭ������ �������� ���� �޼��带 ������ �ֱ� ������ ��ü ���� �Ұ���
		// �߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ ����� �߻� �޼��带 overriding�Ͽ� ���

		// �߻� Ŭ���� ��ü ����
		// �߻� Ŭ������ �Ϻ��� Ŭ������ �ƴϱ� ������ ���� ��ü�� �����ϴ� ���� �Ұ���
		// TestClass1 t1 = new TestClass1();

		TestClass2 t2 = new TestClass2();
		t2.testMethod1();
		t2.testMethod2();

		TestClass1 t1 = new TestClass2();
		t1.testMethod2();

		TestClass1 t10 = new TestClass1() {

			@Override
			public void testMethod2() {
				// TODO Auto-generated method stub
				System.out.println("�͸� ��ø Ŭ���� ���");
			}
		};
		t10.testMethod2();
	}

}

// �߻� Ŭ����
// �߻� �޼��带 ������ �ִ� Ŭ����
// Ŭ���� �տ� abstract�� �����ش�.
abstract class TestClass1 {

	public void testMethod1() {
		System.out.println("�Ϲ� �޼���");
	}

	// �߻� �޼���
	// �ڵ带 �ۼ��ϴ� ��ü �κ��� ���� �޼���
	// �޼��� �տ� abstract Ű���带 �����ش�.
	abstract public void testMethod2();
}

// �߻� Ŭ������ ��ӹ޾� ������ Ŭ����
class TestClass2 extends TestClass1 {

	@Override
	public void testMethod2() {
		System.out.println("TestClass2���� ������ testMethod2");

	}

}