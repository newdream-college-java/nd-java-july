package chapter13;

import java.util.Scanner;

/*
 写一个学生类，有属性:姓名，年龄，性别,类中有方法：
 (1)自我介绍的方法。toString()
 (2)得到姓名的方法。
 (3)设置姓名的方法
 (4)得到性别的方法
 (5)设置性别的方法
 (6)传入一个整形的数组，返回这个整形数组和的方法
 (7)传入一个整数 n,返回 1*2*3*...*n 积的方法 (n 不要输太大<10)
 (8)传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回 false
 (9)传入两个整数,返回最小公倍数的方法
 (10)传入两个整数，返回最大公约数的方法
 (11)传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
 (12)挑战题:传入一个数组，返回有序数组的方法
 (13)挑战题:传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)
 */
public class Students {
	String 姓名;
	int 年龄;
	String 性别;
	
	public static void main(String[] args) {
		Students student=new Students();
		System.out.println(student.fblq(5));
	}

	@Override
	// 自我介绍的方法。toString()
	public String toString() {
		return "Students [姓名=" + 姓名 + ", 年龄=" + 年龄 + ", 性别=" + 性别 + "]";
	}

	// 得到姓名的方法。
	public String name() {
		return 姓名;
	}

	// 设置姓名的方法
	public String upName() {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		姓名 = a;
		return 姓名;
	}

	// 得到性别的方法
	public String sex() {
		return 性别;
	}

	// 设置性别的方法
	public String upSex() {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		性别 = a;
		return 性别;
	}

	// 传入一个整形的数组，返回这个整形数组和的方法
	public int addnum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	// 传入一个整数 n,返回 1*2*3*...*n 积的方法 (n 不要输太大<10)
	public int product(int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}

	// 传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回 false
	public boolean isSingle(int n) {
		boolean flag = false;
		if (n < 2) {
			flag = true;
		}
		// 因为要判断的数的最小公因子小于等于该数的平方根
		for (int i = 2; Math.sqrt(n) >= i; i++) {
			if (n % i == 0) {
				flag = true;
			}
		}
		return flag;
	}

	// 传入两个整数,返回最小公倍数的方法
	public int LCM(int a, int b) {
		int num = 0;
		int max, min;
		max = a > b ? a : b;
		min = a < b ? a : b;
		for (int i = 2; i <= min; i++) // 循环出两个数最大的公因子
		{
			if ((max % i == 0) && (min % i == 0)) {
				num = i;
			}
		}
		num = min * max / num;
		return num;
	}
	//传入两个整数，返回最大公约数的方法
	public int gcd(int a,int b) {
		int num = 0;
		int max, min;
		max = a > b ? a : b;
		min = a < b ? a : b;
		for (int i = 2; i <= min; i++) // 循环出两个数最大的公因子
		{
			if ((max % i == 0) && (min % i == 0)) {
				num = i;
			}
		}
		return num;
	}
	//传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
	public int fblq(int n) {
		if(n<=2){
			return 1;
		}else
			return fblq(n-1)+fblq(n-2);
	}
	//挑战题:传入一个数组，返回有序数组的方法
	public void sort (int[] a) {
		int temp=0;
		for (int i = 1; i <= a.length; i++) {
			for (int j = 0; j < a.length-i; j++) {
				if(a[i]>a[i+1]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}
	//挑战题:传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)
	public String jiya(String n) {
		if(n.equals("鸡")){
			n="鸭";
		}else if(n.equals("鸭")){
			n="鸡";
		}else {
			System.out.println("输入错误！！");
			System.exit(-1);
		}
		return n;
	}
}
