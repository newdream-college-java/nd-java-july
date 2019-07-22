package Jul22;

import java.util.Scanner;

public class TestCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.print("请输入第一个整数：");
		calc.num1 = input.nextDouble();
		System.out.print("请输入第二个整数：");
		calc.num2 = input.nextDouble();
		System.out.println("请选择你要进行的操作：1、加  2、减  3、乘  4、除：");
		int n = input.nextInt();
		System.out.println(calc.calculator(n));
	}

}
