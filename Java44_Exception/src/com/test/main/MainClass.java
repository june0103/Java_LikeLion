package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 예외처리
		// 프로그램 수행중에 오류(예외)가 발생하거나 발생할 가능성이 있다면 JVM은
		// 오류가 JVM이나 OS에 전파되는 것을 막기위해 프로그램을 강제 종료시킨다.
		// 이때, 강제 종류가 되지 않게 하고 개발자가 준비한 오류 발생시 수행되어야
		// 하는 코드가 수행될 수 있도록 하여 오류를 대비하게 해주는 것이
		// 예외 처리
		// try : 원하는 처리의 코드
		// catch : 오류가 발생했거나 발생할 가능성이 있을때 동작하는 코드

		// 원하는 처리를 수행할 수 있는 코드 중 예외가 발생할 가능성이 있는 부분을 try로 묶어준다.
		try {
			// 0으로 나눈다.
//			int a1 = 10 / 0;

			// 객체의 아이디를 가지고 있지 않은 변수를 통해 객체 접근을 시도한다.
			TestClass1 t1 = null;
//			t1.testMethod1();

//			int[] array1 = new int[10];
//			array1[20] = 200;

			System.out.println("오류 발생 시점 이후의 try 코드");
		} catch (ArithmeticException e) {
			System.out.println("수학연산 오류 발생");
		} catch (NullPointerException e) {
			System.out.println("객체 참조 오류 발생");
		} catch (Exception e) {
			// 오류가 발생했을 때 처리될 코드는 catch부분에 작성
			System.out.println("오류 발생");
			// 오류의 내용을 보고싶을 때 사용
			System.out.println(e);
			e.printStackTrace();
		}
		// try catch로 묶지 않으면 이부분이 실행이 안되고 프로그램 종료
		System.out.println("이 부분을 실행하겠습니까?");

		// 양수 판별
		try {

			TestClass1 t100 = new TestClass1();
			t100.testMethod2(100);
			t100.testMethod2(-100);

		} catch (Exception e) {
			System.out.println("오류발생");
		}

		// throws - try catch로 묶지 않는다면 오류발생
		// testMethod3는 예외들을 throws하고 있기 때문에
		// 반드시 예외처리를 해줘야 한다.
		try {
			TestClass1 t200 = new TestClass1();
			t200.testMethod3(100);
			t200.testMethod3(200);
			t200.testMethod3(-100);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class TestClass1 {
	public void testMethod1() {
		System.out.println("TestClass1의 testMethod1");
	}

	public void testMethod2(int a1) {
		// a1에 음수가 들어오면 오류 발생
		if (a1 <= 0) {
			throw new ArithmeticException("양수가 아니다");
		}
		System.out.println("a1은 양수");
	}

	// throws : 이 메서드를 수행할 때 지정한 예외가 발생할 가능성이 있다고 알려준다
	// throw : 오류발생처리
	// 이렇게 해주면 이 메서드를 호출하는 쪽은 무조건 예외처리를 해야한다
	// RunTimeException을 상속받은 것들은 throws해도 예외처리에 대한 강제성을 줄 수 없기 땜누에 Exception도 전달필요
	public void testMethod3(int a1) throws Exception, ArithmeticException {
		// a1에 음수가 들어오면 오류 발생
		if (a1 <= 0) {
			throw new ArithmeticException("양수가 아니다");
		}
		System.out.println("a1은 양수");
	}
}