package com.test.main;

public class MainClass {

	public static void main(String[] args) {

		// �ڳ��� ��ü ����
		AnimalClass a1 = new AnimalClass() {

			public void howEat() {
				System.out.println("�ڸ� �̿��� �Խ��ϴ�.");
			}
		};
		a1.type = "�ڳ���";
		a1.name = "������";
		a1.numberLegs = 4;

		// ������ ��ü�� �����Ѵ�
		AnimalClass a2 = new AnimalClass() {
			public void howEat() {
				System.out.println("��Ḧ �Խ��ϴ�");
			}
		};
		a2.type = "������";
		a2.name = "������";
		a2.numberLegs = 4;

		System.out.println(a1.type);
		System.out.println(a1.name);
		System.out.println(a1.numberLegs);
		a1.howEat();
		System.out.println(a2.type);
		System.out.println(a2.name);
		System.out.println(a2.numberLegs);
		a2.howEat();
	}
}

class AnimalClass {
	String type;
	String name;
	int numberLegs;

	public void howEat() {

	}
}
