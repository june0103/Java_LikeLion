import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3명의 학생의 이름, 학년, 국어점수, 영어점수, 수학점수 입력
		// 입력받은 각 과목의 점수의 총 합을구하고, 평균을 구한다
		// 모든 정보를 출력한다

		// 순서
		// 문제분석
		// 기능정리
		// 기능구현을 위해 필요한 변수
		// 클래스를 설계(주석)
		// 클래스 내부의 변수와 메서드 정의

		// 입력을 받기위한 scanner
		Scanner scanner = new Scanner(System.in);

		// 학생의 정보만 다를뿐 변수는 동일하기에 객체화시킨다
		// Student 클래스 생성 후 객체 생성
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		// 생성된 학생객체에 정보 입력
		s1.inputStudent(scanner);
		s2.inputStudent(scanner);
		s3.inputStudent(scanner);
		// 입력받은 학생정보 출력
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();

		// 각 과목의 총점과 평균을 구하기 위해 클래스와 메서드 생성
		// 객체 생성
		Point point = new Point();
		point.Sum(s1, s2, s3);
		point.avg();

	}

}

// 학생 클래스
class Student2 {
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

// 총점과 평균을 구하기 위한 클래스
class Point {

	int koreansum;
	int engsum;
	int mathsum;

	// 과목별 총점 메서드
	public void Sum(Student2 s1, Student2 s2, Student2 s3) {
		koreansum = s1.korean + s2.korean + s3.korean;
		engsum = s1.english + s2.english + s3.english;
		mathsum = s1.math + s2.math + s3.math;

		System.out.printf("국어 총점 : %d\n", koreansum);
		System.out.printf("영어 총점 : %d\n", engsum);
		System.out.printf("수학 총점 : %d\n", mathsum);
	}

	// 과목별 평균 메서드
	public void avg() {
		int koavg = koreansum / 3;
		int engavg = engsum / 3;
		int mathavg = mathsum / 3;
		System.out.printf("국어 평균 : %d\n", koavg);
		System.out.printf("영어 평균 : %d\n", engavg);
		System.out.printf("수학 평균 : %d\n", mathavg);
	}

}
