
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 형변형 (Type Casting)
		// 값을 다른 타입으로 변환하는 것을 의미한다.

		// 정수값을 4byte 기억장소 int형 변수에 저장
		// 4byte 값을 4byte 기억장소에 저장
		int a1 = 100;
		System.out.printf("a1 : %d\n", a1);

		// 8byte 기억장소에 4btye 크기의 값을 담는다.
		// 4btye 크기의 값은 8btye 크기의 값으로 변환되어 기억장소에 저장된다
		long a2 = 100;
		System.out.printf("a2 : %d\n", a2);

		// 4byte 기억장소에 8byte 크기의 값을 담는다.
		// 더 큰 용량을 가진 값을 작은 용량의 기억장소에 저장하기 위해서는 강제로 형변환 해야 한다.
		// 사용하지 않는게 좋다
		int a3 = (int) 100L;
		System.out.printf("a3 : %d\n", a3);

		int a4 = (int) 40000000000L;
		System.out.printf("a4 : %d\n", a4);

		int a5 = 500;
		long a6 = a5;

		System.out.printf("a6 : %d\n", a6);
	}

}
