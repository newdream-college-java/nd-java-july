package demo09;

import java.util.Scanner;

public class FactorialTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Factorial factorial=new Factorial();
		System.out.print("请输入一个整数n：");
		int n =input.nextInt();
		System.out.println("n!的值为:"+factorial.jiechen(n));
	}
}
