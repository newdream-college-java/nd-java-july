package chapter12_1;

import java.util.Scanner;

public class TestPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Print pri = new Print();
		
		System.out.print("请输入行高：");
		int row = input.nextInt();
		System.out.print("请输入打印字符：");
		String ch = input.next();
		pri.printTriangle(row, ch);
		
	}

}
