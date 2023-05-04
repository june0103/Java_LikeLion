package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ó��
		// ���α׷� �����߿� ����(����)�� �߻��ϰų� �߻��� ���ɼ��� �ִٸ� JVM��
		// ������ JVM�̳� OS�� ���ĵǴ� ���� �������� ���α׷��� ���� �����Ų��.
		// �̶�, ���� ������ ���� �ʰ� �ϰ� �����ڰ� �غ��� ���� �߻��� ����Ǿ��
		// �ϴ� �ڵ尡 ����� �� �ֵ��� �Ͽ� ������ ����ϰ� ���ִ� ����
		// ���� ó��
		// try : ���ϴ� ó���� �ڵ�
		// catch : ������ �߻��߰ų� �߻��� ���ɼ��� ������ �����ϴ� �ڵ�

		// ���ϴ� ó���� ������ �� �ִ� �ڵ� �� ���ܰ� �߻��� ���ɼ��� �ִ� �κ��� try�� �����ش�.
		try {
			// 0���� ������.
//			int a1 = 10 / 0;

			// ��ü�� ���̵� ������ ���� ���� ������ ���� ��ü ������ �õ��Ѵ�.
			TestClass1 t1 = null;
//			t1.testMethod1();

//			int[] array1 = new int[10];
//			array1[20] = 200;

			System.out.println("���� �߻� ���� ������ try �ڵ�");
		} catch (ArithmeticException e) {
			System.out.println("���п��� ���� �߻�");
		} catch (NullPointerException e) {
			System.out.println("��ü ���� ���� �߻�");
		} catch (Exception e) {
			// ������ �߻����� �� ó���� �ڵ�� catch�κп� �ۼ�
			System.out.println("���� �߻�");
			// ������ ������ ������� �� ���
			System.out.println(e);
			e.printStackTrace();
		}
		// try catch�� ���� ������ �̺κ��� ������ �ȵǰ� ���α׷� ����
		System.out.println("�� �κ��� �����ϰڽ��ϱ�?");

		// ��� �Ǻ�
		try {

			TestClass1 t100 = new TestClass1();
			t100.testMethod2(100);
			t100.testMethod2(-100);

		} catch (Exception e) {
			System.out.println("�����߻�");
		}

		// throws - try catch�� ���� �ʴ´ٸ� �����߻�
		// testMethod3�� ���ܵ��� throws�ϰ� �ֱ� ������
		// �ݵ�� ����ó���� ����� �Ѵ�.
		try {
			TestClass1 t200 = new TestClass1();
			t200.testMethod3(100);
			t200.testMethod3(200);
			t200.testMethod3(-100);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class TestClass1 {
	public void testMethod1() {
		System.out.println("TestClass1�� testMethod1");
	}

	public void testMethod2(int a1) {
		// a1�� ������ ������ ���� �߻�
		if (a1 <= 0) {
			throw new ArithmeticException("����� �ƴϴ�");
		}
		System.out.println("a1�� ���");
	}

	// throws : �� �޼��带 ������ �� ������ ���ܰ� �߻��� ���ɼ��� �ִٰ� �˷��ش�
	// throw : �����߻�ó��
	// �̷��� ���ָ� �� �޼��带 ȣ���ϴ� ���� ������ ����ó���� �ؾ��Ѵ�
	// RunTimeException�� ��ӹ��� �͵��� throws�ص� ����ó���� ���� �������� �� �� ���� ������ Exception�� �����ʿ�
	public void testMethod3(int a1) throws Exception, ArithmeticException {
		// a1�� ������ ������ ���� �߻�
		if (a1 <= 0) {
			throw new ArithmeticException("����� �ƴϴ�");
		}
		System.out.println("a1�� ���");
	}
}