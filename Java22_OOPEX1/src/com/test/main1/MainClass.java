package com.test.main1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �����м�
		// �������
		// ��ɱ����� ���� �ʿ��� ����
		// Ŭ������ ����(�ּ�)
		// Ŭ���� ������ ������ �޼��带 ����

		Scanner scanner = new Scanner(System.in);

		// Avg ��ü ����
		Avg avg = new Avg();
		// �л� �� ��ŭ ��ü�� �����Ѵ�.

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		// �Է¹޴´�
		s1.inputStudentInfo(scanner);
		s2.inputStudentInfo(scanner);
		s3.inputStudentInfo(scanner);
		// �л� ������ ����Ѵ�
		s1.printStudentInfo();
		s2.printStudentInfo();
		s3.printStudentInfo();
		// ���� ������ ����� ���� ����Ѵ�.
		avg.printPointTotal(s1, s2, s3);
		avg.printPointAvg();

	}

}

class Avg {
	// �л���
	int studentCount = 3;
	// ���� ����
	int koreanTotal;
	// ���� ����
	int englishTotal;
	// ���� ����
	int mathTotal;

	// ���� ������ ���ϰ� ����ϴ� �޼���
	public void printPointTotal(Student s1, Student s2, Student s3) {
		koreanTotal = s1.korean + s2.korean + s3.korean;
		englishTotal = s1.english + s2.english + s3.english;
		mathTotal = s1.math + s2.math + s3.math;

		System.out.printf("���� ���� : %d\n", koreanTotal);
		System.out.printf("���� ���� : %d\n", englishTotal);
		System.out.printf("���� ���� : %d\n", mathTotal);
	}

	// ���� ����� ���ϰ� ����ϴ� �޼���
	public void printPointAvg() {
		int koreanAvg = koreanTotal / studentCount;
		int englishAvg = englishTotal / studentCount;
		int mathAvg = mathTotal / studentCount;

		System.out.printf("���� ��� : %d\n", koreanAvg);
		System.out.printf("���� ��� : %d\n", englishAvg);
		System.out.printf("���� ��� : %d\n", mathAvg);
	}
}

//�л� Ŭ����
class Student {
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

	// �л��� ������ ����ϴ� �޼���
	public void printStudentInfo() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("�г� : %d\n", grade);
		System.out.printf("���� : %d\n", korean);
		System.out.printf("���� : %d\n", english);
		System.out.printf("���� : %d\n", math);
	}

	public void inputStudentInfo(Scanner scanner) {
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
}