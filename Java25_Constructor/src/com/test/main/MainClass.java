package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������
		// Ŭ������ ���� ��ü�� ������ �� ������ �����ϴ� ���
		// �����ڴ� ��ȯ Ÿ���� ���� Ŭ���� �̸��� �����ϰ� �ۼ�
		// Ŭ������ ���� ��ü�� ������ ���� �ݵ�� �����ڸ� ����
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1 : %s\n", t1);

		TestClass2 t2 = new TestClass2();
		System.out.printf("t2 : %s\n", t2);

		TestClass3 t3 = new TestClass3(100, 200);
		System.out.printf("t3 : %s\n", t3);

		StudentClass s1 = new StudentClass("�浿", 1, 100, 90, 80);
		s1.printStudentInfo();
	}

}

// �����ڰ� ���� Ŭ����
// Ŭ������ ���� �� �����ڸ� �ۼ����� ������ �⺻ �����ڰ� �ڵ����� �߰��ȴ�.
// �⺻ ������ : Ŭ�����̸�(){ };
class TestClass1 {

}

// �Ű� ������ ���� �����ڸ� ������ Ŭ����
class TestClass2 {
	// ������
	public TestClass2() {
		System.out.println("TestClass2�� ������");
	}

}

// �Ű� ������ �ִ� �����ڸ� ������ Ŭ����
class TestClass3 {
	// ������
	public TestClass3(int a1, int a2) {
		System.out.println("TestClass3�� ������");
		System.out.printf("a1 : %s\n", a1);
		System.out.printf("a2 : %s\n", a2);
	}
}

//�л�Ŭ����
class StudentClass {
	String name;
	int grade;
	int korean;
	int english;
	int math;

	public StudentClass(String name, int grade, int korean, int english, int math) {
		// this : ��ü�� ����� ������ �� ����Ѵ�.
		this.name = name;
		this.grade = grade;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public void printStudentInfo() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("�г� : %d\n", grade);
		System.out.printf("���� : %d\n", korean);
		System.out.printf("���� : %d\n", english);
		System.out.printf("���� : %d\n", math);
	}
}
