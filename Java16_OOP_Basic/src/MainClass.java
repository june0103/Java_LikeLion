
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ŭ������ ���� ��ü�� �����Ѵ�.
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1 : %s\n", t1);

		//t1�� ����Ǿ� �ִ� ��ü�� ID�� t2�� ����
		TestClass1 t2 = t1;
		System.out.printf("t2 : %s\n", t2);
		
		//���ο� ��ü ����
		TestClass1 t3 = new TestClass1();
		System.out.printf("t3 : %s\n", t3);
		
	}

}

// Ŭ���� ����
class TestClass1 {

}
