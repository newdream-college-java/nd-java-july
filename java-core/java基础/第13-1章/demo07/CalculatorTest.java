package demo07;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Calculator ca=new Calculator();
		System.out.print("����������");
		double money=input.nextDouble();
		System.out.print("���������ʣ�");
		double interest=input.nextDouble();
		System.out.print("������������ޣ�");
		int year=input.nextInt();
		System.out.println("����ϢΪ��"+ca.zlx(money, interest));
		System.out.println("�»�����Ϊ��"+ca.monthMoney(money, year, interest));
	}
}
