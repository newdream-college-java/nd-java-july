/*4�������������������뵽�������� a
�� b �У���̽� a �� b �е�ֵ�����������*/
import java.util.Scanner;
public class demo04{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("������a��ֵ��");
		int a = input.nextInt();
		System.out.println("������b��ֵ��");
		int b = input.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a��ֵΪ��"+a);
		System.out.println("b��ֵΪ��"+b);
	}
}