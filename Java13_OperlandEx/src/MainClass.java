
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// ����1
        // ���� ������ ����Ǿ� �ִ� ���� ¦���� "¦��"��
        // Ȧ���� "Ȧ��"�� ����ϴ� 3�� ���� ���� �ۼ��ϼ���.
        int a1 = 123;
				
		System.out.printf("a1 %d�� %s\n",a1, a1%2 > 0 ? "Ȧ��" : "¦��");
		System.out.println("=========================");
		
        // ����2
        // ���� ������ ����Ǿ� �ִ� ���� ���� �ڸ� ���ϸ� ������
        // �ڵ带 �ۼ��Ͽ� ����Ѵ�.
        // ��) 421 -> 400
        int a2 = 421;

        System.out.printf("a2 %d�� ���� �����ڸ��� ������ %d\n",a2, a2/100*100);
        System.out.printf("a2 %d�� ���� �����ڸ��� ������ %d\n",a2, a2-a2%100);
		System.out.println("=========================");
        
        // ����3
        // ���� ������ ����Ǿ� �ִ� ���� �� �ڸ����� ���� ����Ѵ�.
        // ��) 123
        // 1
        // 2
        // 3
        int a3 = 123;
        
        System.out.printf("a3 %d�� 100���ڸ��� %d\n", a3, a3%1000/100);
        System.out.printf("a3 %d�� 10���ڸ��� %d\n", a3, a3%100/10);
        System.out.printf("a3 %d�� 1���ڸ��� %d\n", a3, a3%10);
		System.out.println("=========================");


        // ����4)
        // �־��� ȭ�� �µ��� ���� �µ��� ����Ѵ�.
        // �����µ� = 5 / 9 x (ȸ���µ� - 32)
        int a4 = 100;
        System.out.printf("a4 %d�� ���� �µ��� %f\n",a4, (float) 5/9*(a4-32));
		System.out.println("=========================");
		
        // ����5)
        // ������ �־��� �빮�� ���ĺ��� �ҹ��ڷ� �ٲ㼭 ����Ѵ�.
        // �빮�� A�� 65�̰�, �ҹ��� a�� ������ 97�̴�.
        char a5 = 'C';
        char a6 = (char) (a5+32);
        System.out.printf("a5 �빮�� %c�� �ҹ��ڴ� %c\n", a5, a6);
		

	}

}