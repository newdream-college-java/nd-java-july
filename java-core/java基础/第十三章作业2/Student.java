package ��ʮ������ҵ2;

import java.util.Arrays;

public class Student {
	String name;
	int age;
	String sex;
	//(1)���ҽ��ܵķ�����toString()
	public  String toString() {
		return "������"+name+"\n���䣺"+age+"\n�Ա�"+sex;
	}
	//(2)�õ������ķ�����
	public String getName() {
		return name;
	}
	//(3)���������ķ���
	public String setName(String value) {
		name=value;
		return name;
	}
	//(4)�õ��Ա�ķ���
	public String getSex() {
		return sex;
	}
	//(5)�����Ա�ķ���
	public String setSex(String value) {
		sex=value;
		return sex;
	}
	//(6)����һ�����ε����飬���������������͵ķ���
	public  int  getSum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	//(7)����һ������ n,���� 1*2*3*...*n ���ķ��� (n ��Ҫ��̫��<10)
	public int getFactorial(int n) {
		int sum=1;
		for (int i = 1; i <=n; i++) {
			sum*=i;
		}
		return sum;
	}
	//(8)����һ������ n,�� n �Ƿ�Ϊ�����ķ��������������� true,���򷵻� false
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
	//(10)���������������������Լ���ķ���
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
	//(9)������������,������С�������ķ���
	public int getLCM(int a,int b) {
		return a*b/getGCD(a, b);	
	}
	//(11)����һ������ n,���ص� n ���Ѳ��������� 1,1,2,3,5,... ��:n=4,�򷵻� 3
	public int fib(int n) {
		if (n==1||n==2) {
			return 1;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}
	//(12)��ս��:����һ�����飬������������ķ���
	public int[] sortArray(int[] a) {
		Arrays.sort(a);
		return a;	
	}
	//(13)��ս��:����һֻ��������һֻѼ�ķ��� Ѽ �Լ���Ѽ(��)
	public String Change(String chicken) {
		String duck=chicken;
		return duck;
	}
}
