package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// StringBuffer : �����ϴ� ���ڿ��� ���� �������� ������ �� �� �ִ�.
		// String �� �����ϴ� ���ڿ��� ������ �Ұ����ϴ�.
		// �̿�, �߰� ��ȯ ���� ���� �۾��� �ϰ� �Ǹ� ���ο� ���ڿ��� ��� �����ȴ�.
		// �޸𸮸� ȿ�������� ����ϱ� ���� ���� ��ȭ�Ǵ� ���ڿ��� StringBuffer�� �����Ѵ�.

		// StringBuffer ����
		StringBuffer buffer1 = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer("���ڿ�");

		// ���ڿ� �߰�
		buffer1.append(100);
		buffer1.append(11.11);
		buffer1.append("���ڿ�");

		System.out.println(buffer1);

		// StringBuffer -> String
		String str1 = buffer1.toString();
		System.out.println(str1);

		// ����
		buffer1.insert(2, 555);
		buffer1.insert(8, "8�����ڿ�");
		System.out.println(buffer1);

		// ����
		// 2 ~ 5 - 1������ ���ع��� ��λ����� �ٲ۴�
		buffer1.replace(2, 5, "���ع��� ��λ�");
		System.out.println(buffer1);

		// ����
		// 2 ~ 10 - 1���� �����Ѵ�.
		buffer1.delete(2, 10);
		System.out.println(buffer1);
	}

}
