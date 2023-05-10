package com.test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. ����Ʈ�� ���� ���α׷��� �����.
//
//		Ÿ��1) �̸� : ������, �� : 16�Ⱑ, ����� : 128�Ⱑ
//		Ÿ��2) �̸� : ������, �� : 8�Ⱑ, ����� : 256�Ⱑ
//		Ÿ��3) �̸� : ������, �� : 12�Ⱑ, ����� : 1024�Ⱑ
//		Ÿ��4) �̸� : ������, �� : 24�Ⱑ, ����� : 512�Ⱑ
//
//		����ڿ��� �Է� �޴´�.
//		����Ʈ�� Ÿ���� �����ΰ�? 
//		�Է� ���� Ÿ���� ����Ʈ�� ��ü�� �����Ͽ� ArrayList�� ��´�.
//		0 �� �Է��ϸ� �Է��� �ߴ��ϰ� ArrayList�� ��� ����Ʈ�� ���� ��ü�� ����Ѵ�.

		Factory factory = new Factory();

		int type = 0;
		do {
			type = factory.inputType();

			if (type != 0) {
				factory.inputPhone(type);
			}
		} while (type != 0);

		factory.printInfo();
	}

}

class Factory {

	private int count = 0;
	private Scanner scanner;
	ArrayList<Phone> phoneList = new ArrayList<Phone>();

	public Factory() {
		this.scanner = new Scanner(System.in);
	}

	// ����Ʈ�� Ÿ���Է�
	public int inputType() {
		System.out.println("����Ʈ�� Ÿ�� �Է�");
		System.out.println("1) �̸� : ������, �� : 16�Ⱑ, ����� : 128�Ⱑ");
		System.out.println("2) �̸� : ������, �� : 8�Ⱑ, ����� : 256�Ⱑ");
		System.out.println("3) �̸� : ������, �� : 12�Ⱑ, ����� : 1024�Ⱑ");
		System.out.println("4) �̸� : ������, �� : 24�Ⱑ, ����� : 512�Ⱑ");
		int type = scanner.nextInt();
		return type;
	}

	// �Է�Ÿ�� ��ü����
	public void inputPhone(int type) {
		Phone phone = null;

		switch (type) {
		case 1:
			phone = new Phone("������", 16, 128);
			System.out.println("1) ������");
			break;

		case 2:
			phone = new Phone("������", 8, 256);
			System.out.println("2) ������");
			break;

		case 3:
			phone = new Phone("������", 12, 1024);
			System.out.println("3) ������");
			break;

		case 4:
			phone = new Phone("������", 24, 512);
			System.out.println("4) ������");
			break;

		}
		phoneList.add(phone);
		count++;
		System.out.println(phoneList.size());
	}

	public void printInfo() {
		for (int i = 0; i < count; i++) {
			System.out.println(i+"��");
			phoneList.get(i).printInfo();
		}
	}

}

class Phone {

	// �̸�
	private String phoneName;
	// ��
	private int phoneRam;
	// �����
	private int phoneStorage;

	public Phone(String phoneName, int phoneRam, int phoneStorage) {
		this.phoneName = phoneName;
		this.phoneRam = phoneRam;
		this.phoneStorage = phoneStorage;
	}

	public void printInfo() {
		System.out.println("---------------------------");
		System.out.printf("����Ʈ�� �̸� : %s\n", phoneName);
		System.out.printf("����Ʈ�� �� : %d\n", phoneRam);
		System.out.printf("����Ʈ�� ����� : %d\n", phoneStorage);
	}

}
