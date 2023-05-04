package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� : �۾��� ���������� ó��
		// �񵿱� : ���ÿ� ���� �۾��� ó��
		// �������� �۾� �ټ��� �񵿱������� ó��
		// Thread : �ڹٿ��� �񵿱� ó���� �����ϱ� ���� �����ϴ� Ŭ����

		// ������ �߻��� ���ɼ��� ���� �۾��� ��� ������ ������� ��ϸ� ���������� � �� �� �ִ�
		
		
		// Thread Ŭ������ ��ӹ��� ������ Ŭ����
		TestClass1 t1 = new TestClass1();
		t1.start();

		// Runnable �������̽��� ������ Ŭ����
		// start ��ü�� ���⿡ ������ ��ü�� ����� �־� ����
		TestClass2 t2 = new TestClass2();
		Thread thread = new Thread(t2);
		thread.start();
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(1000);
				System.out.println("main");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// Thread�� ��ӹ��� Ŭ����
class TestClass1 extends Thread {
	// Thread�� �߻����� ó���� �޼���
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(500);
				System.out.println("TestClass1 extends Thread");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// runnable �������̽��� ������ Ŭ����
// Ŭ������ �ٸ� Ŭ������ ��ӹް� ������� Runnable �������̽��� ����
class TestClass2 implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(300);
				System.out.println("TestClass2 Runnable inter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}