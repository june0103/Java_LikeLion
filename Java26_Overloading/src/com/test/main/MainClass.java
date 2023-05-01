package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Overloading
		// �޼ҵ尡 �����ڸ� �ۼ��� �� �Ű������� ���¸� �ٸ����Ͽ� ���� �̸����� �������� ���� �� �ֵ��� �����Ǵ� ����

		TestClass1 t1 = new TestClass1();
		TestClass1 t2 = new TestClass1(1);
		TestClass1 t3 = new TestClass1(1, 2);

		t1.printMember();
		t2.printMember();
		t3.printMember();

		int r1 = t1.add(100, 200);
		long r2 = t1.add(100L, 200L);
		double r3 = t1.add(11.11, 22.22);

		System.out.printf("r1 : %d\n", r1);
		System.out.printf("r2 : %d\n", r2);
		System.out.printf("r3 : %f\n", r3);
		
		int r4 = t1.add2(1,2,3,4,5,6,7);
		int r5 = t1.add2(9,5,3,6,4,5,3,7,9);
		
		System.out.printf("r4 : %d\n", r4);
		System.out.printf("r5 : %d\n", r5);
	}

}

class TestClass1 {

	int memberA;
	int memberB;

	// ������ Overloading
	// �����ڿ��� �ٸ� �����ڸ� ȣ���� ���� this()�� ����Ѵ�
	// ������ ������ ù ��° �ڵ忩�� �Ѵ�.
	public TestClass1() {
		this(100, 200);
//		this.memberA = 100;
//		this.memberB = 200;
	}

	public TestClass1(int memberA) {
		this(memberA, 200);
//		this.memberA = memberA;
//		this.memberB = 200;
	}

	public TestClass1(int memberA, int memberB) {
		this.memberA = memberA;
		this.memberB = memberB;
	}

	public void printMember() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
	}

	// �޼��嵵 �̸��� �����ϰ��ϰ� �Ű������� ���¸� �ٸ����Ͽ� �޼��带 ������ ����� �ִ�.
	public int add(int a1, int a2) {
		return a1 + a2;
	}

	public long add(long a1, long a2) {
		return a1 + a2;
	}

	public double add(double a1, double a2) {
		return a1 + a2;
	}

	// ������ �Ű�����
	// Ÿ���� ���� �Ű������� ������ �ִ� �޼��带 ������ ����� ���� ������ �����Ǵ� ����
	// �Ű� ������ �ۼ��� �� ... �� �����ָ� ���� �Ǵ� ������ �迭�� ����� ����� �� �ִ�.
	
	public int add2(int ... a1) {
		int total = 0;
		
		for(int value : a1) {
			total= total + value;
		}
		
		return total;
	}
	
}