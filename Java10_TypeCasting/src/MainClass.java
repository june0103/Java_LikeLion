
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ (Type Casting)
		// ���� �ٸ� Ÿ������ ��ȯ�ϴ� ���� �ǹ��Ѵ�.

		// �������� 4byte ������ int�� ������ ����
		// 4byte ���� 4byte �����ҿ� ����
		int a1 = 100;
		System.out.printf("a1 : %d\n", a1);

		// 8byte �����ҿ� 4btye ũ���� ���� ��´�.
		// 4btye ũ���� ���� 8btye ũ���� ������ ��ȯ�Ǿ� �����ҿ� ����ȴ�
		long a2 = 100;
		System.out.printf("a2 : %d\n", a2);

		// 4byte �����ҿ� 8byte ũ���� ���� ��´�.
		// �� ū �뷮�� ���� ���� ���� �뷮�� �����ҿ� �����ϱ� ���ؼ��� ������ ����ȯ �ؾ� �Ѵ�.
		// ������� �ʴ°� ����
		int a3 = (int) 100L;
		System.out.printf("a3 : %d\n", a3);

		int a4 = (int) 40000000000L;
		System.out.printf("a4 : %d\n", a4);

		int a5 = 500;
		long a6 = a5;

		System.out.printf("a6 : %d\n", a6);
	}

}
