/*1.��������С�������� a,b �У����ʵ�� a �� b �����е�ֵ������������ a �� b �е�ֵ��*/
import  java.util.Scanner;
public class ChangeDemo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������a��ֵ��");
		double a=input.nextDouble();
		System.out.print("������b��ֵ��");
		double b=input.nextDouble();
		double temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("������:a="+a+",b="+b);
	}
}