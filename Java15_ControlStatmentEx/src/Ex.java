import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 사용자에게 숫자를 입력 받아 그 숫자 까지의 총합을 구한다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a1 = sc.nextInt();
		int sum1 = 0;
		for (int i = 0; i <= a1; i++) {
			sum1 += i;
		}
		System.out.printf("입력값 : %d\n", a1);
		System.out.printf("총 합 : %d\n", sum1);

		// 2. 사용자에게 숫자를 입력 받아 그 숫자의 배수 100개를 출력한다.
		System.out.println("배수 100개");
		for (int i = 0; i < 100; i++) {

			System.out.printf("%d ", a1 * i);
		}

		System.out.println();
		// 3. 사용자에게 숫자를 입력 받아 2에서 부터 그 숫자까지의 범위 안에서
		// 소수(1과 자기 자신으로만 나눠지는 수)를 모두 출력한다.

		for (int i = 2; i < a1; i++) {
			if (a1 % i == 0 && a1 % i == 1) {
				System.out.println(a1);
			}
		}

		// 2는 소수이므로 그냥 출력한다.
		System.out.printf("%d ", 2);
		// 3에서 부터 입력한 숫자까지 반복한다.
		for (int i = 3; i <= a1; i++) {

			// 2에서 부터 현재 숫자 - 1까지 반복한다.

			// 현재 숫자를 현재 숫자2로 나눈 나머지가 0인지 확인한다.

			// 소수면 출력한다.
		}
		// 3에서 부터 입력한 숫자까지 반복한다.
		for (int i = 3; i <= a1; i++) {

			boolean chk = true;

			// 2에서 부터 현재 숫자 - 1까지 반복한다.
			for (int k = 2; k <= i - 1; k++) {

				// 현재 숫자를 현재 숫자2로 나눈 나머지가 0인지 확인한다.
				int a3 = i % k;
				if (a3 == 0) {
					chk = false;
					break;
				}
			}
			// 소수면 출력한다.
			if (chk == true) {
				System.out.printf("%d ", i);
			}
		}

		// 4. 주민등록 번호를 입력받아 올바른 주민 등록 번호인지 확인한다.
		// (2 x 1자리) + (3 x 2자리) + (4 x 3자리) + (5 x 4자리)
		// + (6 x 5자리) + (7 x 6자리) + (8 x 7자리) + (9 x 8자리)
		// + (2 x 9자리) + (3 x 10자리) + (4 x 11자리) + (5 x 12자리) 의 합을 구한다.
		// 위의 합을 11로 나눈 나머지를 구한다.
		// 11에서 나머지를 뺀다.-
		// 뺀 숫자를 10으로 나눈 나머지를 구한다. 이 값이 13번째 자리 숫자가 된다.
		
		//숫자를 입력받고 각 자리수를 뜯어낸다
		System.out.print("주민번호 입력 : ");
		long nb = sc.nextLong();
		// 각 자리수를 뜯어낸다.
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
		
        // 공식에 의해서 계산한다.
		
		long nbSum =  (b1 * 2) + (b2 * 3) + (b3 * 4) + (b4 * 5)
                + (b5 * 6) + (b6 * 7) + (b7 * 8) + (b8 * 9)
                + (b9 * 2) + (b10 * 3) + (b11 * 4) + (b12 * 5);
		long nbSum1 = nbSum % 11;
        long nbSum2 = 11 - nbSum1;
        long nbSum3 = nbSum2 % 10;
        
      

        // 계산된 결과와 13번째 자리 숫자리를 비교한다.

        // 같으면 유효하다고 출력한다.
        if (nbSum3 == b13) {
			System.out.println("올바른 주민번호입니다.");
		}else {
			System.out.println("잘못된 주니번호입니다.");
		}
		
		
	}

}
