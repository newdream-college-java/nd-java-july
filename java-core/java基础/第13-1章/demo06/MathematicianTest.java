package demo06;

import java.util.Scanner;

public class MathematicianTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Mathematician mm=new Mathematician();
		System.out.print("�������һ������");
		int a=input.nextInt();
		System.out.print("������ڶ�������");
		int b=input.nextInt();
		System.out.println(mm.max(a, b));
		System.out.println(mm.gws(a));
		System.out.println(mm.lifang(a));
		System.out.println(mm.add(a));
	}
}
