package work;

import java.util.Arrays;

/**
 * 1.5��дһ��ѧ���࣬������:���������䣬�Ա�,�����з����� 
 * (1)���ҽ��ܵķ�����toString() 
 * ( 2)�õ������ķ����� 
 * (3)���������ķ���
 * (4)�õ��Ա�ķ��� 
 * (5)�����Ա�ķ��� 
 * (6)����һ�����ε����飬���������������͵ķ��� 
 * (7)����һ������ n,����1*2*3*...*n���ķ��� (n ��Ҫ��̫��<10) 
 * (8)����һ������ n,�� n �Ƿ�Ϊ�����ķ��������������� true,���򷵻�false
 * (9)������������,������С�������ķ��� 
 * (10)���������������������Լ���ķ��� 
 * (11)����һ������ n,���ص� n���Ѳ���������1,1,2,3,5,... ��:n=4,�򷵻� 3 
 * (12)��ս��:����һ�����飬������������ķ��� 
 * (13)��ս��:����һֻ��������һֻѼ�ķ��� Ѽ�Լ���Ѽ(��)
 */

public class Students {
	String name = "������";
	int age = 21;
	String sex = "��";

	public String toString() {
		return name + "\t" + age + "\t" + sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String names) {
		name = names;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sexs) {
		sex = sexs;
	}

	public int getSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public int getMulti(int a) {
		int sum = 1;
		for (int i = 1; i <= a; i++) {
			sum *= i;
		}
		return sum;
	}

	public boolean zhishu(int n) {
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

	public int name(int a, int b) { // ��С������
		int max = a > b ? a : b;
		int p = 0;
		for (int i = max; i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				p = i;
				break;
			}
		}
		return p;
	}

	public int name2(int a, int b) { // ���Լ�� �������ĳ˻������������������Լ������С�������ĳ˻�
		int p = 0;
		p = a * b / name(a, b);
		return p;
	}

	public int fblq(int n) {		//���n��쳲�������
		int f = 0;

		if (n == 2 || n == 1) {
			return 1;
		} else {
			f = fblq(n - 1) + fblq(n - 2);
		}

		return f;
	}
	public int[] arrarSort(int[] a) {
		 Arrays.sort(a);
		return a ;
	}
	public String getDuck(String Chicken) {
		if (Chicken.equals("��")) {
			return "Ѽ";
		}else {
			return "û�м���";
		}
	}
	public static void main(String[] args) {
		Students stu = new Students();
		System.out.println(stu.toString());
		stu.setName("����");
		System.out.println(stu.getName());
		stu.setSex("Ů");
		System.out.println(stu.getSex());
		int[] a = {2,6,4,89,6,2,7,9,1,11};
		System.out.println(stu.getSum(a));
		System.out.println(stu.getMulti(4));
		System.out.println(stu.zhishu(11));
		System.out.println(stu.name(4,6));
		System.out.println(stu.name2(4, 6));
		System.out.println(stu.fblq(6));
		stu.arrarSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.println(stu.getDuck("��"));
	}

}
