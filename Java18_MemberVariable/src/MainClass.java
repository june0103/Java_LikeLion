
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass1 t1 = new TestClass1();
		t1.testMethod1();
		
		// ��ü ���������� ���� ��� ���� ����
		// �޼���� �����ϰ� . �� ���� ����
		System.out.printf("t1.memberA1 : %d\n", t1.memberA1);
		System.out.printf("t1.memberA2 : %d\n", t1.memberA2);

	}

}

class TestClass1 {
	// ��� ����
	// ��ü���� ����Ǿ� ���� ��ü ���ζ�� �����Ӱ� �����Ͽ� ����� �� �ִ� ����
	// �ߺ��� �̸����� ����� �� ����.
	// �ٸ� ������ �����ϱ� ���ؼ��� �� . �� �����ڸ� �̿��Ѵ�.
	int memberA1 = 100;
	int memberA2 = 200;

	// ���� Ŭ������ ������ �޼��忡�� ������ ����Ѵ�.
	public void testMethod1() {
		// ���� Ŭ������ ������ �޼��� �������� ��� ������ ������ �����Ӱ�
		// ������ �̸��� �ۼ��ϸ� �ȴ�.
		System.out.printf("memberA1 : %d\n", memberA1);
		System.out.printf("memberA2 : %d\n", memberA2);
	}
}