package com.test.main;

public class TestClass7 {

	// ¸â¹öº¯¼ö
	public int memberA = 100;
	int memberB = 200;
	protected int memberC = 300;
	private int memberD = 400;
	
	// ¸â¹ö ¸Þ¼­µå
	public void method1() {
		System.out.println("public method");
	}
	void method2() {
		System.out.println("default method");
	}
	protected void method3() {
		System.out.println("protected method");
	}
	private void method4() {
		System.out.println("private method");
	}
}
