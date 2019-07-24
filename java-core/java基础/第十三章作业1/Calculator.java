package 第十三章作业1;
/*1.7、模拟一个简单的购物商贷月供计算器，假设按照以下的公式计算出总利息和每月还款
金 额。总利息=贷款金额*利率;月还款金额=(贷款金额+总利息)/贷款年限*/
import java.util.Scanner;

public class Calculator {
	public double money(double cost,double interestRate) {
		return cost*interestRate;
	}
	public double monthMoney(double cost,double interestRate,int time) {
		return (money(cost, interestRate)+cost)/time;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Calculator calculator=new Calculator();
		System.out.println("计算总利息：");
		System.out.print("请输入贷款金额：");
		double m1=input.nextDouble();
		System.out.print("请输入利率：");
		double l=input.nextDouble();
		System.out.print("请输入贷款年限：");
		int y=input.nextInt();
		System.out.println("总利息为："+calculator.money(m1, l));
		
		System.out.println("月还款金额为："+calculator.monthMoney(m1, l,y));
	}

}
