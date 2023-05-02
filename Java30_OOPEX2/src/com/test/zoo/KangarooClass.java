package com.test.zoo;

public class KangarooClass extends AnimalClass{
	
	public KangarooClass(String name) {
		this.type = "Ä»°Å·ç";
		this.name = name;
		this.numberLegs = 2;
		this.lengthNose = "Âª´Ù";
		this.bodySize = "Å©´Ù";
	}
	
	@Override
	public void howEat() {
		System.out.println("³ª¹µÀÙÀ» ¶â¾î ¸Ô½À´Ï´Ù");
	}
}