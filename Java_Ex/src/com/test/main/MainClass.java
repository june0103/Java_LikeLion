package com.test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 스마트폰 공장 프로그램을 만든다.
//
//		타입1) 이름 : 아이폰, 램 : 16기가, 저장소 : 128기가
//		타입2) 이름 : 아이폰, 램 : 8기가, 저장소 : 256기가
//		타입3) 이름 : 갤럭시, 램 : 12기가, 저장소 : 1024기가
//		타입4) 이름 : 갤럭시, 램 : 24기가, 저장소 : 512기가
//
//		사용자에게 입력 받는다.
//		스마트폰 타입은 무엇인가? 
//		입력 받은 타입의 스마트폰 객체를 생성하여 ArrayList에 담는다.
//		0 을 입력하면 입력을 중단하고 ArrayList에 담긴 스마트폰 정보 전체를 출력한다.

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

	// 스마트폰 타입입력
	public int inputType() {
		System.out.println("스마트폰 타입 입력");
		System.out.println("1) 이름 : 아이폰, 램 : 16기가, 저장소 : 128기가");
		System.out.println("2) 이름 : 아이폰, 램 : 8기가, 저장소 : 256기가");
		System.out.println("3) 이름 : 갤럭시, 램 : 12기가, 저장소 : 1024기가");
		System.out.println("4) 이름 : 갤럭시, 램 : 24기가, 저장소 : 512기가");
		int type = scanner.nextInt();
		return type;
	}

	// 입력타입 객체생성
	public void inputPhone(int type) {
		Phone phone = null;

		switch (type) {
		case 1:
			phone = new Phone("아이폰", 16, 128);
			System.out.println("1) 아이폰");
			break;

		case 2:
			phone = new Phone("아이폰", 8, 256);
			System.out.println("2) 아이폰");
			break;

		case 3:
			phone = new Phone("갤럭시", 12, 1024);
			System.out.println("3) 갤럭시");
			break;

		case 4:
			phone = new Phone("갤럭시", 24, 512);
			System.out.println("4) 갤럭시");
			break;

		}
		phoneList.add(phone);
		count++;
		System.out.println(phoneList.size());
	}

	public void printInfo() {
		for (int i = 0; i < count; i++) {
			System.out.println(i+"번");
			phoneList.get(i).printInfo();
		}
	}

}

class Phone {

	// 이름
	private String phoneName;
	// 램
	private int phoneRam;
	// 저장소
	private int phoneStorage;

	public Phone(String phoneName, int phoneRam, int phoneStorage) {
		this.phoneName = phoneName;
		this.phoneRam = phoneRam;
		this.phoneStorage = phoneStorage;
	}

	public void printInfo() {
		System.out.println("---------------------------");
		System.out.printf("스마트폰 이름 : %s\n", phoneName);
		System.out.printf("스마트폰 램 : %d\n", phoneRam);
		System.out.printf("스마트폰 저장소 : %d\n", phoneStorage);
	}

}
