import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기존 3명의 학생이 정보를 입력받지 않고 원하는 수만큼 입력받아 출력

		Scanner scanner = new Scanner(System.in);

		Point3 point3 = new Point3();

		// 학생 수 입력
		point3.studentCount(scanner);

		// 학생 정보 입력

		for (Student3 s1 : point3.student3Array) {
			s1.inputStudent(scanner);
		}

		// 학생 정보 출력

		for (Student3 s1 : point3.student3Array) {
			s1.printStudent();
		}

		// 총점

		for (Student3 s1 : point3.student3Array) {
			// 총점을 구한다.
			point3.koreansum = point3.koreansum + s1.korean;
			point3.engsum = point3.engsum + s1.english;
			point3.mathsum = point3.mathsum + s1.math;
		}

		System.out.printf("국어 총점 : %d\n", point3.koreansum);
		System.out.printf("영어 총점 : %d\n", point3.engsum);
		System.out.printf("수학 총점 : %d\n", point3.mathsum);

		// 평균
		int koreanAvg = point3.koreansum / point3.count;
		int englishAvg = point3.engsum / point3.count;
		int mathAvg = point3.mathsum / point3.count;

		System.out.printf("국어 평균 : %d\n", koreanAvg);
		System.out.printf("영어 평균 : %d\n", englishAvg);
		System.out.printf("수학 평균 : %d\n", mathAvg);
	}

}

//학생 클래스
class Student3 {
	// 변수
	// 이름
	String name;
	// 학년
	int grade;
	// 국어
	int korean;
	// 영어
	int english;
	// 수학
	int math;

	// 학생의 정보를 입력받기 위한 메소드
	public void inputStudent(Scanner scanner) {
		System.out.print("이름 : ");
		name = scanner.next();
		System.out.print("학년 : ");
		grade = scanner.nextInt();
		System.out.print("국어 : ");
		korean = scanner.nextInt();
		System.out.print("영어 : ");
		english = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
	}

	// 학생의 정보를 출력하기 위한 메소드
	public void printStudent() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("학년 : %d\n", grade);
		System.out.printf("국어 : %d\n", korean);
		System.out.printf("영어 : %d\n", english);
		System.out.printf("수학 : %d\n", math);
	}

}

//총점과 평균을 구하기 위한 클래스
class Point3 {

	// 학생의 수를 입력받을 변수
	int count;

	// 학생 정보를 담을 배열의 변수
	Student3[] student3Array;

	int koreansum;
	int engsum;
	int mathsum;

	// 학생의 수를 입력받는 메서드
	public void studentCount(Scanner scanner) {
		System.out.print("학생 수 : ");
		count = scanner.nextInt();

		// 입력한 학생의 수만큼 배열 생성하고 객체를 생성
		student3Array = new Student3[count];
		for (int i = 0; i < count; i++) {
			student3Array[i] = new Student3();
		}
	}

}
