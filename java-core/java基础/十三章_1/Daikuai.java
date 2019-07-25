package 十三章_1;

import java.util.Scanner;

public class Daikuai {
	public static void calculate() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入贷款金额：");
		int a = input.nextInt();
		System.out.print("请输入利率：");
		double b = input.nextDouble();
		System.out.print("请输入贷款年限：");
		double year = input.nextDouble();
		double total = a * b;
		System.out.println("总利息为：" + total);
		System.out.println("月还款金额：" + (a + total) / year);
	}
	public static void main(String[] args) {
		calculate();
	}
}
