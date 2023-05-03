package com.test.main;

public class MainClass {

	public static void main(String[] args) {

		// Interface
		// 추상 메서드만 가지고 있는 요소
		// 자바에서 클래스는 하나의 클래스만 상속 받을 수 있다
		// 여러 타입의 변수에 담을 수 있도록 사용하는 것이 Interface
		// 하나의 클래스는 다수 Interface를 구현 할 수 있다

		// interface에 정의한 변수 사용
		System.out.printf("TestInterface1.a1 : %d\n", TestInterface1.a1);

		TestClass1 t1 = new TestClass1();
		t1.testMethod1();
		t1.testMethod2();

		// 클래스가 구현한 인터페이스 타입형 변수에 담을 수 있다.
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

		// default 메서드는 static이 아니므로 인터페이스 이름을 통해 호출이 불가능
//		Inter500.defaultMethod();
		
		// Inter500 구현한 클래스의 객체 생성
		TestClass500 t500 = new TestClass500();
		// Inter500에 있는 default 메서드 호출
		t500.defaultMethod();
	}
}

interface TestInterface1 {
	// interface에 정의한 변수는 static final 변수
	int a1 = 100;

	// 메서드
	// interface에 정의한 메서드는 추상 메서드
	public void testMethod1();

	// 인터페이스에 static 메서드를 정의할 수 있다.
	public static void testMethod100() {
		System.out.println("testMethod100");
	}
}

interface TestInterface2 {

	public void testMethod2();

}

// interface를 구현한 클래스
// interface는 다수를 구현할 수 있다.
class TestClass1 implements TestInterface1, TestInterface2 {

	@Override
	public void testMethod1() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1의 testMethod1");
		System.out.printf("a1 : %d\n", a1);
	}

	@Override
	public void testMethod2() {
		// TODO Auto-generated method stub
		System.out.println("TestClass1의 testMethod2");
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
		System.out.println("TestClass200의 inter3Method");
	}

	@Override
	public void inter2Method() {
		// TODO Auto-generated method stub
		System.out.println("TestClass200의 inter2Method");
	}

	@Override
	public void inter1Method() {
		// TODO Auto-generated method stub
		System.out.println("TestClass200의 inter1Method");
	}

}

// interface의 인터페이스 상속(다중 상속이 아니다)
// 자주 구현해야 하는 인터페이스들이 많을경우 하나의 인터페이스에 모두 상속
// 상속 받은 인터페이스 하나만 클래스에 구현하면 편하게 사용 가능
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

// default 메서드
// Java 버전에 따라 안될 수도 있다
// Java8 부터 가능

interface Inter500 {
	// default 메서드
	public default void defaultMethod() {
		System.out.println("defaultMethod");
	}
}

// Inter500 구현한 클래스
class TestClass500 implements Inter500 {

}