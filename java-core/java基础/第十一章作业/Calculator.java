import java.util.Scanner;


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
	public double divide(double num1,double num2){
		if(num2==0){
			System.out.print("��������Ϊ0");
		}
		return num1/num2;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		double a=sc.nextDouble();
		System.out.println("������ڶ�������");
		double b=sc.nextDouble();
		System.out.println("����1ѡ��ӷ���2Ϊ������3Ϊ�˷���4Ϊ����");
		int num=sc.nextInt();
		switch(num){
		case 1:
			System.out.println(c.add(a,b));
			break;
		case 2:
			System.out.println(c.minus(a,b));
			break;
		case 3:
			System.out.println(c.multiple(a,b));
			break;
		case 4:
			System.out.println(c.divide(a,b));
			break;
		}
	}
}
