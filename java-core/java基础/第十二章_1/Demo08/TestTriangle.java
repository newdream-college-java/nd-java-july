package chapter12_1;

import java.util.Scanner;

public class TestTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一边：");
		double a = input.nextDouble();
		System.out.println("请输入第二边：");
		double b = input.nextDouble();
		System.out.println("请输入第三边：");
		double c = input.nextDouble();
		
		Triangle tag = new Triangle();
		tag.judge(a, b, c);

}}
