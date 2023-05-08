package com.test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stream : �����͸� �ܺο� �а� �� �� �ֵ��� �����Ǵ�
		// �ڹ� Ŭ������
		// �⺻��Ʈ��
		// �����͸� ���� �а� �� �� �ִ� ��Ʈ����
		// InputStream�� OutputStream�� ��ӹް� �ִ�.
		// ���ͽ�Ʈ��
		// �⺻ ��Ʈ������ ���� ������ �ϸ� �� ������ �����͸� �����ϴ� ���̴�.

		saveData1();
		saveData2();
		readData();
	}

	// ������ ����
	public static void saveData1() {
		try {
			// ������ ���� ���� ��Ʈ���� �����Ѵ�.
			// �̹� ������ �ִٸ� ������ ������ ��� ����� ���� ����.
			// ������ ���ٸ� ������ �������ش�.
			FileOutputStream fos = new FileOutputStream("test.txt");

			// ������ �����͸� �غ��Ѵ�.
			String value1 = "�ݰ����ϴ�";

			// �����͸� ����Ʈ ���·� �����Ѵ�.
			byte[] data1 = value1.getBytes();

			// �����͸� ����.
			fos.write(data1);
			// ��¹��ۿ� �����Ͱ� ���� ���� ���� �ֱ� ������
			fos.flush();
			// �ݾ��ش�.
			fos.close();

			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void saveData2() {
		try {
			// ������ ���� ���� ��Ʈ���� �����Ѵ�.
			// �̹� ������ �ִٸ� ���� ���뿡 �̾ �ۼ�
			// ������ ���ٸ� ������ �������ش�.
			FileOutputStream fos = new FileOutputStream("test2.txt", true);

			// ������ �����͸� �غ��Ѵ�.
			String value1 = "�ȳ��ϼ���\n";

			// �����͸� ����Ʈ ���·� �����Ѵ�.
			byte[] data1 = value1.getBytes();

			// �����͸� ����.
			fos.write(data1);
			// ��¹��ۿ� �����Ͱ� ���� ���� ���� �ֱ� ������
			fos.flush();
			// �ݾ��ش�.
			fos.close();

			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �о����
	public static void readData() {
		try {
			// FileInputStream�� �����Ѵ�.
			// ������ ������ ������ ������ �߻��Ѵ�.
			FileInputStream fis = new FileInputStream("test2.txt");
			// �о�� �������� ��(���� �뷮 byte)�� ���Ѵ�.
			int byteSize = fis.available();

			System.out.println(byteSize);

			// �����͸� ���� byte Ÿ���� �迭�� �����Ѵ�.
			byte[] byteArray = new byte[byteSize];
			// �����͸� �о�´�.
			fis.read(byteArray);
			// �ݾ��ش�
			fis.close();

			// ���ڿ� ��ü ����
			String str1 = new String(byteArray);
			System.out.println(str1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
