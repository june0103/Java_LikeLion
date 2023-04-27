
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// 문제1
        // 다음 변수에 저장되어 있는 값이 짝수면 "짝수"를
        // 홀수면 "홀수"를 결과하는 3항 연산 식을 작성하세요.
        int a1 = 123;
				
		System.out.printf("a1 %d은 %s\n",a1, a1%2 > 0 ? "홀수" : "짝수");
		System.out.println("=========================");
		
        // 문제2
        // 다음 변수에 저장되어 있는 값을 십의 자리 이하를 버리는
        // 코드를 작성하여 출력한다.
        // 예) 421 -> 400
        int a2 = 421;

        System.out.printf("a2 %d의 십의 이하자리를 버리면 %d\n",a2, a2/100*100);
        System.out.printf("a2 %d의 십의 이하자리를 버리면 %d\n",a2, a2-a2%100);
		System.out.println("=========================");
        
        // 문제3
        // 다음 변수에 저장되어 있는 값을 각 자리별로 뜯어내어 출력한다.
        // 예) 123
        // 1
        // 2
        // 3
        int a3 = 123;
        
        System.out.printf("a3 %d의 100의자리는 %d\n", a3, a3%1000/100);
        System.out.printf("a3 %d의 10의자리는 %d\n", a3, a3%100/10);
        System.out.printf("a3 %d의 1의자리는 %d\n", a3, a3%10);
		System.out.println("=========================");


        // 문제4)
        // 주어진 화씨 온도를 섭씨 온도로 계산한다.
        // 섭씨온도 = 5 / 9 x (회씨온도 - 32)
        int a4 = 100;
        System.out.printf("a4 %d의 섭씨 온도는 %f\n",a4, (float) 5/9*(a4-32));
		System.out.println("=========================");
		
        // 문제5)
        // 다음에 주어진 대문자 알파벳을 소문자로 바꿔서 출력한다.
        // 대문자 A는 65이고, 소문자 a는 정수로 97이다.
        char a5 = 'C';
        char a6 = (char) (a5+32);
        System.out.printf("a5 대문자 %c의 소문자는 %c\n", a5, a6);
		

	}

}
