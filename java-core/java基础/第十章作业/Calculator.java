import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int op, num1, num2;

		Calculator cal = new Calculator();

		Scanner inp = new Scanner(System.in);

		System.out.print("��ѡ�����㣺1�ӷ� 2���� 3�˷� 4 ������");

		op = inp.nextInt();

		System.out.print("�������һ������");

		num1 = inp.nextInt();

		System.out.print("������ڶ�������");

		num2 = inp.nextInt();

		System.out.println("������Ϊ:" + cal.ope(op, num1, num2));

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