
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 출력 예시와 똑같이 출력
		// 문제1)
		// 1 2 3
		// 4 5 6
		// 7 8 9

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(j + 1 + (3 * i) + " ");

			}
			System.out.println();
		}

		for (int k = 0; k < 3; k++) {
			int a1 = 1 + (3 * k);

			for (int i = 0; i < 3; i++) {
				System.out.printf("%d ", a1 + i);
			}
			System.out.println();
		}
		System.out.println("---------------------------");

		// 문제2)
		// 3 2 1
		// 6 5 4
		// 9 8 7

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(3 + 3 * i - j + " ");

			}

			System.out.println();
		}

		for (int k = 0; k < 3; k++) {

			int a2 = 3 + (3 * k);

			for (int i = 0; i < 3; i++) {
				int a1 = a2 - i;
				System.out.printf("%d ", a1);
			}

			System.out.println();
		}

		System.out.println("---------------------------");

		// 문제3)
		// 1 4 7
		// 2 5 8
		// 3 6 9

		for (int k = 0; k < 3; k++) {

			int a2 = 1 + k;

			for (int i = 0; i < 3; i++) {
				int a1 = a2 + (3 * i);
				System.out.printf("%d ", a1);
			}
			System.out.println();
		}
		System.out.println("---------------------------");

		// 문제4)
		// *
		// * *
		// * * *

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

		for (int k = 0; k < 3; k++) {

			int a1 = 1 + k;

			for (int i = 0; i < a1; i++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println("---------------------------");

		// 문제5)
		// *
		// * *
		// * * *

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < 3 - i; j++) {

				System.out.print(" ");

			}
			for (int j2 = 0; j2 < i; j2++) {

				System.out.print("*");

			}
			System.out.println();
		}

		for (int k = 0; k < 3; k++) {

			int a1 = 2 - k;

			for (int i = 0; i < 3; i++) {
				if (i < a1) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println("---------------------------");

		// 문제6)
		// * *
		// *
		// * *

		for (int k = 0; k < 3; k++) {

			int a1 = k % 2;

			for (int i = 0; i < 3; i++) {
				if (i % 2 == a1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
