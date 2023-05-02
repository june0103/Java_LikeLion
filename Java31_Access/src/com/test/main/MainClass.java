package com.test.main;

import com.test.pkg1.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ������
		// �ܺο����� ���� ��� ���θ� ����
		// �������� ���Ἲ�̳� �����ϰ� ���� ���� �޼��� ���� ���� �� ���
		// public : ���� ����
		// private : ���� �Ұ�
		// protected : ��Ű���� ������ ������ ���� ��Ű���� �ٸ� ��� ��Ӱ��迡����
		// ������ �����ϴ�.
		// default : ���� ��Ű�� ���ο����� ������ �����ϴ�.

		// ���� ��Ű���� �ִ� public Ŭ������ ��ü�� ����
		TestClass1 t1 = new TestClass1();
		// ���� ��Ű���� �ִ� default Ŭ������ ��ü�� ����
		TestClass2 t2 = new TestClass2();

		// �ٸ� ��Ű���� �ִ� public Ŭ������ ��ü�� ����
		TestClass3 t3 = new TestClass3();
		// �ٸ� ��Ű���� �ִ� default Ŭ������ ��ü�� ���� �Ұ���
		// TestClass4 t4 = new TestClass4();

		// ���� ��Ű���� �ִ� ��ü�� ���� (������ ���������� �׽�Ʈ)
		// public
		TestClass5 t50 = new TestClass5();
		// default
		TestClass5 t51 = new TestClass5(10);
		// protected
		TestClass5 t52 = new TestClass5(10, 20);
		// private ���� ��Ű���� �ִ� �����ڿ��� �Ұ���
		// TestClass5 t53 = new TestClass5(10, 20, 30);

		// �ٸ� ��Ű���� Ŭ������ ���� ��ü�� ���� (������ �׽�Ʈ)
		// public
		TestClass6 t60 = new TestClass6();
		// default ���Ұ�
		// TestClass6 t61 = new TestClass6(10);
		// protected ���Ұ�
		// TestClass6 t62 = new TestClass6(10, 20);
		// private ���Ұ�
		// TestClass6 t63 = new TestClass6(10, 20, 30);

		// ���� ��Ű���� Ŭ������ ��ü�� ���� (����, �޼��� �׽�Ʈ)
		TestClass7 t7 = new TestClass7();
		// public
		t7.method1();
		System.out.printf("t7.memberA : ", t7.memberA);
		// default
		t7.method2();
		System.out.printf("t7.memberA : ", t7.memberB);
		// protected
		t7.method3();
		System.out.printf("t7.memberA : ", t7.memberC);
		// private ���Ұ�
		// t7.method4();
		// System.out.printf("t7.memberA : ", t7.memberD);

		// �ٸ� ��Ű���� Ŭ������ ���� ��ü�� �����Ѵ�(����, �޼��� �׽�Ʈ)
		TestClass8 t8 = new TestClass8();
		// public
		t8.method1();
		System.out.printf("t8.memberA : %d\n", t8.memberA);
		// default ���Ұ�
//		t8.method2();
//		System.out.printf("t8.memberB : %d\n", t8.memberB);
		// protected ���Ұ�
//		t8.method3();
//		System.out.printf("t8.memberC : %d\n", t8.memberC);
		// private ���Ұ�
//		t8.method4();
//		System.out.printf("t8.memberD : %d\n", t8.memberD);

	}

}

// ���� ��Ű���� �ִ� public Ŭ������ ��ӹ޴� Ŭ����
class SubClass1 extends TestClass1 {

}

// ���� ��Ű���� �ִ� default Ŭ������ ��ӹ޴� Ŭ����
class SubClass2 extends TestClass2 {

}

// �ٸ� ��Ű���� �ִ� public Ŭ������ ��ӹ޴� Ŭ����
class SubClass3 extends TestClass3 {

}

// �ٸ� ��Ű���� �ִ� default Ŭ������ ��ӹ޴� Ŭ���� (�����߻�)
//class SubClass4 extends TestClass4{
//	
//}

// ���� ��Ű���� �ִ� Ŭ������ ��ӹ޴´�. (���������� �׽�Ʈ)
class SubClass5 extends TestClass5 {
	// �⺻������ �θ�Ŭ������ ������ �� �Ű������� ���� �����ڸ� ȣ��
	// TestClass5�� �⺻�����ڰ� public �̹Ƿ� ������ �߻����� �ʴ´�
	public SubClass5() {
		// �θ��� public ������ ȣ��
		super();
	}

	public SubClass5(int a1) {
		// �θ��� default ������ ȣ��
		super(10);
	}

	public SubClass5(int a1, int a2) {
		// ������ protected ������ ȣ��
		super(10, 20);
	}

	public SubClass5(int a1, int a2, int a3) {
		// �θ��� private ������ ȣ�� �Ұ���
		// super(10, 20, 30);
	}
}

//�ٸ� ��Ű���� Ŭ������ ��ӹ޴´�(������ �׽�Ʈ)
class SubClass6 extends TestClass6 {
	// public
	public SubClass6() {
		super();
	}

	// default ����
// public SubClass6(int a1) {
//     super(10);
// }
	// protected
	public SubClass6(int a1, int a2) {
		super(10, 20);
	}
	// private ����
// public SubClass6(int a1, int a2, int a3) {
//     super(10, 20, 30);
// }
}

//���� ��Ű���� Ŭ������ ��� ���� Ŭ����(����, �޼��� �׽�Ʈ)
class SubCclass7 extends TestClass7 {

	public void testMethod() {
		// ����, �޼���
		// public
		method1();
		System.out.printf("memberA : %d\n", memberA);
		// default
		method2();
		System.out.printf("memberB : %d\n", memberB);
		// protected
		method3();
		System.out.printf("memberC : %d\n", memberC);
		// private ����
//		method4();
//		System.out.printf("memberD : %d\n", memberD);

	}
}

//�ٸ� ��Ű���� Ŭ������ ��� ���� Ŭ����(����, �޼��� �׽�Ʈ)
class SubClass8 extends TestClass8 {

	public void testMethod() {
		// ����, �޼���
		// public
		method1();
		System.out.printf("memberA : %d\n", memberA);
		// default ���Ұ���
//		method2();
//		System.out.printf("memberB : %d\n", memberB);
		// protected ���Ұ���
//		method3();
//		System.out.printf("memberC : %d\n", memberC);
		// private ���Ұ���
//		method4();
//		System.out.printf("memberD : %d\n", memberD);
	}
}