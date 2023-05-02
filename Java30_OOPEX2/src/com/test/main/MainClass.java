package com.test.main;

import java.util.Scanner;

import com.test.zoo.AnimalClass;
import com.test.zoo.DesertFoxClass;
import com.test.zoo.ElephantClass;
import com.test.zoo.KangarooClass;
import com.test.zoo.ZooClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������
		// ��� Ŭ������ com.test.zoo ��� ��Ű���� ������ش�.
		// �������� Ư¡�� ������ ����.
		// �ڳ���
		// �ٸ� : 4��, �� : ���, �� : ũ��, �Ļ��� : �ڸ� �̿��� �Դ´�.
		// �縷����
		// �ٸ� : 4��, �� : ª��, �� : �۴�, �Ļ��� : ���� �̿��� �Դ´�.
		// Ļ�ŷ�
		// �ٸ� : 2��, �� : ª��, �� : ũ��, �Ļ��� : �������� ��� �Դ´�.
		// �ٸ�, ��, ���� ������ �����Ѵ�.
		// �Ļ� ����� �޼���� �����Ѵ�.
		// �� ������ �ڽ��� ������ ����ϴ� �޼��带 ������ �ִ�.
		
		// ����
		// ������ ������ �Է����ּ���
		// 1. �ڳ���, 2. �縷����, 3. Ļ�ŷ�, 0. �Է³� : 1
		// ������ �̸��� �Է����ּ��� : ����
		// ���� �Է��� 0�� �Է��� �� ���� �ݺ��Ѵ�....
		// 0�� ���� �Է��� ������ ��� ������ ������ ����Ѵ�.
		// Ÿ�� : �ڳ���
		// �̸� : ����
		// �ٸ� : 4��
		// �� : ���
		// �� : ũ��
		// �Ļ��� : ���� �̿��� �Դ´�.
		// .......
		
		Scanner scanner = new Scanner(System.in);
		
		// ������ ��ü�� �����Ѵ�.
		ZooClass zooClass = new ZooClass(scanner);
		
		// �Է¹��� ������ Ÿ�� ��ȣ
		int typeNumber = 0;
		
		// �Է� �޴� ���� ��ȣ�� 0�� �ƴ� ���� �ݺ��Ѵ�.
		do {
			// ���� Ÿ�� ��ȣ�� �Է¹޴´�.
			System.out.println("������ Ÿ���� �Է����ּ���");
			System.out.print("1.�ڳ���, 2.�縷����, 3.Ļ�ŷ�, 0.���� : ");
			typeNumber = scanner.nextInt();
			
			// ���� Ÿ�� ��ȣ�� 0�� �ƴ϶��...
			if(typeNumber != 0) {
			
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
			
				// ���� ��ü�� ����ش�.
				zooClass.addAnimal(animal);
			}
		} while(typeNumber != 0);
		
		// �Է��� �������� ������ ����Ѵ�.
		zooClass.printAnimalInfo();
		
		
		scanner.close();
	}
}






