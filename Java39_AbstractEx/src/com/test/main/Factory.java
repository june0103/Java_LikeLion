package com.test.main;

import java.util.Scanner;

public class Factory {

	// �ڵ��� �ִ� ��� ������
	private final int CAR_MAX_COUNT = 100;
	// �Է��� �ڵ��� ��� (�������� �ƴϱ⿡ final x)
	private int carCount = 0;

	// ��ĳ��
	private Scanner scanner;
	// �ڵ������� ���� �迭
	private Car[] carList;

	public Factory() {
		this.scanner = new Scanner(System.in);
		carList = new Car[CAR_MAX_COUNT];
	}

	// �ڵ��� Ÿ�� �Է� �޼���
	public int inputCarType() {
		System.out.println("�ڵ��� ���� �Է�");
		System.out.print("1.SUV, 2.����, 3.����ī, 0.����: ");
		int carType = scanner.nextInt();
		return carType;
	}

	// �ڵ��� �̸��� �Է� �޾� �ڵ��� ��ü�� �����ϴ� �޼���
	public void inputCarInfo(int carType) {
		System.out.print("�ڵ��� �̸��� �Է� : ");
		String name = scanner.next();

		// �ڵ��� ������ ���� ��ü ����
		Car car = null;

		switch (carType) {
		case 1:
//			car = new Car() {
//
//				@Override
//				public void startEngine() {
//					// TODO Auto-generated method stub
//					System.out.println("��ư�� ���� �õ��� �̴ϴ�.");
//				}
//			};
//			car.setCarType("SUV");
//			car.setCarName(name);
//			car.setCarPrice("�δ�");
//			car.setCarColor("������");

			car = new SUVClass("SUV", name, "�δ�", "������");
			break;

		case 2:
//			car = new Car() {
//
//				@Override
//				public void startEngine() {
//					// TODO Auto-generated method stub
//					System.out.println("ī�带 �÷��Ӵϴ�.");
//				}
//			};
//			car.setCarType("����");
//			car.setCarName(name);
//			car.setCarPrice("�����̴�");
//			car.setCarColor("������");

			car = new SedanClass("����", name, "�����̴�", "������");
			break;

		case 3:
//			car = new Car() {
//
//				@Override
//				public void startEngine() {
//					// TODO Auto-generated method stub
//					System.out.println("���� �ν����� �õ��� �̴ϴ�.");
//				}
//			};
//			car.setCarType("����ī");
//			car.setCarName(name);
//			car.setCarPrice("��δ�");
//			car.setCarColor("�����");

			car = new SuperClass("����ī", name, "��δ�", "�����");
			break;

		}

		carList[carCount] = car;
		carCount++;

	}

	// �ڵ��� �������� ����ϴ� �޼���
	public void printCarInfo() {
		for (int i = 0; i < carCount; i++) {
			carList[i].printCarInfo();
		}
	}

}

//abstract class Car {
//
//	// getter, setter ĸ��ȭ
//	// �ڵ��� ����
//	private String carType;
//	// �ڵ��� �̸�
//	private String carName;
//	// �ڵ��� ����
//	private String carPrice;
//	// �ڵ��� ����
//	private String carColor;
//
//	// �ڵ��� �õ� ���
//	public abstract void startEngine();
//
//	public void setCarType(String carType) {
//		this.carType = carType;
//	}
//
//	public void setCarName(String carName) {
//		this.carName = carName;
//	}
//
//	public void setCarPrice(String carPrice) {
//		this.carPrice = carPrice;
//	}
//
//	public void setCarColor(String carColor) {
//		this.carColor = carColor;
//	}
//
//	// �ڵ����� ������ ����ϴ� �޼���
//	public void printCarInfo() {
//		System.out.printf("�ڵ��� ���� : %s\n", carType);
//		System.out.printf("�ڵ��� �̸� : %s\n", carName);
//		System.out.printf("�ڵ��� ���� : %s\n", carPrice);
//		System.out.printf("�ڵ��� ���� : %s\n", carColor);
//		// �߻�޼ҵ�
//		startEngine();
//	}
//
//}

abstract class Car {

	// �ڵ��� ����
	private String carType;
	// �ڵ��� �̸�
	private String carName;
	// �ڵ��� ����
	private String carPrice;
	// �ڵ��� ����
	private String carColor;

	public Car(String carType, String carName, String carPrice, String carColor) {
		this.carType = carType;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carColor = carColor;
	}

	public abstract void startEngine();

	// �ڵ����� ������ ����ϴ� �޼���
	public void printCarInfo() {
		System.out.printf("�ڵ��� ���� : %s\n", carType);
		System.out.printf("�ڵ��� �̸� : %s\n", carName);
		System.out.printf("�ڵ��� ���� : %s\n", carPrice);
		System.out.printf("�ڵ��� ���� : %s\n", carColor);
		startEngine();
	}
}

// SUV
class SUVClass extends Car {

	public SUVClass(String carType, String carName, String carPrice, String carColor) {
		super(carType, carName, carPrice, carColor);
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("��ư�� ���� �õ��� �̴ϴ�.");
	}

}

// ����
class SedanClass extends Car {

	public SedanClass(String carType, String carName, String carPrice, String carColor) {
		super(carType, carName, carPrice, carColor);
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("ī�带 �÷��Ӵϴ�.");
	}

}

// ����ī
class SuperClass extends Car {

	public SuperClass(String carType, String carName, String carPrice, String carColor) {
		super(carType, carName, carPrice, carColor);
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("���� �ν����� �õ��� �̴ϴ�.");
	}

}