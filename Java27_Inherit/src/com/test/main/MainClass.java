package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���
		// �ٸ� Ŭ������ ��� ������ ��� �޼��带 �ڱ� �� ó��
		// �����޾� ����ϴ� ����
		// ����� �޴� ���� �ڽ� Ŭ����(Sub Class)��� �θ���
		// ����� �ִ� ���� �θ� Ŭ����(Super Class)��� �θ���.
		// �ڹ��� ��� Ŭ������ ������ ���� ������ �θ� Ŭ������ �� �� �ִ�.
		// �ڽ� Ŭ������ ��ü�� �����ϸ� �θ� Ŭ������ ��ü�� ���� �����Ǹ�
		// �θ� Ŭ������ ��Ҹ� �ڱ� ���� �� ó�� ����� �� �ִ�.

		SubClass sub1 = new SubClass();
		sub1.subMethod();

		SubClass2 sub2 = new SubClass2();
		System.out.printf("sub2 : %s\n", sub2);

		SubClass2 sub3 = new SubClass2(100);
		System.out.printf("sub3 : %s\n", sub3);
	}

}

// �θ� Ŭ����
class SuperClass {
	int memberC = 300;
	int memberD = 400;

	public void superMethod() {
		System.out.println("SuberClass�� superMethod ȣ��");
	}
}

//SuperClass�� ��� �޴´�.
class SubClass extends SuperClass {

	int memberA = 100;
	int memberB = 200;

	public void subMethod() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
		System.out.printf("memberC : %d\n", memberC);
		System.out.printf("memberD : %d\n", memberD);
		subMethod2();
		superMethod();
	}

	public void subMethod2() {
		System.out.println("SubClass�� subMethod2 ȣ��");
	}
}

// ��ӿ����� ������
// Ŭ������ ��ü�� �����ϸ� �����ڰ� �ڵ����� ȣ��ȴ�
// �����ڿ��� �θ� Ŭ������ �����ڸ� �ڵ����� ȣ�����ָ� �ڵ����� ȣ��Ǵ�
// �����ڴ� �Ű������� ���� ������
class SuperClass2 {

	public SuperClass2() {
		System.out.println("SuperClass2�� �⺻ ������");
	}

	public SuperClass2(int a1) {
		System.out.printf("SuperClass2�� �Ű����� �ϳ� �ִ� ������ : %d\n", a1);
	}

}

class SubClass2 extends SuperClass2 {
	public SubClass2() {
		System.out.println("SubClass2�� �⺻ ������");
	}

	// ���� �Ű������� �ִ� �����ڸ� ������ ��ü�� �����Ѵٰ� �ϴ���
	// �θ��� ������ ȣ���� ������� ������ �θ��� ������ �� �Ű������� ����
	// �⺻ �����ڰ� ȣ��ȴ�.
	// ���� �θ��� �����ڸ� �����ϰ� �ʹٸ� super�� ����Ѵ�.
	public SubClass2(int a1) {
		// �θ��� �����ڸ� ��������� �����Ѵ�.
		super(a1);
		System.out.printf("SubClass2�� �Ű����� �ϳ� �ִ� ������ : %d\n", a1);
	}
}