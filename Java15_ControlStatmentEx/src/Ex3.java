public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �������

		// ����1)
		// 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4)
		// + (1 + 2 + 3 + 4 + 5) + ... + (1 + 2 + ... + 9 + 10)
		// �� �� ���� ����ϼ���
		// ����ؾ��� �� 220

		int sum1 = 0;
		int a = 0;
		for (int i = 0; i <= 10; i++) {

			a += i;
			sum1 = sum1 + a;

		}
		System.out.printf("����1 ���� : %d\n", sum1);

		// ����2)
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + ...
		// �̷������� ������ �� �� ���� ���ؾ��� �� ���� 100 �̻��� �Ǵ��� ���ϼ���.
		// ����ؾ��� �� 199

		int sum2 = 0;
		int b = 0;
		for (int i = 1; sum2 < 100; i++) {
			if (i % 2 != 0) {
				sum2 += i;
			} else {
				sum2 -= i;
			}
			b++;
		}
		System.out.printf("����2 ���� : %d\n", b);

		// ����3)
		// ������ 2x + 4y = 10 ���� ������ ��� x, y �� ������ ����ϼ���
		// ��, x�� 0 ~ 10, y�� 0 ~ 10 ���� �̴�.
		// ����ؾ��� �� 1,2 3,1 5,0
		System.out.println("����3 ����");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {

				if (2 * i + 4 * j == 10) {
					System.out.printf("x = %d, y = %d\n", i, j);
				}

			}
		}

	}

}
