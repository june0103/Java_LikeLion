
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���������
		// ��Ģ����� �������� ���Ѵ�
		// ���ϱ�
		int a1 = 10 + 3;
		// ����
		int a2 = 10 - 3;
		// ���ϱ�
		int a3 = 10 * 3;
		// ������
		int a4 = 10 / 3;
		double a5 = 10.0 / 3.0;
		double a6 = 10 / 3.0;
		double a7 = 10.0 / 3;
		// ������
		int a8 = 10 % 3;

		System.out.printf("a1 : %d\n", a1);
		System.out.printf("a2 : %d\n", a2);
		System.out.printf("a3 : %d\n", a3);
		System.out.printf("a4 : %d\n", a4);
		System.out.printf("a5 : %f\n", a5);
		System.out.printf("a6 : %f\n", a6);
		System.out.printf("a7 : %f\n", a7);
		System.out.printf("a8 : %d\n", a8);
		System.out.println("=========================");

		// �ֿ켱������
		// () : ���а� ���� ���� ���� ����� �� �κ� ����
		int b1 = 10 + 2 * 4;
		int b2 = (10 + 2) * 4;

		System.out.printf("b1 : %d\n", b1);
		System.out.printf("b2 : %d\n", b2);
		System.out.println("=========================");

		// ���� ������
		// ! : true�� false�� false�� true�� �ٲ��ش�.
		boolean c1 = true;
		boolean c2 = !c1;
		boolean c3 = !c2;

		System.out.printf("c1 : %s\n", c1);
		System.out.printf("c2 : %s\n", c2);
		System.out.printf("c3 : %s\n", c3);
		System.out.println("=========================");

		// ~ : ��Ʈ 0�� 1��, ��Ʈ 1�� 0���� ��ȯ���ش�.
		int d1 = 100;
		System.out.printf("%32s\n", Integer.toBinaryString(d1));

		int d2 = ~d1;
		System.out.printf("%32s\n", Integer.toBinaryString(d2));

		int d3 = ~d1 + 1;
		System.out.println(d3);
		System.out.println("=========================");

		// ��ȣ ������
		// + : �״��, - : ����� ������, ������ �����
		int e1 = 100;
		int e2 = +e1;
		int e3 = -e1;

		System.out.printf("e1 : %d\n", e1);
		System.out.printf("e2 : %d\n", e2);
		System.out.printf("e3 : %d\n", e3);
		System.out.println("=========================");

		// ���� ������
		// ������ ���� �����Ͽ� ���� Ȥ�� ���� ��Ű�� �ٽ� ������ �����Ѵ�.
		int f1 = 100;
		int f2 = 100;

		f1 = f1 + 1;
		++f2;

		System.out.printf("f1 : %d\n", f1);
		System.out.printf("f2 : %d\n", f2);

		f1 = f1 - 1;
		--f2;
		System.out.printf("f1 : %d\n", f1);
		System.out.printf("f2 : %d\n", f2);
		System.out.println("=========================");

		// ����Ʈ ������
		// >> ��Ʈ�� ���������� ������ ��ŭ �̵��Ѵ�.
		// << ��Ʈ�� �������� ������ ��ŭ �̵��Ѵ�.
		// >>> ��Ʈ�� ���������� ������ ��ŭ �̵��Ѵ�. 0���� ä���ش�.

		int g1 = 100;
		System.out.printf("%32s\n", Integer.toBinaryString(g1));

		int g2 = g1 >> 1;
		int g3 = g1 >> 2;
		System.out.printf("%32s\n", Integer.toBinaryString(g2));
		System.out.printf("%32s\n", Integer.toBinaryString(g3));

		int g4 = g1 << 1;
		int g5 = g1 << 2;
		System.out.printf("%32s\n", Integer.toBinaryString(g4));
		System.out.printf("%32s\n", Integer.toBinaryString(g5));

		System.out.printf("g1 : %d\n", g1);
		System.out.printf("g1 >> 1 : %d\n", g1 >> 1);
		System.out.printf("g1 >> 2 : %d\n", g1 >> 2);
		System.out.printf("g1 << 1 : %d\n", g1 << 1);
		System.out.printf("g1 << 2 : %d\n", g1 << 2);
		System.out.println("=========================");

		// �񱳿�����
		// ������ ���� �����ʿ� ���� �����
		int h1 = 100;

		System.out.printf("h1 > 50 : %s\n", h1 > 50);
		System.out.printf("h1 > 200 : %s\n", h1 > 200);
		System.out.printf("h1 < 200 : %s\n", h1 < 200);
		System.out.printf("h1 < 50 : %s\n", h1 < 50);
		System.out.printf("h1 >= 50 : %s\n", h1 >= 50);
		System.out.printf("h1 >= 100 : %s\n", h1 >= 100);
		System.out.printf("h1 >= 200 : %s\n", h1 >= 200);
		System.out.printf("h1 <= 200 : %s\n", h1 <= 200);
		System.out.printf("h1 <= 100 : %s\n", h1 <= 100);
		System.out.printf("h1 <= 50 : %s\n", h1 <= 50);
		System.out.printf("h1 == 100 : %s\n", h1 == 100);
		System.out.printf("h1 == 50 : %s\n", h1 == 50);
		System.out.printf("h1 != 50 : %s\n", h1 != 50);
		System.out.printf("h1 != 100 : %s\n", h1 != 100);
		System.out.println("=========================");

		// �� ������
		// ������ �¿����� �񱳿����� ������ ����� ������ ������ �ϴ� ������
		boolean i1 = 10 > 2; // true
		boolean i2 = 10 < 20; // true
		boolean i3 = 10 > 20; // false
		boolean i4 = 10 > 30; // false

		// && (and)
		// �� �� true�������� ����� true�� �� �� �ϳ��� false��
		// ����� false�̴�.
		boolean i5 = i1 && i2;
		boolean i6 = i1 && i3;
		boolean i7 = i3 && i1;
		boolean i8 = i3 && i4;

		System.out.printf("%s && %s : %s\n", i1, i2, i5);
		System.out.printf("%s && %s : %s\n", i1, i3, i6);
		System.out.printf("%s && %s : %s\n", i3, i1, i7);
		System.out.printf("%s && %s : %s\n", i3, i4, i8);

		// || : �� �� false �������� false�̰� �� �� �ϳ���
		// true��� ����� true�̴�.
		boolean i9 = i1 || i2;
		boolean i10 = i1 || i3;
		boolean i11 = i3 || i1;
		boolean i12 = i3 || i4;

		System.out.printf("%s || %s : %s\n", i1, i2, i9);
		System.out.printf("%s || %s : %s\n", i1, i3, i10);
		System.out.printf("%s || %s : %s\n", i3, i1, i11);
		System.out.printf("%s || %s : %s\n", i3, i4, i12);
		System.out.println("=========================");

		// 3�� ������
		// �־��� �� ������ ����� true �� ��1�� ������ ����� �ǰ�
		// false�� ��2�� ������ ����� �ȴ�.
		// �񱳿���� ? ��1 : ��2
		int j1 = 100;

		boolean j2 = j1 < 200 ? true : false;
		boolean j3 = j1 > 200 ? true : false;

		System.out.printf("j2 : %s\n", j2);
		System.out.printf("j3 : %s\n", j3);
		System.out.println("=========================");

		// ���� ������
		// ������ ���� ������ ������ �����Ѵ�.
		int k1 = 100;
		System.out.printf("k1 : %d\n", k1);

		// �ٸ� �����ڿ� ���� ����ϴ� ���Կ�����
		int k2 = 100;
		int k3 = 100;

		k2 = k2 + 10;
		k3 += 10;

		System.out.printf("k2 : %d\n", k2);
		System.out.printf("k3 : %d\n", k3);

		k2 = k2 - 10;
		k3 -= 10;

		System.out.printf("k2 : %d\n", k2);
		System.out.printf("k3 : %d\n", k3);
		System.out.println("=========================");

		// ����������
		int l1 = 100;
		int l2 = 100;

		++l1;
		l2++;

		System.out.printf("l1 : %d\n", l1);
		System.out.printf("l2 : %d\n", l2);

		--l1;
		l2--;

		System.out.printf("l1 : %d\n", l1);
		System.out.printf("l2 : %d\n", l2);

		// �ٸ� �����ڿ� ���������� �켱������ �޶�����
		// ++�� �տ������� �ڱ��ڽ��� ������ �켱��������, �ڿ������� �տ��ִ� ������� ����
		int l3 = ++l1;
		int l4 = l2++;

		System.out.printf("l1 : %d, l3 : %d\n", l1, l3);
		System.out.printf("l2 : %d, l4 : %d\n", l2, l4);

	}

}
