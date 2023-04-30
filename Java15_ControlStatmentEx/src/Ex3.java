public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 제출과제

		// 문제1)
		// 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4)
		// + (1 + 2 + 3 + 4 + 5) + ... + (1 + 2 + ... + 9 + 10)
		// 의 총 합을 출력하세요
		// 출력해야할 답 220

		int sum1 = 0;
		int a = 0;
		for (int i = 0; i <= 10; i++) {

			a += i;
			sum1 = sum1 + a;

		}
		System.out.printf("문제1 정답 : %d\n", sum1);

		// 문제2)
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + ...
		// 이런식으로 더했을 때 몇 까지 더해야지 총 합이 100 이상이 되는지 구하세요.
		// 출력해야할 답 199

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
		System.out.printf("문제2 정답 : %d\n", b);

		// 문제3)
		// 방정식 2x + 4y = 10 에서 가능한 모든 x, y 의 조합을 출력하세요
		// 단, x는 0 ~ 10, y는 0 ~ 10 까지 이다.
		// 출력해야할 답 1,2 3,1 5,0
		System.out.println("문제3 정답");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {

				if (2 * i + 4 * j == 10) {
					System.out.printf("x = %d, y = %d\n", i, j);
				}

			}
		}

	}

}
