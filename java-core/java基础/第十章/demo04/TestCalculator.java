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
		System.out.print("�������һ��������");
		calc.num1 = input.nextDouble();
		System.out.print("������ڶ���������");
		calc.num2 = input.nextDouble();
		System.out.println("��ѡ����Ҫ���еĲ�����1����  2����  3����  4������");
		int n = input.nextInt();
		System.out.println(calc.calculator(n));
	}

}
