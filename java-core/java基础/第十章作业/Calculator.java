import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int op, num1, num2;

		Calculator cal = new Calculator();

		Scanner inp = new Scanner(System.in);

		System.out.print("请选择运算：1加法 2减法 3乘法 4 除法：");

		op = inp.nextInt();

		System.out.print("请输入第一个数：");

		num1 = inp.nextInt();

		System.out.print("请输入第二个数：");

		num2 = inp.nextInt();

		System.out.println("运算结果为:" + cal.ope(op, num1, num2));

	}

	public int ope(int op, int num1, int num2) {

		if (op == 1) {

			return num1 + num2;

		}

		else if (op == 2) {

			return num1 - num2;

		}

		else if (op == 3) {

			return num1 * num2;

		}

		else if (op == 4) {

			return num1 / num2;

		}

		return -1;

	}

}