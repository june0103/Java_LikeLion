import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3���� �л��� �̸�, �г�, ��������, ��������, �������� �Է�
		// �Է¹��� �� ������ ������ �� �������ϰ�, ����� ���Ѵ�
		// ��� ������ ����Ѵ�

		// ����
		// �����м�
		// �������
		// ��ɱ����� ���� �ʿ��� ����
		// Ŭ������ ����(�ּ�)
		// Ŭ���� ������ ������ �޼��� ����

		// �Է��� �ޱ����� scanner
		Scanner scanner = new Scanner(System.in);

		// �л��� ������ �ٸ��� ������ �����ϱ⿡ ��üȭ��Ų��
		// Student Ŭ���� ���� �� ��ü ����
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		// ������ �л���ü�� ���� �Է�
		s1.inputStudent(scanner);
		s2.inputStudent(scanner);
		s3.inputStudent(scanner);
		// �Է¹��� �л����� ���
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();

		// �� ������ ������ ����� ���ϱ� ���� Ŭ������ �޼��� ����
		// ��ü ����
		Point point = new Point();
		point.Sum(s1, s2, s3);
		point.avg();

	}

}

// �л� Ŭ����
class Student2 {
	// ����
	// �̸�
	String name;
	// �г�
	int grade;
	// ����
	int korean;
	// ����
	int english;
	// ����
	int math;

	// �л��� ������ �Է¹ޱ� ���� �޼ҵ�
	public void inputStudent(Scanner scanner) {
		System.out.print("�̸� : ");
		name = scanner.next();
		System.out.print("�г� : ");
		grade = scanner.nextInt();
		System.out.print("���� : ");
		korean = scanner.nextInt();
		System.out.print("���� : ");
		english = scanner.nextInt();
		System.out.print("���� : ");
		math = scanner.nextInt();
	}

	// �л��� ������ ����ϱ� ���� �޼ҵ�
	public void printStudent() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("�г� : %d\n", grade);
		System.out.printf("���� : %d\n", korean);
		System.out.printf("���� : %d\n", english);
		System.out.printf("���� : %d\n", math);
	}

}

// ������ ����� ���ϱ� ���� Ŭ����
class Point {

	int koreansum;
	int engsum;
	int mathsum;

	// ���� ���� �޼���
	public void Sum(Student2 s1, Student2 s2, Student2 s3) {
		koreansum = s1.korean + s2.korean + s3.korean;
		engsum = s1.english + s2.english + s3.english;
		mathsum = s1.math + s2.math + s3.math;

		System.out.printf("���� ���� : %d\n", koreansum);
		System.out.printf("���� ���� : %d\n", engsum);
		System.out.printf("���� ���� : %d\n", mathsum);
	}

	// ���� ��� �޼���
	public void avg() {
		int koavg = koreansum / 3;
		int engavg = engsum / 3;
		int mathavg = mathsum / 3;
		System.out.printf("���� ��� : %d\n", koavg);
		System.out.printf("���� ��� : %d\n", engavg);
		System.out.printf("���� ��� : %d\n", mathavg);
	}

}
