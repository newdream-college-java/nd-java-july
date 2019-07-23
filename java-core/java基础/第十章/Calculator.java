package 第十章;

import java.util.Scanner;

public class Calculator {
	public void calc(double a, double b) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入+,-,*,/：");
		char s = input.next().charAt(0);
		switch (s) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;

		default:
			break;
		}
	}

}
