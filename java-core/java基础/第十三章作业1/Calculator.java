package ��ʮ������ҵ1;
/*1.7��ģ��һ���򵥵Ĺ����̴��¹������������谴�����µĹ�ʽ���������Ϣ��ÿ�»���
�� �����Ϣ=������*����;�»�����=(������+����Ϣ)/��������*/
import java.util.Scanner;

public class Calculator {
	public double money(double cost,double interestRate) {
		return cost*interestRate;
	}
	public double monthMoney(double cost,double interestRate,int time) {
		return (money(cost, interestRate)+cost)/time;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Calculator calculator=new Calculator();
		System.out.println("��������Ϣ��");
		System.out.print("����������");
		double m1=input.nextDouble();
		System.out.print("���������ʣ�");
		double l=input.nextDouble();
		System.out.print("������������ޣ�");
		int y=input.nextInt();
		System.out.println("����ϢΪ��"+calculator.money(m1, l));
		
		System.out.println("�»�����Ϊ��"+calculator.monthMoney(m1, l,y));
	}

}
