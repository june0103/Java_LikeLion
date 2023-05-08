package com.test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2byte stream
		// �ڹٴ� ���� �ϳ��� 2 byte�� ����ϱ� ������
		// ���ڿ� ����� �������� ����ϴ� ��Ʈ������ 2byte stream�̶�� �θ���.
		// ���δ��� ������� �����ϰ� ���ڿ� ���ڵ� ������ �����ϴ�.

//		saveData();
//		printData();
//		loadData();
		keyboardInput();
	}

	public static void saveData() {
		try {
			// �⺻ ��Ʈ�� ����
			FileOutputStream fos = new FileOutputStream("test4.txt");
			// OutputStreamWriter
			// ���ڿ� ���ڵ��� �����ϴ� ���� ��Ʈ��
			OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
			// ��� ���۸� ����ϴ� ���� ��Ʈ��
			BufferedWriter bw = new BufferedWriter(writer);
			// println, print, printf �� ����� �� �ִ� ���� ��Ʈ��
			PrintWriter pw = new PrintWriter(bw);

			// ���Ͽ� ����
			pw.print("�ȳ��ϼ���");
			pw.println("�ݰ����ϴ�");
			pw.printf("�̸��� %s�̰�, ���̴� %d�� �Դϴ�\n", "ȫ�浿", 30);

			pw.flush();
			pw.close();
			bw.close();
			writer.close();
			fos.close();

			System.out.println("���� �Ϸ�");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printData() {
		try {
			// �⺻ ���(�͹̳�)�� ���ڵ��� ���� �� �� �ֵ��� �۾�
			OutputStreamWriter writer = new OutputStreamWriter(System.out, "UTF-8");
			BufferedWriter bw = new BufferedWriter(writer);
			PrintWriter pw = new PrintWriter(bw);

			pw.print("�ȳ��ϼ���");
			pw.println("�ݰ����ϴ�");
			pw.printf("�̸��� %s�̰�, ���̴� %d�� �Դϴ�\n", "ȫ�浿", 30);

			pw.flush();
			pw.close();
			bw.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void loadData() {
		try {

			FileInputStream fis = new FileInputStream("test4.txt");
			// ���ڵ� ����
			// ���ڵ� ����
			InputStreamReader irs = new InputStreamReader(fis, "UTF-8");
			// �Է� ���� ���
			BufferedReader br = new BufferedReader(irs);

			// �о�´�.
			String str1 = null;
			StringBuffer buffer = new StringBuffer();

			do {
				// �� ���� �о�´�.
				str1 = br.readLine();
				if (str1 != null) {
					buffer.append(str1);
				}
			} while (str1 != null);

			br.close();
			irs.close();
			fis.close();

			// StringBuffer�� ���ڿ��� String�� �����.
			String result = buffer.toString();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void keyboardInput() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			System.out.print("�Է�1 : ");
			String str1 = br.readLine();
			System.out.print("�Է�2 : ");
			String str2 = br.readLine();

			br.close();
			isr.close();

			System.out.println(str1);
			System.out.println(str2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
