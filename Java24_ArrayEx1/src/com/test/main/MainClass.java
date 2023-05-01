package com.test.main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// �б� ��ü�� �����Ѵ�.
		School school = new School();

		// �л� ���� �Է¹޴´�.
		school.inputStudentCount(scanner);

		// �л� �����͸� �Է� �޴´�.
		school.inputStudentInfo(scanner);

		// �л� ������ ����Ѵ�.
		school.printStudentInfo();

		// ������ ���ϰ� ����Ѵ�.
		school.printPointTotal();
		// ����� ���ϰ� ����Ѵ�.
		school.printPointAvg();

		scanner.close();
	}

}

class School {
	// �л���
	int studentCount = 3;
	// ���� ����
	int koreanTotal;
	// ��������
	int englishTotal;
	// ��������
	int mathTotal;
	// �л� ������ ���� �迭�� ����
	Student[] studentArray;

	// �л� ���� �Է¹޴� �޼���
	public void inputStudentCount(Scanner scanner) {
		System.out.print("�л� �� : ");
		studentCount = scanner.nextInt();
		// �迭�� �����Ѵ�.
		studentArray = new Student[studentCount];
		// �л��� �� ��ŭ ��ü�� �����Ѵ�.
		for (int i = 0; i < studentCount; i++) {
			studentArray[i] = new Student();
		}
	}

	// �л��� ������ �Է¹޴� �޼���
	public void inputStudentInfo(Scanner scanner) {
		// �л��� �� ��ŭ �ݺ��Ѵ�.
		for (Student s1 : studentArray) {
			s1.inputStudentInfo(scanner);
		}
	}

	// �л����� ������ ����ϴ� �޼���
	public void printStudentInfo() {
		// �л��� �� ��ŭ �ݺ��Ѵ�.
		for (Student s1 : studentArray) {
			s1.printStudentInfo();
		}
	}

	// ���� ������ ���ϰ� ����ϴ� �޼���
	public void printPointTotal() {
		// ���� �ʱ�ȭ
		koreanTotal = 0;
		englishTotal = 0;
		mathTotal = 0;

		// �л��� �� ��ŭ �ݺ��Ѵ�.
		for (Student s1 : studentArray) {
			// ������ ���Ѵ�.
			koreanTotal = koreanTotal + s1.korean;
			englishTotal = englishTotal + s1.english;
			mathTotal = mathTotal + s1.math;
		}

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

// �л� Ŭ����
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

	// �л��� ������ �Է¹޴� �޼���
	public void inputStudentInfo(Scanner scanner) {
		// �Է¹޴´�
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
