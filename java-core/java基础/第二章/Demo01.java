/*
1����������С�������� a,b �У����ʵ�� a �� b �����е�ֵ������ 
   ������ a �� b �е�ֵ�� 
*/
import java.util.Scanner;
public class Demo01{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������С��a��b");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c=0;
		System.out.println("�û�ǰa="+a+"b="+b);
		c=a;a=b;b=c;
		System.out.println("�û���a="+a+"b="+b);
	}
}