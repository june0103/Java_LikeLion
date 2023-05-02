package com.test.zoo;

import java.util.Scanner;

public class ZooClass {
	
	private Scanner scanner;
	// ������ü���� ���� �迭
	private AnimalClass [] animalArray;
	// ������ ��
	private int animalCount;
	
	public ZooClass() {
		this.scanner = new Scanner(System.in);
		animalArray = new AnimalClass[1000];
		animalCount = 0;
	}
	
	// ������ �߰��ϴ� �޼���
	public void addAnimal(int typeNumber) {
		
		// ������ �̸��� �Է¹޴´�.
		System.out.print("������ �̸��� �Է����ּ��� : ");
		String name = scanner.next();
		// ���� ��ü�� �����Ѵ�.
		AnimalClass animal = null;
		
		switch(typeNumber) {
		case 1 :
			animal = new ElephantClass(name);
			break;
		case 2 :
			animal = new DesertFoxClass(name);
			break;
		case 3 :
			animal = new KangarooClass(name);
			break;
		}
		
		animalArray[animalCount] = animal;
		animalCount++;
	}
	
	// �Է��� �������� ������ ����ϴ� �޼���
	public void printAnimalInfo() {
		// ������ �� ��ŭ �ݺ��Ѵ�.
		for(int i = 0 ; i < animalCount ; i++) {
			AnimalClass animal = animalArray[i];
			animal.printInfo();
			animal.howEat();
			System.out.println();
		}
	}
	
	// ������ Ÿ���� �Է¹޾� ��ȯ�Ѵ�.
	public int inputAnimalType() {
		// ���� Ÿ�� ��ȣ�� �Է¹޴´�.
		System.out.println("������ Ÿ���� �Է����ּ���");
		System.out.print("1.�ڳ���, 2.�縷����, 3.Ļ�ŷ�, 0.���� : ");
		int typeNumber = scanner.nextInt();
		return typeNumber;
	}
}

class AnimalClass {
	// �ٸ� ����
	int numberLegs;
	// ���� ����
	String lengthNose;
	// ���� ũ��
	String bodySize;
	// �̸�
	String name;
	// ���� Ÿ��
	String type;
	
	// �Ļ� ���
	public void howEat() {
		
	}
	
	// ���
	public void printInfo() {
		System.out.printf("���� Ÿ�� : %s\n", type);
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("�ٸ� ���� : %d\n", numberLegs);
		System.out.printf("���� ���� : %s\n", lengthNose);
		System.out.printf("���� ũ�� : %s\n", bodySize);
	}
}

class ElephantClass extends AnimalClass{
	
	public ElephantClass(String name) {
		this.type = "�ڳ���";
		this.name = name;
		this.numberLegs = 4;
		this.lengthNose = "���";
		this.bodySize = "ũ��";
	}

	@Override
	public void howEat() {
		System.out.println("�ڸ� �̿��� �Խ��ϴ�");
	}
}

class DesertFoxClass extends AnimalClass{
	
	public DesertFoxClass(String name) {
		this.type = "�縷����";
		this.name = name;
		this.numberLegs = 4;
		this.lengthNose = "ª��";
		this.bodySize = "�۴�";
	}
	
	@Override
	public void howEat() {
		System.out.println("���� �̿��� �Խ��ϴ�");
	}
}

class KangarooClass extends AnimalClass{
	
	public KangarooClass(String name) {
		this.type = "Ļ�ŷ�";
		this.name = name;
		this.numberLegs = 2;
		this.lengthNose = "ª��";
		this.bodySize = "ũ��";
	}
	
	@Override
	public void howEat() {
		System.out.println("�������� ��� �Խ��ϴ�");
	}
}