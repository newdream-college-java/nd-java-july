package job02.text6;

import java.util.Scanner;

public class Student {
	static String name;
	int age;
	static String sex;
	Scanner scanner=new Scanner(System.in);
	/**
	 *1.自我介绍
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名："+name+"\t年龄："+age+"\t性别："+sex;
	}
	
	/**
	 *2.得到姓名 
	 */
	public String getName() {
		return name;
	}
	
	/** 
	 *3.设置姓名
	 */
	public String settingName() {
		System.out.print("设置你的姓名：");
		name=scanner.next();
		return name;
	}
	
	/** 
	 *4.得到性别 
	 */
	public String getSex() {
		return sex;
	}
	
	/** 
	 *5.设置性别 
	 */
	public String settingSex() {
		System.out.print("设置你的性别：");
		sex=scanner.next();
		return sex;
	}
	
	/** 
	 *6.传入一个整型的数组，返回这个整型数组和的方法 
	 */
	public int sumArr(int[]arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

	/** 
	 *7.传入一个整数 n,返回 1*2*3*...*n 积的方法
	 */
	public int numJi(int n) {
		int a = 0;
		if(n==1) {
			a=1;
		}else if (n > 1) {
			a = n * numJi(n - 1);
		}else {
			System.out.println("输入错误！");
		}
		return a;
	}
	
	/** 
	 *8.传入一个整数 n,判 n 是否为质数的方法，是质数返回 true,否则返回 false
	 */
	public boolean isZhi(int n) {
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
			}
		}
		return flag;
	}
	
	/** 
	 *9.传入两个整数,返回最小公倍数的方法
	 */
	public int minGbs(int a,int b) {
		int gbs=0;
		int max=a>b?a:b;
		for(int i=max;i<=a*b;i++) {
			if(i%a==0&&i%b==0) {
				gbs=i;
				break;
			}
		}
		return gbs;
	}
	
	/** 
	 *10.传入两个整数,返回最大公约数的方法
	 */
	public int maxGys(int a,int b) {
		int gys=0;
		int min=a<b?a:b;
		for(int i=min;i>0;i--) {
			if(a%i==0&&b%i==0) {
				gys=i;
				break;
			}
		}
		return gys;
	}
	
	/** 
	 *11.传入一个整数 n,返回第 n 个费波拉切数字 1,1,2,3,5,... 如:n=4,则返回 3
	 */
	public int fib(int n) {
		int sum=0;
		if(n==1||n==2) {
			sum=1;
		}else {
			sum=fib(n-1)+fib(n-2);
		}
		return sum;
	}
	
	/** 
	 *12.传入一个数组，返回有序数组的方法
	 */
	public String[] sortArr(String[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				int re=arr[j].compareTo(arr[j+1]);
				if(re>0) {
					String tempString=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tempString;
					continue;
				}
			}
		}
		return arr;
	}
	
	/** 
	 *13.传入一只鸡，返回一只鸭的方法
	 */
	public String getAnimal(String ani) {
		if(ani.equals("鸡")) {
			ani= "鸭";
		}else if(ani.equals("鸭")) {
			ani="鸡";
		}
		else {
			ani="输入错误，只能输入鸡或者鸭！";
		}
		return ani;
	}
}
