package com.test.zoo;

public class KangarooClass extends AnimalClass{
	
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