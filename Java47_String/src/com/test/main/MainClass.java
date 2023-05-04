package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String : �ڹٿ��� ���ڿ� �����ϱ� ���� �����Ǵ� Ŭ����
		// " " �� ������ ���ڿ��� String ��ü
		String str1 = new String("�ȳ�");
		String str2 = "�ȳ�";

		System.out.printf("str1 : %s\n", str1);
		System.out.printf("str2 : %s\n", str2);

		// ��ü == ��ü�� ������ �� ��ü�� ���� ��ü������ Ȯ���ϴ� �۾�
		if ("�ȳ��ϼ���" == "�ȳ��ϼ���") {
			System.out.println("�ȳ��ϼ���� �ȳ��ϼ���� ���� ��ü�̴�");
		} else {
			System.out.println("�ȳ��ϼ���� �ȳ��ϼ���� ���� ��ü�� �ƴϴ�");
		}

		String str3 = new String("�ݰ����ϴ�");
		String str4 = new String("�ݰ����ϴ�");
		if (str3 == str4) {
			System.out.println("str3�� str4�� ���� ��ü�̴�");
		} else {
			System.out.println("str3�� str4�� ���� ��ü�� �ƴϴ�");
		}

		// == �� �� ��ü�� ���� ��ü���� ��
		// equals �� ��ü�� �����ϴ� ���� ������ ��
		if ("�ȳ��ϼ���".equals("�ȳ��ϼ���")) {
			System.out.println("�� ���ڿ� ��ü�� �����ϴ� ���ڿ��� ����");
		}
		if (str3.equals(str4)) {
			System.out.println("str3�� str4�� �����ϴ� ���ڿ��� ����");
		}

		// toUpperCase : �ҹ��ڸ� �빮�ڷ� �ϴ� ���ڿ� ����
		// toLowerCase : �빮�ڸ� �ҹ��ڷ� �ϴ� ���ڿ� ����
		String str5 = "ABcdEF";
		String str6 = str5.toUpperCase();
		String str7 = str5.toLowerCase();
		System.out.printf("str6 : %s\n", str6);
		System.out.printf("str7 : %s\n", str7);

		// startsWith : ~ �� �����ϴ���
		// endsWith : ~ �� ��������
		String str8 = "abcdefg";
		boolean b1 = str8.startsWith("abc");
		boolean b2 = str8.startsWith("kkk");
		boolean b3 = str8.endsWith("efg");
		boolean b4 = str8.endsWith("kkk");
		System.out.printf("b1 : %s\n", b1);
		System.out.printf("b2 : %s\n", b2);
		System.out.printf("b3 : %s\n", b3);
		System.out.printf("b4 : %s\n", b4);

		// indexOf : ������ ���ڿ��� ��ġ�� ��ȯ�Ѵ�.
		String str9 = "abcdefg";
		int idx1 = str9.indexOf("cde");
		int idx2 = str9.indexOf("kkk");
		System.out.printf("idx1 : %d\n", idx1);
		System.out.printf("idx2 : %d\n", idx2);

		// length : ���ڼ��� ��ȯ�Ѵ�.
		String str10 = "abcdefg";
		String str11 = "�ȳ��ϼ���";
		int a1 = str10.length();
		int a2 = str11.length();
		System.out.printf("a1 : %d\n", a1);
		System.out.printf("a2 : %d\n", a2);

		// substring : ���ڿ��� �Ϻθ� �����´�.
		String str12 = "abcdefg";
		// ������ 2 ���� ������
		String str13 = str12.substring(2);
		// ������ 2 ���� 5 - 1 ����
		String str14 = str12.substring(2, 5);

		System.out.printf("str13 : %s\n", str13);
		System.out.printf("str14 : %s\n", str14);

		// trim : ���ڿ��� �¿� ������ �����Ѵ�.
		String str15 = "     aaa     ";
		System.out.printf("[%s]\n", str15);
		System.out.printf("[%s]\n", str15.trim());
		
	}

}
