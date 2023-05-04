package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ȭó��
		// ������� �񵿱�ó���� �����Ѵ�.
		// �̿�, �ټ��� �����尡 ���� �޼��带 ȣ������ ��� �޼����� �ڵ尡 �񵿱������� ó���ȴ�.
		// ���� �����忡�� ȣ���ϴ� �޼��尡 ���������� ó���Ǳ⸦ ���Ѵٸ� �޼��带 ����ȭ ó���ϸ� �ȴ�.
		// �޼��带 ����ȭ ó���ϸ� �޼��带 ȣ���� ������ ������� �޼����� �ڵ尡 ����Ǹ� �޼����� �ڵ尡 ó���Ǵ� ���� �ٸ� �������
		// ����ϰ��ִ�.
		// �켱������ �ٽø��� ������ ó���� Ȯ���� ���� �ش� �����带 �� ���� �������ϱ� �����̴�

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		// ����ȭ ���� ������� ������ ������ ���
		// �޼ҵ忡 synchronized �� ���� ����ȭ��Ű�� ����������
		// �ٸ� �켱������ ������ � �����尡 ���� ���������� �𸥴�
		t1.start();
		t2.start();
		t3.start();
	}

}

class Thread1 extends Thread {
	@Override
	public void run() {
		TestClass.testMethod("Thread1");
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		TestClass.testMethod("Thread2");
	}
}

class Thread3 extends Thread {
	@Override
	public void run() {
		TestClass.testMethod("Thread3");
	}
}

class TestClass {
	// ��ü �������ʰ� �׳� ȣ���ϱ����� static���
	public synchronized static void testMethod(String name) {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%s : %d\n", name, i);
		}
	}
}