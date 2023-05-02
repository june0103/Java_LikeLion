package com.test.main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ĸ��ȭ
		// ������ ���� ���� ������ �������ν� �������� ���Ἲ�� ������ �� �ֵ��� �����ϴ� ����� �ǹ�
		// ������ ���� ������ ���� ���� private ���� �����ڸ� �����ش�.
		// ������ ���� �����ϴ� ���� ��ü ������ �� �ѹ��� ����ϰڴٸ� �����ڸ� ���� �� �� �ֵ��� �����Ѵ�
		// ������ ���� �����ϴ� ���� ���ϴ� ��ŭ �� �� �ֵ��� �ϰ� ���ְڴٸ� setter�� ����� �����Ѵ�.
		// ������ ���� ������ ����� �� �ִ� ���� �� �� �ֵ��� �ϰ� ���ְڴٸ� getter�� ����� �����Ѵ�.
		// setter�� �̸����� ��Ģ : set������
		// getter�� �̸����� ��Ģ : get������, is������(boolean)

		TestClass1 t1 = new TestClass1(200);
		t1.printValue();

		t1.setMemberC(300);
		System.out.printf("t1 memberC : %d\n", t1.getMemberC());

		t1.setMemberC(-200);
		System.out.printf("t1 memberC : %d\n", t1.getMemberC());
	}

}

class TestClass1 {
	// �������� ��� private�� �����Ѵ�.
	private int memberA = 100;
	private int memberB;
	private int memberC;

	// ���� ������ ���� ��ü ������ �� �ѹ��� ������ �� �ֵ��� �ϰڴٸ� �����ڸ� ���� ó���Ѵ�.
	public TestClass1(int memberB) {
		this.memberB = memberB;
	}

	public void printValue() {
		System.out.printf("memberA : %d\n", memberA);
		System.out.printf("memberB : %d\n", memberB);
	}

	// memberC�� ���� setter
	public void setMemberC(int memberC) {
		// �� ���忡 ���� ������ �ִٸ� if������ �������ش�.
		if (memberC > 0) {
			this.memberC = memberC;
		}

	}

	// memberC�� ���� getter
	public int getMemberC() {
		return this.memberC;
	}
}

// setter getter �ڵ� �ϼ�
// ��Ŭ�������� source > generate getters and setters
class TestClass2 {
	private int memberA;
	private double memberB;
	private boolean memberC;
	private String memberD;

	public int getMemberA() {
		return memberA;
	}

	public void setMemberA(int memberA) {
		this.memberA = memberA;
	}

	public double getMemberB() {
		return memberB;
	}

	public void setMemberB(double memberB) {
		this.memberB = memberB;
	}

	public boolean isMemberC() {
		return memberC;
	}

	public void setMemberC(boolean memberC) {
		this.memberC = memberC;
	}

	public String getMemberD() {
		return memberD;
	}

	public void setMemberD(String memberD) {
		this.memberD = memberD;
	}

}
