package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Wrapper ��ü�� toString �޼��带 �̿��� ��ȯ�� �� �ִ�.
		Integer int1 = 100;
		String str1 = int1.toString();
		System.out.println(str1);

		Double double1 = 11.11;
		String str2 = double1.toString();
		System.out.println(str2);

		// Wrapper Ŭ������ static �޼��� ���
		String str3 = Integer.toString(100);
		String str4 = Double.toString(11.11);
		System.out.println(str3);
		System.out.println(str4);

		// + ������ ���
		// ���ڿ��� ���ڿ� �ƴ� ���� + ������ �ϸ� ���ڿ��� �ƴ� ���� ���ڿ��� ��ȯ
		// �� ���ڿ��� ��ģ ���ο� ���ڿ��� ������ش�
		String str5 = 100 + "";
		String str6 = 11.11 + "";
		System.out.println(str5);
		System.out.println(str6);

		// ���ڿ� ���� �⺻ �ڷ��� ������ ��ȯ�Ѵ�.
		// Wrapper Ŭ������ static �޼��带 Ȱ���Ѵ�.
		String str7 = "100";
		String str8 = "11.11";

		int a100 = Integer.parseInt(str7);
		double a200 = Double.parseDouble(str8);
		System.out.println(a100);
		System.out.println(a200);
	}

}
