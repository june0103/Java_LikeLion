import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� 3���� �л��� ������ �Է¹��� �ʰ� ���ϴ� ����ŭ �Է¹޾� ���

		Scanner scanner = new Scanner(System.in);

		Point3 point3 = new Point3();

		// �л� �� �Է�
		point3.studentCount(scanner);

		// �л� ���� �Է�

		for (Student3 s1 : point3.student3Array) {
			s1.inputStudent(scanner);
		}

		// �л� ���� ���

		for (Student3 s1 : point3.student3Array) {
			s1.printStudent();
		}

		// ����

		for (Student3 s1 : point3.student3Array) {
			// ������ ���Ѵ�.
			point3.koreansum = point3.koreansum + s1.korean;
			point3.engsum = point3.engsum + s1.english;
			point3.mathsum = point3.mathsum + s1.math;
		}

		System.out.printf("���� ���� : %d\n", point3.koreansum);
		System.out.printf("���� ���� : %d\n", point3.engsum);
		System.out.printf("���� ���� : %d\n", point3.mathsum);

		// ���
		int koreanAvg = point3.koreansum / point3.count;
		int englishAvg = point3.engsum / point3.count;
		int mathAvg = point3.mathsum / point3.count;

		System.out.printf("���� ��� : %d\n", koreanAvg);
		System.out.printf("���� ��� : %d\n", englishAvg);
		System.out.printf("���� ��� : %d\n", mathAvg);
	}

}

//�л� Ŭ����
class Student3 {
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

//������ ����� ���ϱ� ���� Ŭ����
class Point3 {

	// �л��� ���� �Է¹��� ����
	int count;

	// �л� ������ ���� �迭�� ����
	Student3[] student3Array;

	int koreansum;
	int engsum;
	int mathsum;

	// �л��� ���� �Է¹޴� �޼���
	public void studentCount(Scanner scanner) {
		System.out.print("�л� �� : ");
		count = scanner.nextInt();

		// �Է��� �л��� ����ŭ �迭 �����ϰ� ��ü�� ����
		student3Array = new Student3[count];
		for (int i = 0; i < count; i++) {
			student3Array[i] = new Student3();
		}
	}

}
