package com.test.main;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {

		// Collection
		// ��ü���� ��Ƽ� �����ϴ� ��ҵ�
		// List : ������ ���� ����
		// Map : �̸��� ���� ����
		// Set : ����(�ߺ��� ��ü�� ���� �� ����, ������ �̸��� ���� ������ ����)

		// List
		ArrayList list1 = new ArrayList();
		list1.add("���ڿ�1");
		list1.add("���ڿ�2");
		list1.add("���ڿ�3");
		list1.add(100);
		list1.add(11.11);

		// �����ϴ� ��ü�� ����
		System.out.printf("��ü ���� : %d\n", list1.size());

		for (Object object : list1) {
			System.out.println(object);
		}

		// ��ü�� �����Ͽ� ������ ����ش�
		String str1 = (String) list1.get(0);
		Integer int1 = (Integer) list1.get(3);
		Double double1 = (Double) list1.get(4);

		System.out.println(str1);
		System.out.println(int1);
		System.out.println(double1);

		// Generic type
		// Collection ���� Generic type �̶�� ���� ������ �� �ִ�.
		// Generic type�� Collection�� ������ ��ü�� Ÿ���� �����ϴ� �����ν�
		// ��ü�� ������ �� ����ȯ�� �ڵ����� ���ش�.

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("���ڿ�1");
		list2.add("���ڿ�2");
		list2.add("���ڿ�3");
		// list2.add(2); ���ڿ� �ƴ϶� ����

		String str10 = list2.get(0);
		String str11 = list2.get(1);
		String str12 = list2.get(2);

		System.out.printf("%s, %s, %s\n", str10, str11, str12);

		for (String str13 : list2) {
			System.out.println(str13);
		}

		// HashMap
		// <�̸�Ÿ��, ��üŸ��>
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("key1", "���ڿ�1");
		map1.put("key2", "���ڿ�2");
		map1.put("key3", "���ڿ�3");

		String str100 = map1.get("key1");
		String str200 = map1.get("key2");
		String str300 = map1.get("key3");
		System.out.println(str100);
		System.out.println(str200);
		System.out.println(str300);
		
		// List ���� ������ �����Ͽ� ��ü�� ����
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
		//��ü�� �����Ͽ� ����
		list1.remove("���ڿ�3");
		System.out.println(list1);
		// ����
		list1.add(1, "�߰����ڿ�");
		System.out.println(list1);
		// ��� ����
		list1.clear();
		System.out.println(list1);
		
		// HashMap���� ��ü ����
		System.out.println(map1);
		map1.remove("key1");
		System.out.println(map1);
		// ��� ����
		map1.clear();
		System.out.println(map1);
		

	}
}
