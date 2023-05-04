package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ �켱����.
		// ���� �����带 ���� ������ �� �켱������ ó���� �����带 ������ �� �ִ�.
		// ������ �켱������ �������� ���� ó������ Ȯ���� �������� ��
		
		// ������ ��ü ����
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();

		// ������ �켱���� Ȯ��
		int p1 = t1.getPriority();
		int p2 = t2.getPriority();
		int p3 = t3.getPriority();
		System.out.printf("p1 : %d\n", p1);
		System.out.printf("p2 : %d\n", p2);
		System.out.printf("p3 : %d\n", p3);

		// ������ ����
		t1.start();
		t2.start();
		t3.start();

		// �켱���� ����
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
	}

}

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			System.out.println("Thread1");
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread2");
		}
	}
}

class Thread3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread3");
		}
	}
}