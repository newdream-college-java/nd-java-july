package ��ʮ������ҵ1;

import java.util.Scanner;

public class JudgeTri {

	public void jTriangle(double a,double b,double c){
		if (a+b>c||a+c>b||b+c>a) {
			if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a) {
				System.out.println("����ֱ�������Ρ�");
			}else if (a*a>=b*b+c*c||b*b>=a*a+c*c||c*c>=b*b+a*a) {
				System.out.println("���Ƕ۽������Ρ�");
			}else {
				System.out.println("������������Ρ�");
			}
		}else {			
			System.out.println("�ⲻ�ܹ��������Ρ�");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner=new Scanner(System.in);
		JudgeTri jt=new JudgeTri();
		while (true) {
			System.out.print("�������һ���ߣ�");
			double a=inputScanner.nextDouble();
			System.out.print("�������һ���ߣ�");
			double b=inputScanner.nextDouble();
			System.out.print("�������һ���ߣ�");
			double c=inputScanner.nextDouble();
			jt.jTriangle(a, b, c);
			System.out.print("�����𣿣�y/n��:");
			String n=inputScanner.next();
			if (n.equals("n")) {
				System.out.println("ллʹ�á�");
				System.exit(-1);	
			}
		}
	}

}
