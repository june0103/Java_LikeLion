
public class MainClass {

	public static void main(String[] args) {
		// ����, �޼��� ���� ��� ����
		// ������ �޼��带 ���� ��� ���������� ���� �̾߱�
		// ��ü�� ��� ������ ��� �޼���� ��ü�� �����Ǿ������ ����� �����ϴ�.
		// ��ü�� �Ҹ�Ǹ� ��� ������ �Ҹ�Ǳ� ������ ����� �Ұ���
		// ��ü�� �Ҹ�Ǹ� ��ü�� ���� �޼��带 ȣ������ ���ϹǷ� ��� �Ұ���
		// �ڹٴ� �⺻������ �� �������� ������.
		// �� ������ : ���� ���� ����� ��( { } ) ���ο��� ����� ����

		// ��ü�� �����Ѵ�.
		// ��ü�� �����ϸ� ��� �����鵵 �����Ǳ� ������ ��� ������ ����� �� �ִ�.
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1.memberA : %d\n", t1.memberA);
		System.out.printf("t1.memberB : %d\n", t1.memberB);

		// Ŭ������ ���ǵ� �޼������ Ŭ������ ���� ������ ��ü�� ���� ȣ�� �� �� �ִ�.
		// ����, ��ü�� �����Ǿ��ٸ� �̸� ���� ȣ���� �� �ִ�.
		t1.testMethod1();
	}
}

class TestClass1 {
	// ��� ���� ����
	// ��� ������ ��ü�� �����ؾ� �޸𸮿� ����
	int memberA = 100;
	int memberB = 200;

	// ��� �޼���
	public void testMethod1() {
		System.out.println("testMethod1 ȣ��");

		// ���� ��ü�� �ִ� ��� ������ ���
		// ��� �޼���� ��ü�� �����ϰ� �� ��ü�� ���ؼ� ȣ���� �� �ֱ� ������
		// ��� ������ �����Ǿ� �ִٴ� ���� ������� �� �ִ�. �̿� ����� �����Ӵϴ�.
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
	}

	// ��������
	// �޼��� ���ο� ������ �������� �ǹ�
	// ������ ���ǵ� ���� ������ ������ �Ҹ�
	public void testMethod2(int a1, int a2) {
		// �Ű����� ���
		System.out.printf("a1 : %d\n", a1);
		System.out.printf("a2 : %d\n", a2);

		// �޼��� ���ο��� ������ ����
		// ���� �޼��� ���ο����� ����� �����ϴ�.
		// �޼��尡 ������ �Ҹ�ȴ�.
		int a3 = 100;
		int a4 = 200;
		System.out.printf("a3 : %d\n", a3);
		System.out.printf("a4 : %d\n", a4);

		// ��� ����
		for (int i = 0; i < 3; i++) {
			// ��� ���ο��� ����� ������ ��� ���ο����� ���
			// ��� ������ ������ �Ҹ�
			int a5 = 300;
			System.out.printf("for - %d\n", a3);
			System.out.printf("i : %d\n", i);
			System.out.printf("a5 : %d\b", a5);
		}

		// ��� �������� ����� ���� ���ȵ�
		// System.out.println(a5);
		// System.out.println(i);

		{
			int a6 = 100;
			System.out.printf("a6 : %d\n", a6);
		}
		// System.out.printf("a6 : %d\n", a6);
	}

	public void testMethod3() {
		// testMethod2�� ���ǵ� �Ű����� ��� �õ�
		// �ٸ� �޼��� �̹Ƿ� ��� �Ұ�
		// System.out.printf("a1 : %d\n", a1);
		// System.out.printf("a2 : %d\n", a2);
		// testMethod2�� ���ǵ� �������� ��� �õ�
		// �ٸ� �޼��� �̹Ƿ� ��� �Ұ�
		// System.out.printf("a3 : %d\n", a3);
		// System.out.printf("a4 : %d\n", a4);
	}
}
