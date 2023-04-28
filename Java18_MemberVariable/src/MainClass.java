
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass1 t1 = new TestClass1();
		t1.testMethod1();
		
		// 객체 참조변수를 통한 멤버 변수 접근
		// 메서드와 동일하게 . 을 통해 접근
		System.out.printf("t1.memberA1 : %d\n", t1.memberA1);
		System.out.printf("t1.memberA2 : %d\n", t1.memberA2);

	}

}

class TestClass1 {
	// 멤버 변수
	// 객체에서 선언되어 같은 객체 내부라면 자유롭게 접근하여 사용할 수 있는 변수
	// 중복된 이름으로 선언될 수 없다.
	// 다른 곳에서 접근하기 위해서는 “ . “ 연산자를 이용한다.
	int memberA1 = 100;
	int memberA2 = 200;

	// 같은 클래스에 정의한 메서드에서 변수를 사용한다.
	public void testMethod1() {
		// 같은 클래스에 정의한 메서드 내에서는 멤버 변수의 접근이 자유롭고
		// 변수의 이름만 작성하면 된다.
		System.out.printf("memberA1 : %d\n", memberA1);
		System.out.printf("memberA2 : %d\n", memberA2);
	}
}