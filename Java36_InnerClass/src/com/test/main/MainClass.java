package com.test.main;

public class MainClass {
	public static void main(String[] args) {

		// ��ø Ŭ����
		// Ŭ���� �ȿ� Ŭ������ ����� ���� �ǹ�

		// �Ϲ� ��ø Ŭ������ ��ü�� �����Ѵ�.
		// �ܺ� Ŭ������ ��ü�� �����Ѵ�.
		OuterClass1 out1 = new OuterClass1();
		// �̸� ���� ���� Ŭ������ ��ü�� �����Ѵ�.
		OuterClass1.InnerClass1 in1 = out1.new InnerClass1();
		System.out.printf("in1 : %s\n", in1);

		// static ��ø Ŭ������ �ܺ�Ŭ������ ��ü ���� �ٷ� ������ �����ϴ�.
		OuterClass2.InnerClass2 in2 = new OuterClass2.InnerClass2();
		System.out.printf("in2 : %s\n", in2);

		// �͸� ��ø Ŭ����
		// SuperClass100�� ��ӹ��� �̸��� ���� Ŭ������ �ۼ��ϰ�
		// �ʿ��� �޼������ overriding�Ѵ�.
		// �׸��� �ڽ�Ŭ������ ��ü�� �������ش�.
		SuperClass100 s100 = new SuperClass100() {

			public void superMethod100() {
				System.out.println("overriding�� �޼���");
			}
		};

		s100.superMethod100();
	}
}

// �Ϲ� ��ø Ŭ����
// Ŭ���� �ȿ� Ŭ������ ���� ����
// Ŭ���� ������ Ŭ������ �ܺ� Ŭ������ ��ü�� ���ؼ� ������ �� �ִ�
// Ư�� Ŭ������ ���ǵ� ����� ���� ����ϴ� ��� ���
// ���� : ���� Ŭ�������� �ܺ� Ŭ������ ����� ����ϴ� ���� �����Ӵ�
// ���� : ���� Ŭ������ ��ü�� �����Ϸ��� �ݵ�� �ܺ� Ŭ������ ��ü�� �����ؾ� �Ѵ�.
class OuterClass1 {

	int outerMemberA = 100;

	public void outerMethodA() {
		System.out.println("outerMethod!");
		// ���� Ŭ������ ����� ��� �Ұ���
		// System.out.printf("innerMemberA : %d\n", innerMemberA);
		// innerMethodA();
	}

	class InnerClass1 {

		int innerMemberA = 200;

		public void innerMethodA() {
			System.out.println("innerMethod");
		}

		public void innerMethodB() {
			// �ܺ� Ŭ������ ���ǵ� ����� ���
			System.out.printf("outerMemberA : %d\n", outerMemberA);
			outerMethodA();
		}
	}
}

//static ��ø Ŭ����
//���� : �𸣰ڽ��ϴ�..�Ф�
//���� : ���� Ŭ������ �ܺ� Ŭ������ ����� �����Ӱ� ����� �� �ִٴ� Ư¡��
//�����������. ������ �ܺ� Ŭ������ ���ǵ� static ������ �޼��常 ����� �����ϴ�.
class OuterClass2 {

	// �ܺ� Ŭ������ ���ǵ� static ����
	static int outerMemberA = 200;
	// �ܺ� Ŭ������ ���ǵ� ��� ����
	int outerMemberB = 300;

	public void outerMethod1() {
		// ���� Ŭ������ static ��� ���
		System.out.println(InnerClass2.innerMemberA);
	}

	// static ��ø Ŭ����
	static class InnerClass2 {
		// ���� Ŭ������ ���ǵ� static ����
		static int innerMemberA = 100;

		public void innerMethod1() {
			// �ܺ� Ŭ������ ���ǵ� static ����
			// �ܺ� Ŭ������ �̸��� ������ �� �ִ�.
			System.out.println(outerMemberA);
			// �ܺ� Ŭ������ ���ǵ� ��� ����
//			System.out.println(outerMemberB);
		}
	}
}

// ���� ��ø Ŭ����
// �޼��� ���ο� Ŭ������ �ۼ��Ͽ� ����ϴ� Ŭ����
// �޼����� ������ ������ Ŭ������ �޸𸮿��� ������� ������ �޼��� �ܺο��� Ŭ������ ����� �� ����
// ���� : �޼��忡�� ����ϴ� Ŭ������ �ۼ��� �� �ٸ� ���� �ۼ����� �ʰ� �ٷ� �ۼ��� ��� �� ���ִ�
// ���� : �޼��� ���ο����� ����� �����ϴ�
class OuterClass3 {

	// ���� ��øŬ���� Ÿ���� ������� ���� �Ұ���
//	InnerClass3 in30;

	public void outerMethod3() {
		// ���� ��ø Ŭ����
		class InnerClass3 {

		}
		// ���� ��ø Ŭ���� ��ü ����
		InnerClass3 in3 = new InnerClass3();
		System.out.println(in3);
	}

	// �ٸ� �޼��忡�� ��� �Ұ��� (�ŰԺ����� ���Ұ�)
//	public void outerMethod30(InnerClass3 in34) {
//		InnerClass3 in33;
//	}
}

//�͸� ��ø Ŭ����
//Ŭ������ �̸��� ���ٴ� ���̴�.
//�͸� ��ø Ŭ������ ��Ӱ����� Ŭ������ ����� ���̴�.
//Ư�� Ŭ������ ��ӹ��� Ŭ������ ����� ���ÿ� ��ü�� ������ �� ����Ѵ�.
//�޼��� overriding ������ ����Ѵ�.
//Ư�� Ŭ������ ��ӹ��� Ŭ������ ��ü�� �� �ϳ��� ����� ����� �� ����Ѵ�.
class SuperClass100 {

	public void superMethod100() {
		System.out.println("superMethod100");
	}
}
