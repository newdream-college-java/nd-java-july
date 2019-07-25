package 十三章_1;

import java.util.Scanner;

public class PrintTriangle {

	/**
	 * @param args
	 */
	public static void printTriangle(int raw, char ch) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入行高：");
		int raw = input.nextInt();
		System.out.print("请输入打印的字符：");
		char ch = input.next().charAt(0);
		printTriangle(raw, ch);

	}

}
