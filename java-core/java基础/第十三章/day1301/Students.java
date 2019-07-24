package work;

import java.util.Arrays;

/**
 * 1.5、写一个学生类，有属性:姓名，年龄，性别,类中有方法： 
 * (1)自我介绍的方法。toString() 
 * ( 2)得到姓名的方法。 
 * (3)设置姓名的方法
 * (4)得到性别的方法 
 * (5)设置性别的方法 
 * (6)传入一个整形的数组，返回这个整形数组和的方法 
 * (7)传入一个整数 n,返回1*2*3*...*n积的方法 (n 不要输太大<10) 
 * (8)传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回false
 * (9)传入两个整数,返回最小公倍数的方法 
 * (10)传入两个整数，返回最大公约数的方法 
 * (11)传入一个整数 n,返回第 n个费波拉切数字1,1,2,3,5,... 如:n=4,则返回 3 
 * (12)挑战题:传入一个数组，返回有序数组的方法 
 * (13)挑战题:传入一只鸡，返回一只鸭的方法 鸭以鸡换鸭(鸡)
 */

public class Students {
	String name = "二狗子";
	int age = 21;
	String sex = "男";

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

	public int name(int a, int b) { // 最小公倍数
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

	public int name2(int a, int b) { // 最大公约数 两个数的乘积等于这两个数的最大公约数与最小公倍数的乘积
		int p = 0;
		p = a * b / name(a, b);
		return p;
	}

	public int fblq(int n) {		//求第n个斐波拉切数
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
		if (Chicken.equals("鸡")) {
			return "鸭";
		}else {
			return "没有鸡！";
		}
	}
	public static void main(String[] args) {
		Students stu = new Students();
		System.out.println(stu.toString());
		stu.setName("大狗子");
		System.out.println(stu.getName());
		stu.setSex("女");
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
		System.out.println(stu.getDuck("鸡"));
	}

}
