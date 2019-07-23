package chapter12;

import java.util.Scanner;

/*
	根据指定不同的行和字符，生成不同的三角形
*/

public class Triangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入行高:");
		int num=input.nextInt();
		System.out.print("请输入打印的字符：");
		String symbol=input.next();
		
		Triangle triangle=new Triangle();
		triangle.print(num, symbol);
	}
	public void print(int num,String symbol) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}

}
