import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ����ڿ��� ���ڸ� �Է� �޾� �� ���� ������ ������ ���Ѵ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int a1 = sc.nextInt();
		int sum1 = 0;
		for (int i = 0; i <= a1; i++) {
			sum1 += i;
		}
		System.out.printf("�Է°� : %d\n", a1);
		System.out.printf("�� �� : %d\n", sum1);

		// 2. ����ڿ��� ���ڸ� �Է� �޾� �� ������ ��� 100���� ����Ѵ�.
		System.out.println("��� 100��");
		for (int i = 0; i < 100; i++) {

			System.out.printf("%d ", a1 * i);
		}

		System.out.println();
		// 3. ����ڿ��� ���ڸ� �Է� �޾� 2���� ���� �� ���ڱ����� ���� �ȿ���
		// �Ҽ�(1�� �ڱ� �ڽ����θ� �������� ��)�� ��� ����Ѵ�.

		for (int i = 2; i < a1; i++) {
			if (a1 % i == 0 && a1 % i == 1) {
				System.out.println(a1);
			}
		}

		// 2�� �Ҽ��̹Ƿ� �׳� ����Ѵ�.
		System.out.printf("%d ", 2);
		// 3���� ���� �Է��� ���ڱ��� �ݺ��Ѵ�.
		for (int i = 3; i <= a1; i++) {

			// 2���� ���� ���� ���� - 1���� �ݺ��Ѵ�.

			// ���� ���ڸ� ���� ����2�� ���� �������� 0���� Ȯ���Ѵ�.

			// �Ҽ��� ����Ѵ�.
		}
		// 3���� ���� �Է��� ���ڱ��� �ݺ��Ѵ�.
		for (int i = 3; i <= a1; i++) {

			boolean chk = true;

			// 2���� ���� ���� ���� - 1���� �ݺ��Ѵ�.
			for (int k = 2; k <= i - 1; k++) {

				// ���� ���ڸ� ���� ����2�� ���� �������� 0���� Ȯ���Ѵ�.
				int a3 = i % k;
				if (a3 == 0) {
					chk = false;
					break;
				}
			}
			// �Ҽ��� ����Ѵ�.
			if (chk == true) {
				System.out.printf("%d ", i);
			}
		}

		// 4. �ֹε�� ��ȣ�� �Է¹޾� �ùٸ� �ֹ� ��� ��ȣ���� Ȯ���Ѵ�.
		// (2 x 1�ڸ�) + (3 x 2�ڸ�) + (4 x 3�ڸ�) + (5 x 4�ڸ�)
		// + (6 x 5�ڸ�) + (7 x 6�ڸ�) + (8 x 7�ڸ�) + (9 x 8�ڸ�)
		// + (2 x 9�ڸ�) + (3 x 10�ڸ�) + (4 x 11�ڸ�) + (5 x 12�ڸ�) �� ���� ���Ѵ�.
		// ���� ���� 11�� ���� �������� ���Ѵ�.
		// 11���� �������� ����.-
		// �� ���ڸ� 10���� ���� �������� ���Ѵ�. �� ���� 13��° �ڸ� ���ڰ� �ȴ�.
		
		//���ڸ� �Է¹ް� �� �ڸ����� ����
		System.out.print("�ֹι�ȣ �Է� : ");
		long nb = sc.nextLong();
		// �� �ڸ����� ����.
		long b1 = nb / 1000000000000L;
		nb = nb % 1000000000000L;
		
		long b2 = nb / 100000000000L;
		nb = nb % 100000000000L;
		
		long b3 = nb / 10000000000L;
		nb = nb % 10000000000L;
		
		long b4 = nb / 1000000000L;
		nb = nb % 1000000000L;
		
		long b5 = nb / 100000000L;
		nb = nb % 100000000L;
		
		long b6 = nb / 10000000L;
		nb = nb % 10000000L;
		
		long b7 = nb / 1000000L;
		nb = nb % 1000000L;
		
		long b8 = nb / 100000L;
		nb = nb % 100000L;
		
		long b9 = nb / 10000L;
		nb = nb % 10000L;
		
		long b10 = nb / 1000L;
		nb = nb % 1000L;
		
		long b11 = nb / 100L;
		nb = nb % 100L;
		
		long b12 = nb / 10L;
		
		long b13 = nb % 10L;
		
		
		System.out.printf("%d %d %d %d %d %d %d %d %d %d %d %d %d \n",b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13);
		
        // ���Ŀ� ���ؼ� ����Ѵ�.
		
		long nbSum =  (b1 * 2) + (b2 * 3) + (b3 * 4) + (b4 * 5)
                + (b5 * 6) + (b6 * 7) + (b7 * 8) + (b8 * 9)
                + (b9 * 2) + (b10 * 3) + (b11 * 4) + (b12 * 5);
		long nbSum1 = nbSum % 11;
        long nbSum2 = 11 - nbSum1;
        long nbSum3 = nbSum2 % 10;
        
      

        // ���� ����� 13��° �ڸ� ���ڸ��� ���Ѵ�.

        // ������ ��ȿ�ϴٰ� ����Ѵ�.
        if (nbSum3 == b13) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�.");
		}else {
			System.out.println("�߸��� �ִϹ�ȣ�Դϴ�.");
		}
		
		
	}

}
