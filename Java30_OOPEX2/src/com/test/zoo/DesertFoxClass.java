package com.test.zoo;

public class DesertFoxClass extends AnimalClass{
	
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