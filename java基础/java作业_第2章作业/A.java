/*1����������С�������� a,b �У����ʵ�� a �� b �����е�ֵ������ 
   ������ a �� b �е�ֵ�� */
import java.util.Scanner;
public class A{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("����������С����");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("����ǰ��a="+a+"\tb="+b);
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("������a="+a+"\tb="+b);
}
}