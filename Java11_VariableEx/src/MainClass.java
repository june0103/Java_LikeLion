
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����1)
		// ���� �� �⺻ �ڷ������� ����Ʈ ���� �´� �ڷ����� ( )�ȿ� �ۼ��ϼ���
		// ���� ���� X �� �־��ּ���
		// ���� : 1 byte - ( boolean ), 2 byte - ( x ), 4 byte - ( x ), 8 byte - ( x )
		// ������ : 1 byte - ( x ), 2 byte - ( char ), 4 byte - ( x ), 8 byte - ( x )
		// ������ : 1 byte - ( byte ), 2 byte - ( short ), 4 byte - ( int ), 8 byte - ( long ) 
		// �Ǽ��� : 1 byte - ( x ), 2 byte - ( x ), 4 byte - ( float ), 8 byte - ( double )

		// ����2)
		// �ֹε�� ��ȣ�� 13�ڸ��� ������ ������ ������ �����ϰ��� �Ѵ�.
		// ������ �����ϰ� ����� ������ ���� ����ϴ� �ڵ带 �ۼ����ּ���
		
		long resident_registration_number = 1234567890123L;
		System.out.printf("�ֹε�Ϲ�ȣ = %d\n", resident_registration_number);
	

		// ����3)
		// ������ ���ǵ� ������ ���� �ٸ� ������ �������� �Ѵ�.
		// ���� ���� ����� �� �ֵ��� �ڵ带 �ۼ����ּ���
		byte b = 10;
		char ch = 'A';
		short s = 50;
		int i = 100;
		long l = 1000L;

		// ���� b�� ���� int Ÿ���� a1 ������ �����ϰ� ����ϼ���
		int a1 = b;
		System.out.printf("a1 = %d\n",a1);
		
		// ���� l�� ���� int Ÿ���� a2 ������ �����ϰ� ����ϼ���
		int a2 = (int) l;
		System.out.printf("a2 = %d\n",a2);
		
		// ���� s�� ���� char Ÿ���� a3 ������ �����ϰ� ���ڷ� ����ϼ���
		char a3 = (char) s;
		System.out.printf("a3 = %c\n",a3);
		
		// ���� ch�� ���� byte Ÿ���� a4 ������ �����ϰ� ����ϼ���
		byte a4 = (byte) ch;
		System.out.printf("a4 = %d\n",a4);
		

	}

}
