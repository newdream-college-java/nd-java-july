/*
4�������������������뵽�������� a �� b �У���̽� a �� b �е�ֵ����������� 
*/
import java.util.Scanner;
public class Demo04{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������a��b");
		int a = input.nextInt();
		int b = input.nextInt();
		int c=0;
		System.out.println("�û�ǰa="+a+"b="+b);
		c=a;a=b;b=c;
		System.out.println("�û���a="+a+"b="+b);
	}
}