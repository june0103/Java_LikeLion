
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ���� ����
		// ������ ����� ���ÿ� �����Ұ� ���������.
		boolean a1;
		// ������ ����ϱ� ���� ���� �����ؾ� �Ѵ�.
		// = : ���� ������. �����ʿ� �ִ� ���� ������ ������ �����Ѵ�. �ʱ�ȭ �Ѵٰ� �θ���.
		a1 = true;
		// ������ ���
		// ������ �̸��� �ۼ��� �ָ� �������� ���� ������ ����Ѵ�.
		System.out.printf("a1 : %s\n", a1);

		// ������ ����� ���ÿ� ���� �����Ѵ�.
		boolean a2 = false;
		System.out.printf("a2 : %s\n", a2);
		
		// ���� Ÿ��(2byte ����, 0 ~ 65535)
		char char1 = 65;
		char char2 = 'A';
		
		System.out.printf("char1 : %c\n", char1);
		System.out.printf("char2 : %c\n", char2);
		
		// ���� Ÿ��
		// 1byte
		byte byte1 = 127;
		// 2byte
		short short1 = 32767;
		// 4byte
		int int1 = 2147483647;
		// 8byte
		long long1 = 922337203684775807L;
		
		System.out.printf("byte : %d\n", byte1);
		System.out.printf("short : %d\n", short1);
		System.out.printf("int : %d\n", int1);
		System.out.printf("long : %d\n", long1);
		
		// �Ǽ� Ÿ��
		// 4byte
		float float1 = 11.11f;
		// 8byte
		double double1 = 22.22;
		
		System.out.printf("float : %f\n", float1);
		System.out.printf("double : %f\n", double1);
		
		// ���ڿ�
		String str1 = "�ȳ��ϼ���";
		System.out.printf("String : %s\n", str1);
		
		
	}

}
