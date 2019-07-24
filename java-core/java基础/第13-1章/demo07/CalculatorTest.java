package demo07;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Calculator ca=new Calculator();
		System.out.print("请输入贷款金额：");
		double money=input.nextDouble();
		System.out.print("请输入利率：");
		double interest=input.nextDouble();
		System.out.print("请输入贷款年限：");
		int year=input.nextInt();
		System.out.println("总利息为："+ca.zlx(money, interest));
		System.out.println("月还款金额为："+ca.monthMoney(money, year, interest));
	}
}
