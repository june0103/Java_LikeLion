
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 클래스를 통해 객체를 생성한다.
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1 : %s\n", t1);

		//t1에 저장되어 있는 객체의 ID를 t2에 저장
		TestClass1 t2 = t1;
		System.out.printf("t2 : %s\n", t2);
		
		//새로운 객체 생성
		TestClass1 t3 = new TestClass1();
		System.out.printf("t3 : %s\n", t3);
		
	}

}

// 클래스 정의
class TestClass1 {

}
