package com.test.zoo;

import java.util.Scanner;

public class ZooClass {
	
	Scanner scanner;
	
	// ������ü���� ���� �迭
	public AnimalClass [] animalArray;
	// ������ ��
	public int animalCount;
	
	public ZooClass(Scanner scanner) {
		this.scanner = scanner;
		animalArray = new AnimalClass[1000];
		animalCount = 0;
	}
	
	// ������ �߰��ϴ� �޼���
	public void addAnimal(AnimalClass animal) {
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
}






