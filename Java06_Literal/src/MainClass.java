
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���ͷ� : ���α׷��� ���� ���� �ۼ��ϴ� ����
		
		// ���� ���ͷ�
		System.out.println(100);
		System.out.println(200);
		
		System.out.println("���� : " + 100);
		System.out.println("���� : " + 200 + ", " + 300);
		
		System.out.printf("���� : %d\n",100);
		System.out.printf("���� : %d, %d\n",200,300);
		
		// ������ �ۼ��ϸ� �޸𸮿� 4byte �������� ���õǾ� ����ȴ�.
		// �� 42�ﰳ�� ���� ǥ���� �����ϴ�.
		System.out.printf("�����ִ� : %d\n", 2147483647);
		System.out.printf("�����ּ� : %d\n", -2147483648);
		
		// ���� �ڿ� l �̳� L �� �ٿ��ָ� 8byte �������� ���õǾ� ����ȴ�.
		// �� �� 1900�氳�� ���� ǥ���� �����ϴ�.
		System.out.printf("long �ִ� : $d\n", 9223372036854775807L);
		System.out.printf("long �ּ� : $d\n", -9223372036854775808L);
		
		// ���� 2byte
		// ���� ����ǥ�� �ۼ��Ѵ�.
		System.out.printf("���� : %c\n", 'a');
		System.out.printf("���� : %c\n", '��');
		
		// �Ǽ� 8byte
		System.out.printf("�Ǽ� : %f\n", 11.11);
		
		// �Ǽ� 4byte
		// �Ǽ� �ڿ� f�� F�� ���̸� 4byte �������� ����Ѵ�.
		System.out.printf("float : %f\n" , 11.11F);
		
		// ���� (1byte)
        System.out.printf("���� : %s\n", true);
        System.out.printf("���� : %s\n", false);
        
        // ���ڿ�
        // ���ڿ��� ���� �ƴϴ�. " " �� �����ش�.
        System.out.printf("���ڿ�: %s\n", "�ݰ����ϴ�");
        
        // ���� 4����Ʈ, L�� 8����Ʈ
        // ���� 2����Ʈ, ���ڿ� " "
        // �Ǽ� 8����Ʈ, float f 4����Ʈ
        // �� 1����Ʈ
        
		
	}

}
