/*1.4���ô���ʵ�ּ�����(Calculator)*/
package demo04;

import java.util.Scanner;

public class Caculator {
	Scanner input=new Scanner(System.in);
	double num1;
	double num2;

	public void add() {
		System.out.print("�������һ����������");
		num1=input.nextDouble();
		System.out.print("������ڶ�����������");
		num2=input.nextDouble();
		System.out.println(num1+num2);
	}

	public void minus() {
		System.out.print("�������һ����������");
		num1=input.nextDouble();
		System.out.print("������ڶ�����������");
		num2=input.nextDouble();
		System.out.println(num1-num2);
	}

	public void multipele() {
		System.out.print("�������һ����������");
		num1=input.nextDouble();
		System.out.print("������ڶ�����������");
		num2=input.nextDouble();
		System.out.println(num1*num2);
	}
	public void divide() {
		System.out.print("�������һ����������");
		num1=input.nextDouble();
		System.out.print("������ڶ�����������");
		num2=input.nextDouble();
		System.out.println(num1/num2);
	}
}