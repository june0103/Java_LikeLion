
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü����
		Testclass t1 = new Testclass();
		// �޼��� ȣ��
		t1.testMethod1();
		t1.testMethod2();

		// ��ü����
		Testclass2 t2 = new Testclass2();
		// �޼��� ȣ��
		t2.testMethod3();
		t2.testMethod4();

		t1.testMethod5();

		// ��ȯ���� �ִ� �޼���
		int a1 = t1.testMethod6();
		System.out.println(a1);

		// �ŰԺ����� �������ִ� �޼���
		int a2 = t1.testMethod7(100, 200);
		System.out.printf("a2 : %d\n", a2);

		int a3 = t1.testMethod7(11, 22);
		System.out.printf("a3 : %d\n", a3);

	}

}

class Testclass {

	// �޼���
	public void testMethod1() {
		System.out.println("TestClass1�� testMethod1");
	}

	public void testMethod2() {
		System.out.println("TestClass1�� testMethod2");
	}

	// �߰��� return�� �ִ� �޼���
	// return : �޼���� ��� �ڵ尡 ������ �Ϸ�Ǹ� �޼��带 ȣ���ϴ� ������
	// �ǵ��� ����. �׷��� �޼����� �ڵ尡 �� ���� �ִٰ� �ϴ��� �޼����� ������
	// �ߴ��ϰ� ȣ���� ������ ���ư����� �Ѵٸ� return Ű���带 ����Ѵ�.
	// �޼��� ������ �ڵ尡 ����Ǵ� �ȵǴ� ��Ȳ�� ��� �޼����� ������ �ߴܽ�Ű�� ���� ����Ѵ�.

	public void testMethod5() {
		for (int i = 0; i < 10; i++) {
			if (i > 5) {

				return;
			}
			System.out.println(i);
		}
	}

	// ��ȯ��
	// �޼��� ������ �Ϸ�Ǿ�(������ ���ų� return�� �����ų�) �޼��带 ȣ���� ������
	// �ǵ��� �� �� �� �ϳ��� ������ �� �ִ�.
	// ������ ���� �ִٸ� �޼��� �̸� ������ ������ ���� Ÿ���� �ۼ�������Ѵ�.
	// ���� ������ ���� void�� �ۼ��� �ش�.
	public int testMethod6() {
		System.out.println("testMethod6 ȣ��");
		return 100;
	}

	// �Ű������� �������ִ� �޼���
	// �Ű����� : �޼��带 ������ �� ������ �ִ� ����
	// �Ű������� �ִ� �޼���� �޼��带 ȣ�� �� �� �ݵ�� �Ű������� ����� ����
	// ������ ��� �Ѵ�. �Ű������� ������ Ÿ���� ��� ��ġ�ؾ� �Ѵ�.
	public int testMethod7(int a1, int a2) {
		int r1 = a1 + a2;
		return r1;
	}
}

class Testclass2 {

	// �޼���
	public void testMethod3() {
		System.out.println("TestClass2�� testMethod3");
	}

	public void testMethod4() {
		System.out.println("TestClass2�� testMethod4");
	}
}
