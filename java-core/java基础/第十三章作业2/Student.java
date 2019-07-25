package 第十三章作业2;

import java.util.Arrays;

public class Student {
	String name;
	int age;
	String sex;
	//(1)自我介绍的方法。toString()
	public  String toString() {
		return "姓名："+name+"\n年龄："+age+"\n性别："+sex;
	}
	//(2)得到姓名的方法。
	public String getName() {
		return name;
	}
	//(3)设置姓名的方法
	public String setName(String value) {
		name=value;
		return name;
	}
	//(4)得到性别的方法
	public String getSex() {
		return sex;
	}
	//(5)设置性别的方法
	public String setSex(String value) {
		sex=value;
		return sex;
	}
	//(6)传入一个整形的数组，返回这个整形数组和的方法
	public  int  getSum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	//(7)传入一个整数 n,返回 1*2*3*...*n 积的方法 (n 不要输太大<10)
	public int getFactorial(int n) {
		int sum=1;
		for (int i = 1; i <=n; i++) {
			sum*=i;
		}
		return sum;
	}
	//(8)传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回 false
	public boolean getPrimeNumber(int n) {
		boolean flag=false;
		if (n==1||n==2) {
			flag=true;
		}
		for (int i = 2; i <=(int)(Math.sqrt(n)); i++) {
			if (n%i!=0) {
				flag=true;
			}
		}
		return flag;
	}
	//(10)传入两个整数，返回最大公约数的方法
	public int getGCD(int a,int b) {
		int max,min,gcd=0;
		max=a>b?a:b;
		min=a>b?b:a;
		for (int i = 2; i < min; i++) {
			if (max%i==0&&min%i==0) {
				gcd= i;
			}
		}
		return gcd;
	}
	//(9)传入两个整数,返回最小公倍数的方法
	public int getLCM(int a,int b) {
		return a*b/getGCD(a, b);	
	}
	//(11)传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
	public int fib(int n) {
		if (n==1||n==2) {
			return 1;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}
	//(12)挑战题:传入一个数组，返回有序数组的方法
	public int[] sortArray(int[] a) {
		Arrays.sort(a);
		return a;	
	}
	//(13)挑战题:传入一只鸡，返回一只鸭的方法 鸭 以鸡换鸭(鸡)
	public String Change(String chicken) {
		String duck=chicken;
		return duck;
	}
}
