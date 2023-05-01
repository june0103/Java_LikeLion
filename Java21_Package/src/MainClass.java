// �ϳ��� Java���Ͽ� Ŭ������ ������ ����� �Ͱ�
// ���� Java���Ϸ� Ŭ������ ����� ���� ��� �����ϰ�
// ���� �ٸ� Ŭ���� ���Ϸ� ���������.

// Package : Java���� java���ϰ� class���ϵ��� ���� ������ �����ϱ� ���� ����
// Package�� ���Ե��� ���� ���ϵ��� default package�� ����
// Package�� ���ԵǾ� �ִ� ���ϵ��� ��� ������ ���� �ۼ�
// package ��Ű����

// ���� ��Ű���� �ִ� Ŭ�������� �����Ӱ� ����� ����
// �ٸ� ��Ű���� �ִ� Ŭ�������� import�� ����Ͽ� Ŭ������ � ��Ű���� �ִ��� �˷�����Ѵ�.
import com.test.pkg1.TestClass10;
import com.test.pkg1.TestClass11;

// * �� �̿��ϸ� ������ ��Ű���� ��� Ŭ������ import �� �� �ִ�.
import com.test.pkg2.*;

// ������ TestClass10�� com.test.pkg1���ִٰ� ����Ͽ��� ������
// ��Ű���� �ٸ����� ���� �̸��� Ŭ������ import�� �� ����.
// import com.test.pkg3.TestClass10;

// pkg2�� pkg3�� ���� TestClass20 �� �ֱ� ������ TestClass20�� ����ϴ� ������ �����߻�
// import com.test.pkg3.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass1 t1 = new TestClass1();
		System.out.printf("t1 : %s\n", t1);

		TestClass2 t2 = new TestClass2();
		System.out.printf("t2 : %s\n", t2);

		TestClass10 t10 = new TestClass10();
		System.out.printf("t10 : %s\n", t10);

		TestClass11 t11 = new TestClass11();
		System.out.printf("t11 : %s\n", t11);

		TestClass20 t20 = new TestClass20();
		System.out.printf("t20 : %s\n", t20);

		TestClass21 t21 = new TestClass21();
		System.out.printf("t21 : %s\n", t21);

		// import �� �ٸ� ��Ű���� Ŭ������ ������ �̸��� Ŭ������ ��� �� ����
		// �տ� ��Ű������ �ݵ�� ������� �Ѵ�.
		com.test.pkg3.TestClass10 t100 = new com.test.pkg3.TestClass10();
		System.out.printf("t100 : %s\n", t100);

		com.test.pkg3.TestClass20 t200 = new com.test.pkg3.TestClass20();
		System.out.printf("t200 : %s\n", t200);
	}

}

class TestClass2 {

}
