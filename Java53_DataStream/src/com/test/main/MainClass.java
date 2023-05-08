package com.test.main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DataStream
		// �⺻ �ڷ��� ���� byte �迭 ���·� ��ȯ���ִ� ������ �ϴ� ���� ��Ʈ���̴�.

		saveData();
		readData();
	}

	public static void saveData() {
		try {

			// �⺻ ��Ʈ�� ����
			FileOutputStream fos = new FileOutputStream("test3.txt");
			// ���� ��Ʈ�� ����
			// DataStream ����
			DataOutputStream dos = new DataOutputStream(fos);

			// ����.
			dos.writeInt(100);
			dos.writeDouble(11.11);
			dos.writeBoolean(true);
			dos.writeUTF("�ȳ��ϼ���");

			// �ݴ´�.
			dos.flush();
			dos.close();
			fos.close();

			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readData() {
		try {

			// �⺻ ��Ʈ�� ����
			FileInputStream fis = new FileInputStream("test3.txt");
			// DataStream ����
			DataInputStream dis = new DataInputStream(fis);

			int a1 = dis.readInt();
			double a2 = dis.readDouble();
			boolean a3 = dis.readBoolean();
			String a4 = dis.readUTF();

			// �ݴ´�
			dis.close();
			fis.close();

			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
