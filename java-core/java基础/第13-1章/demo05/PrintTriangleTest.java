package demo05;

import java.util.Scanner;

public class PrintTriangleTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PrintTriangle pt=new PrintTriangle();
		System.out.print("�������иߣ�");
		int row=input.nextInt();
		System.out.print("�������ӡ���ַ���");
		String cj=input.next();
		pt.printTriangle(row, cj);
	}
}
