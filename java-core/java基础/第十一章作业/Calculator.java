package ��11����ҵ;

import java.util.Scanner;

/*1.4���ô���ʵ�ּ�����(Calculator)*/
public class Calculator {
	public double add(double num1,double num2){
			return num1+num2;
	}
	public double minus(double num1,double num2){
		return num1-num2;
	}
	public double multiple(double num1,double num2){
		return num1*num2;
	}
	public double devide(double num1,double num2){
		if (num2==0) {
			System.out.println("����������Ϊ0");
			System.exit(-1);
		}
		return num1/num2;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);		
		System.out.print("�������һ������");
		double d1=input.nextDouble();
		System.out.print("������ڶ�������");
		double d2=input.nextDouble();
		System.out.print("��ѡ����Ĳ�����0.�˳�ϵͳ1.��2.��3.��4��������");
		int n=input.nextInt();
		Calculator cl=new Calculator();
		switch (n) {
		case 0:
			System.out.println("�ɹ��˳�ϵ�y��");
			System.exit(-1);
			break;

		case 1:
			System.out.println("���ӷ����Ϊ��"+cl.add(d1, d2));
			
			break;

		case 2:
	
			System.out.println("���������Ϊ��"+cl.minus(d1, d2));
			break;
	
		case 3:
	
			System.out.println("���˷����Ϊ��"+cl.multiple(d1, d2));
			break;

		case 4:
	
			System.out.println("���������Ϊ��"+cl.devide(d1, d2));
			break;
			
		default:
			System.out.println("ݔ�����`��");
			break;
		}
	}
}
