package demo08;

import java.util.Scanner;

public class TriangleTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Triangle triangle=new Triangle();
		System.out.print("请输入第一条边的长度：");
		int a=input.nextInt();
		System.out.print("请输入第二条边的长度：");
		int b=input.nextInt();
		System.out.print("请输入第三条边的长度：");
		int c=input.nextInt();
		triangle.triangle(a, b, c);
	}
}
