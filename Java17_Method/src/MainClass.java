
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체생성
		Testclass t1 = new Testclass();
		// 메서드 호출
		t1.testMethod1();
		t1.testMethod2();

		// 객체생성
		Testclass2 t2 = new Testclass2();
		// 메서드 호출
		t2.testMethod3();
		t2.testMethod4();

		t1.testMethod5();

		// 반환값이 있는 메서드
		int a1 = t1.testMethod6();
		System.out.println(a1);

		// 매게변수를 가지고있는 메서드
		int a2 = t1.testMethod7(100, 200);
		System.out.printf("a2 : %d\n", a2);

		int a3 = t1.testMethod7(11, 22);
		System.out.printf("a3 : %d\n", a3);

	}

}

class Testclass {

	// 메서드
	public void testMethod1() {
		System.out.println("TestClass1의 testMethod1");
	}

	public void testMethod2() {
		System.out.println("TestClass1의 testMethod2");
	}

	// 중간에 return이 있는 메서드
	// return : 메서드는 모든 코드가 수행이 완료되면 메서드를 호출하는 쪽으로
	// 되돌아 간다. 그런데 메서드의 코드가 더 남아 있다고 하더라도 메서드의 수행을
	// 중단하고 호출한 쪽으로 돌아가고자 한다면 return 키워드를 사용한다.
	// 메서드 내부의 코드가 실행되는 안되는 상황인 경우 메서드의 수행을 중단시키기 위해 사용한다.

	public void testMethod5() {
		for (int i = 0; i < 10; i++) {
			if (i > 5) {

				return;
			}
			System.out.println(i);
		}
	}

	// 반환값
	// 메서드 수행이 완료되어(끝가지 갔거나 return을 만났거나) 메서드를 호출한 쪽으로
	// 되돌아 갈 때 값 하나를 전달할 수 있다.
	// 전달할 값이 있다면 메서드 이름 좌측에 전달할 값의 타입을 작성해줘야한다.
	// 만약 전달할 값이 void를 작성해 준다.
	public int testMethod6() {
		System.out.println("testMethod6 호출");
		return 100;
	}

	// 매개변수를 가지고있는 메서드
	// 매개변수 : 메서드를 정의할 때 정의해 주는 변수
	// 매개변수가 있는 메서드는 메서드를 호출 할 때 반드시 매개변수에 저장될 값을
	// 전달해 줘야 한다. 매개변수의 개수와 타입이 모두 일치해야 한다.
	public int testMethod7(int a1, int a2) {
		int r1 = a1 + a2;
		return r1;
	}
}

class Testclass2 {

	// 메서드
	public void testMethod3() {
		System.out.println("TestClass2의 testMethod3");
	}

	public void testMethod4() {
		System.out.println("TestClass2의 testMethod4");
	}
}
