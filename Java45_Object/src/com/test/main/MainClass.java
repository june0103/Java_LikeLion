package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// java.lang ��Ű��
		// �ڹٿ��� �����ϰ� import ���� �ʰ� ����� �� �ִ� ��Ű���̴�.
		// java.lang ��Ű������ �ڹ� ���α׷��� �ۼ��� �� ���� ����ϴ� �͵��� �� �ִ�.

		TestClass4 t4 = new TestClass4();
		TestClass3 t3 = t4;
		TestClass2 t2 = t4;
		TestClass1 t1 = t4;
		Object object = t4;
	}

}

// Java���� Ŭ������ ������ �� ��ӹ޴� �ڵ带 �ۼ����� ������ extends Object�� �߰��ȴٰ� �����ϸ� �ȴ�
class TestClass1 {

}

class TestClass2 extends TestClass1 {

}

class TestClass3 extends TestClass2 {

}

class TestClass4 extends TestClass3 {

}
