
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if ��
		// �־��� ������ ����� true�� ��� �����ϴ� �ڵ尡 ����ǰ�
		// �׷��� ���� ��쿡�� ������� �ʴ´�.
		int a1 = 10;

		if (a1 > 5)
			System.out.println("a1�� 5���� Ů�ϴ�");

		if (a1 < 5)
			System.out.println("a1�� 5���� �۽��ϴ�");

		// �����ϴ� �ڵ尡 �� �� �̻��̸� ��ȣ�� ���� ��� �Ѵ�.
		if (a1 != 10) {
			System.out.println("a1�� 10�� �ƴմϴ�");
			System.out.println("�� �κ��� ���� �ɱ��???");
		}

		// ���ǿ� �����ϴ� �κ��� ���� ��� ������ �ڵ尡 �ִٸ�
		// else�� ����Ѵ�.
		if (a1 == 10) {
			System.out.println("a1�� 10�Դϴ�");
		} else {
			System.out.println("a1�� 10�� �ƴմϴ�");
		}

		if (a1 > 10) {
			System.out.println("a1�� 10���� Ů�ϴ�");
		} else {
			System.out.println("a1�� 10���� ũ�� �ʽ��ϴ�");
		}

		// ������ �پ��ϰ� ���� ��� else if�� �߰� ���ǵ��� �������ش�.
		if (a1 == 0) {
			System.out.println("a1�� 0 �Դϴ�");
		} else if (a1 == 5) {
			System.out.println("a1�� 5 �Դϴ�");
		} else if (a1 == 10) {
			System.out.println("a1�� 10�Դϴ�");
		} else if (a1 == 20) {
			System.out.println("a1�� 20�Դϴ�");
		} else {
			System.out.println("a1�� 0, 5, 10, 20�� �ƴմϴ�");
		}

		System.out.println("---------------------------------");

		int a2 = 10;

		switch (a2) {
		case 1:
			System.out.println("a2�� 1�Դϴ�");
			break;
		case 5:
			System.out.println("a2�� 5�Դϴ�");
			break;
		case 10:
			System.out.println("a2�� 10�Դϴ�");
			break;
		case 20:
			System.out.println("a2�� 20�Դϴ�");
			break;
		default:
			System.out.println("a2�� 1, 5, 10, 20�� �ƴմϴ�");
		}

		System.out.println("---------------------------------");

		// for
		// �ʱ��, ���ǽ�, ���������� �����ȴ�.
		// �ʱ�� -> ���ǽ� -> �ڵ� -> ������ -> ���ǽ� -> �ڵ� -> ������.....
		// ���ǽ��� ������ �Ǹ� �ݺ��� �ߴ��Ѵ�.
		for (int i = 0; i < 10; i++) {
			System.out.printf("i : %d\n", i);
		}

		System.out.println("---------------------------------");

		// while
		// �־��� ���ǽ��� True�� ��쿡 �ݺ��Ѵ�.
		// ���ǽ��� ���� �����Ƿ� ������ ó������ �����̸� �ѹ��� ������� �ʴ´�.
		int a3 = 0;

		while (a3 < 10) {
			System.out.printf("a3 : %d\n", a3);
			a3++;
		}

		System.out.println("---------------------------------");

		int a4 = 10;

		while (a4 < 10) {
			System.out.printf("a4 : %d\n", a4);
			a4++;
		}

		System.out.println("----------------------------------");

		// do while
		// �־��� ���ǽ��� True�� ��쿡 �ݺ��Ѵ�.
		// ���ǽ��� �Ʒ��� �����Ƿ� ������ ó������ �����̶� �ѹ��� ����ȴ�.

		int a5 = 10;

		do {
			System.out.printf("a5 : %d\n", a5);
			a5++;
		} while (a5 < 10);

		System.out.println("----------------------------------");

		int a6 = 10;

		do {
			System.out.printf("a6 : %d\n", a6);
			a6++;
		} while (a6 < 10);
	}

}
