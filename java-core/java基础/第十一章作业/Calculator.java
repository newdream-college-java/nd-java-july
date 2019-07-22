package Chapter11_类的无参方法;

/*
 用代码实现计算器
 */

import java.util.*;

public class Calculator {
	static int num1;
	static int num2;
	static double sum;

	public int add() {
		return num1 + num2;
	}

	public int subtract() {
		return num1 - num2;
	}

	public int multiply() {
		return num1 * num2;
	}

	public double divide() {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		num1 = input.nextInt();
		System.out.print("请输入第二个数：");
		num2 = input.nextInt();
		System.out.println("请选择运算符：1.+\t2.-\t3.*\t4./");
		int c = input.nextInt();
		switch (c) {
		case 1:
			sum = calculator.add();
			break;
		case 2:
			sum = calculator.subtract();
			break;
		case 3:
			sum = calculator.multiply();
			break;
		case 4:
			sum = calculator.divide();
			break;
		default:
			System.out.println("输入有误！！！");
			break;
		}
		System.out.println("结果为：" + sum);
	}
}
