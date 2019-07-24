package 第10章作业;

/*
 使用面向对象的思想编写一个计算器类(Calculator),可以实现两个整数的加、
 减、乘、除 运算。
 */
import java.util.*;



public class Calculator {
	static int a;
	static int b;
	static double sum;

	public int add() {
		return a + b;
	}

	public int subtract() {
		return a - b;
	}

	public int multiply() {
		return a * b;
	}

	public double divide() {
		return a / b;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		a = input.nextInt();
		System.out.print("请输入第二个数：");
		b = input.nextInt();
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