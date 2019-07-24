/*1.4、用代码实现计算器(Calculator)*/
package demo04;

import java.util.Scanner;

public class Caculator {
	Scanner input=new Scanner(System.in);
	double num1;
	double num2;

	public void add() {
		System.out.print("请输入第一个运算数：");
		num1=input.nextDouble();
		System.out.print("请输入第二个运算数：");
		num2=input.nextDouble();
		System.out.println(num1+num2);
	}

	public void minus() {
		System.out.print("请输入第一个运算数：");
		num1=input.nextDouble();
		System.out.print("请输入第二个运算数：");
		num2=input.nextDouble();
		System.out.println(num1-num2);
	}

	public void multipele() {
		System.out.print("请输入第一个运算数：");
		num1=input.nextDouble();
		System.out.print("请输入第二个运算数：");
		num2=input.nextDouble();
		System.out.println(num1*num2);
	}
	public void divide() {
		System.out.print("请输入第一个运算数：");
		num1=input.nextDouble();
		System.out.print("请输入第二个运算数：");
		num2=input.nextDouble();
		System.out.println(num1/num2);
	}
}