package chapter12;

import java.util.Scanner;

/*
	模拟一个简单的购物商贷月供计算器，假设按照以下的公式计算出总利息和每月还款
	金 额。总利息=贷款金额*利率;月还款金额=(贷款金额+总利息)/贷款年限
*/

public class Loans {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入贷款金额：");
		double a=input.nextDouble();
		System.out.print("请输入贷款年限：");
		double b=input.nextDouble();
		System.out.print("请输入利率：");
		double c=input.nextDouble();
		Loans loans=new Loans();
		loans.calculator(a, b, c);
	}
	
	public void calculator(double a,double b,double c) {
		double grossinterest=0,money=0;
		grossinterest=a*c;
		money=(a+grossinterest)/b;
		System.out.println("总利息为："+grossinterest);
		System.out.println("每月还款金额为："+money);
	}

}
