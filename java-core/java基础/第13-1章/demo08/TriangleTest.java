package demo08;

import java.util.Scanner;

public class TriangleTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Triangle triangle=new Triangle();
		System.out.print("�������һ���ߵĳ��ȣ�");
		int a=input.nextInt();
		System.out.print("������ڶ����ߵĳ��ȣ�");
		int b=input.nextInt();
		System.out.print("������������ߵĳ��ȣ�");
		int c=input.nextInt();
		triangle.triangle(a, b, c);
	}
}
