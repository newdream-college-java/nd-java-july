package 第11章作业;

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
		System.out.print("请输入你要求的阶乘数：");
		int a=inputScanner.nextInt();
		Factorial f=new Factorial();
		System.out.println(a+"的阶乘为："+f.factorial(a));
	}

}
