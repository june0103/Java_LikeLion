package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 동기화처리
		// 쓰래드는 비동기처리를 수행한다.
		// 이에, 다수의 쓰래드가 같은 메서드를 호출했을 경우 메서드의 코드가 비동기적으로 처리된다.
		// 만약 쓰래드에서 호출하는 메서드가 동기적으로 처리되기를 원한다면 메서드를 동기화 처리하면 된다.
		// 메서드를 동기화 처리하면 메서드를 호출한 쓰래드 순서대로 메서드의 코드가 수행되며 메서드의 코드가 처리되는 동안 다른 쓰래드는
		// 대기하고있다.
		// 우선순위는 다시말해 더많이 처리할 확률을 높여 해당 쓰레드를 더 빨리 끝내게하기 위함이다

		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		// 동기화 하지 않을경우 순서가 섞여서 출력
		// 메소드에 synchronized 를 붙혀 동기화시키면 순차적진행
		// 다만 우선순위가 같을시 어떤 쓰레드가 먼저 동작할지는 모른다
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
	// 객체 만들지않고 그냥 호출하기위해 static사용
	public synchronized static void testMethod(String name) {
		for (int i = 0; i < 100; i++) {
			System.out.printf("%s : %d\n", name, i);
		}
	}
}