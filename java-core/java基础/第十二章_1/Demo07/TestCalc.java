package chapter12_1;

import java.util.Scanner;

public class TestCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入贷款金额：");
		double a = input.nextDouble();
		System.out.print("请输入利率：");
		double b = input.nextDouble();
		System.out.print("请输入贷款年限：");
		double c = input.nextDouble();
		
		Calc calc = new Calc();
		calc.calcMoney(a, b, c);
	}

}
