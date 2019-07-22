package chapter_11;

import java.util.Scanner;

public class Jiechen {
	public int jiechen(int n){
		if(n<=1){
			return 1;
		}else{
			return n*jiechen(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入你要算的数：");
		int a=sc.nextInt();
		Jiechen jiechen1=new Jiechen();
		System.out.println(a+"的阶乘为："+jiechen1.jiechen(a));
		
		
		// TODO Auto-generated method stub

	}

}
