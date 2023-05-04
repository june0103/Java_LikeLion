package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 동기 : 작업을 순차적으로 처리
		// 비동기 : 동시에 여러 작업을 처리
		// 동기적인 작업 다수를 비동기적으로 처리
		// Thread : 자바에서 비동기 처리를 지원하기 위해 제공하는 클래스

		// 오류가 발생할 가능성이 높은 작업의 경우 별도의 쓰래드로 운영하면 안정적으로 운연 할 수 있다
		
		
		// Thread 클래스를 상속받은 쓰래드 클래스
		TestClass1 t1 = new TestClass1();
		t1.start();

		// Runnable 인터페이스를 구현한 클래스
		// start 객체가 없기에 쓰레드 객체를 만들어 주어 시작
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

// Thread를 상속받은 클래스
class TestClass1 extends Thread {
	// Thread를 발생시켜 처리할 메서드
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

// runnable 인터페이스로 구현한 클래스
// 클래스가 다른 클래스를 상속받고 있을경우 Runnable 인터페이스로 구현
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