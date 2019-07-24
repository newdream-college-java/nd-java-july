package demo05;

import java.util.Scanner;

public class PrintTriangleTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PrintTriangle pt=new PrintTriangle();
		System.out.print("请输入行高：");
		int row=input.nextInt();
		System.out.print("请输入打印的字符：");
		String cj=input.next();
		pt.printTriangle(row, cj);
	}
}
