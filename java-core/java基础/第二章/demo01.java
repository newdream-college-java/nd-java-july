/*1����������С�������� a,b �У����ʵ�� a �� b �����е�ֵ������
 ������ a �� b �е�ֵ��*/
import java.util.Scanner;
public class demo01{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("������a��ֵ��");
		double a = input.nextDouble();
		System.out.println("������b��ֵ��");
		double b = input.nextDouble();
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("a��ֵΪ��"+a);
		System.out.println("b��ֵΪ��"+b);
	}
}