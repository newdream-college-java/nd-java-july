/*1����������С�������� a,b �У����ʵ�� a �� b �����е�ֵ������
������ a �� b �е�ֵ��*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("������һ��С����");
		double a=in.nextDouble();
		System.out.print("���������С����");
		double b=in.nextDouble();
		double temp;
		System.out.println("a="+a+"\t"+"b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+"\t"+"b="+b);	
	}
}