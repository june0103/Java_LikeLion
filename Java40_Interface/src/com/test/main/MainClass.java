package com.test.main;

public class MainClass {

	public static void main(String[] args) {

		// Interface
		// �߻� �޼��常 ������ �ִ� ���
		// �ڹٿ��� Ŭ������ �ϳ��� Ŭ������ ��� ���� �� �ִ�
		// ���� Ÿ���� ������ ���� �� �ֵ��� ����ϴ� ���� Interface
		// �ϳ��� Ŭ������ �ټ� Interface�� ���� �� �� �ִ�

		// interface�� ������ ���� ���
		System.out.printf("TestInterface1.a1 : %d\n", TestInterface1.a1);

		TestClass1 t1 = new TestClass1();
		t1.testMethod1();
		t1.testMethod2();

		// Ŭ������ ������ �������̽� Ÿ���� ������ ���� �� �ִ�.
		TestInterface1 t10 = new TestClass1();
		t10.testMethod1();

		TestInterface2 t20 = new TestClass1();
		t20.testMethod2();

		TestClass100 t100 = new TestClass100();
		TestClass200 t200 = new TestClass200();
		t100.testMethod1(t200);
		t100.testMethod2(t200);
		t100.testMethod3(t200);

		TestInterface1.testMethod100();

		// default �޼���� static�� �ƴϹǷ� �������̽� �̸��� ���� ȣ���� �Ұ���
//		Inter500.defaultMethod();
		
		// Inter500 ������ Ŭ������ ��ü ����
		TestClass500 t500 = new TestClass500();
		// Inter500�� �ִ� default �޼��� ȣ��
		t500.defaultMethod();
	}
}

interface TestInterface1 {
	// interface�� ������ ������ static final ����
	int a1 = 100;

	// �޼���
	// interface�� ������ �޼���� �߻� �޼���
	public void testMethod1();

	// �������̽��� static �޼��带 ������ �� �ִ�.
	public static void testMethod100() {
		System.out.println("testMethod100");
	}
}

interface TestInterface2 {

	public void testMethod2();

}

// interface�� ������ Ŭ����
// interface�� �ټ��� ������ �� �ִ�.
class TestClass1 implements TestInterface1, TestInterface2 {

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1�� testMethod1");
		System.out.printf("a1 : %d\n", a1);
	}

	@Override
	public void testMethod2() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1�� testMethod2");
	}

}

interface Inter1 {
	public void inter1Method();
}

interface Inter2 {
	public void inter2Method();
}

interface Inter3 {
	public void inter3Method();
}

class TestClass100 {

	public void testMethod1(Inter1 inter1) {
		inter1.inter1Method();
	}

	public void testMethod2(Inter2 inter2) {
		inter2.inter2Method();
	}

	public void testMethod3(Inter3 inter3) {
		inter3.inter3Method();
	}
}

class TestClass200 implements Inter1, Inter2, Inter3 {

	@Override
	public void inter3Method() {
		// TODO Auto-generated method stub
		System.out.println("TestClass200�� inter3Method");
	}

	@Override
	public void inter2Method() {
		// TODO Auto-generated method stub
		System.out.println("TestClass200�� inter2Method");
	}

	@Override
	public void inter1Method() {
		// TODO Auto-generated method stub
		System.out.println("TestClass200�� inter1Method");
	}

}

// interface�� �������̽� ���(���� ����� �ƴϴ�)
// ���� �����ؾ� �ϴ� �������̽����� ������� �ϳ��� �������̽��� ��� ���
// ��� ���� �������̽� �ϳ��� Ŭ������ �����ϸ� ���ϰ� ��� ����
interface Inter4 extends Inter1, Inter2, Inter3 {

	public void inter4Method();
}

class TestClass400 implements Inter4 {

	@Override
	public void inter1Method() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inter2Method() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inter3Method() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inter4Method() {
		// TODO Auto-generated method stub

	}

}

// default �޼���
// Java ������ ���� �ȵ� ���� �ִ�
// Java8 ���� ����

interface Inter500 {
	// default �޼���
	public default void defaultMethod() {
		System.out.println("defaultMethod");
	}
}

// Inter500 ������ Ŭ����
class TestClass500 implements Inter500 {

}