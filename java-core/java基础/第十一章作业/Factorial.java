package ��11����ҵ;

import java.util.Scanner;

public class Factorial {
	public int factorial(int n){
		if(n<=1){
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner =new Scanner(System.in);
		System.out.print("��������Ҫ��Ľ׳�����");
		int a=inputScanner.nextInt();
		Factorial f=new Factorial();
		System.out.println(a+"�Ľ׳�Ϊ��"+f.factorial(a));
	}

}
