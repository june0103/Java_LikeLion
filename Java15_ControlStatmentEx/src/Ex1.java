public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����1) "�ȳ��ϼ���"�� 5�� ����Ѵ�.

		System.out.println("�ȳ��ϼ��並 5�� ����Ѵ�.");
		for (int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
		}

		// ����2) 0~100������ �������� 3�� ����� ���

		System.out.println("0~100������ �������� 3�� ����� ���");
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("---------------------");

		// ����3) 0~100������ �������� 5�� ����� �ƴ� ���� ����Ѵ�.

		System.out.println("0~100������ �������� 5�� ����� �ƴ� ���� ����Ѵ�.");
		for (int i = 0; i <= 100; i++) {
			if (i % 5 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("---------------------");

		// ����4) 0~100������ ������ ���Ѵ�.

		System.out.println("0~100������ ������ ���Ѵ�.");
		int sum100 = 0;
		for (int i = 0; i <= 100; i++) {
			sum100 += i;
			if (i == 100) {
				System.out.println(sum100);
			}
		}

		System.out.println("---------------------");

		// ����5) 0~100������ �������� 3�� ������� 7�� ����� �͸� ����Ѵ�.

		System.out.println("0~100������ �������� 3�� ������� 7�� ����� �͸� ����Ѵ�.");
		for (int i = 0; i <= 100; i++) {

			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print(i + " ");
			}

		}
	}

}
