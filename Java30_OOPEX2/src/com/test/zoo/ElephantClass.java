package com.test.zoo;

public class ElephantClass extends AnimalClass{
	
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