package chapter11;

import java.util.Scanner;

public class TestCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入数字并选择将要进行的操作
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double num1 = input.nextDouble();
		System.out.println("请输入第二个数：");
		double num2 = input.nextDouble();
		System.out.println("请输入：1、加  2、减  3、乘  4、除 ");
		int choice = input.nextInt();
		
		Calculator calc = new Calculator();
		//根据不同的输入调用不同的方法
		switch(choice){
		case 1:
			System.out.println("计算结果为："+calc.add(num1, num2));
			break;
		case 2:
			System.out.println("计算结果为："+calc.add(num1, num2));
			break;
		case 3:
			System.out.println("计算结果为："+calc.add(num1, num2));
			break;
		case 4:
			System.out.println("计算结果为："+calc.add(num1, num2));
			break;
		default :
			System.out.println("您的输入有误！！！");
			break;
		}
		
	}

}
