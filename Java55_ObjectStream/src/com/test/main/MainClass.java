package com.test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object Stream
		// ��ü�� ������ϱ� ���� ����ϴ� ��Ʈ��
		// �ڹ� ���α׷������� �����ϴ�.

		// ��ü ����ȭ
		// ��ü�� ȿ������ ������ ���� ��ü�� ���� ��Ҹ�
		// �޸𸮻� ������ �����ϴµ� �̸� �ѵ� ��� ����Ʈ �迭 ���·�
		// ��ȯ���ִ� ��
		saveObject();
		loadObject();
	}

	public static void saveObject() {
		try {

			// �⺻ ��Ʈ��
			FileOutputStream fos = new FileOutputStream("test100.dat");
			// ��ü ��� ��Ʈ��
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// ������ ��ü
			TestClass t1 = new TestClass(100, 200);
			TestClass t2 = new TestClass(300, 300);

			// ��ü�� ����
			oos.writeObject(t1);
			oos.writeObject(t2);

			oos.flush();
			oos.close();
			fos.close();

			System.out.println("��ü ���� �Ϸ�");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loadObject() {
		try {
			
			// �⺻ ��Ʈ�� ����
			FileInputStream fis = new FileInputStream("test100.dat");
			// ��ü �б� ��Ʈ��
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// ��ü�� ����
			TestClass t10 = (TestClass) ois.readObject();
			TestClass t20 = (TestClass) ois.readObject();
			
			ois.close();
			fis.close();
			
			t10.printData();
			t20.printData();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// ��ü ����ȭ�� ���� Serializable �������̽��� ����
class TestClass implements Serializable {

	int memberA;
	int memberB;

	public TestClass(int memberA, int memberB) {
		this.memberA = memberA;
		this.memberB = memberB;
	}

	public void printData() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
	}
}