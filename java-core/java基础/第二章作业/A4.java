/*�����������������뵽�������� a �� b �У���̽� a �� b �е�ֵ�����������*/
import java.util.Scanner;
public class A4{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = input.nextInt();
		System.out.println("������ڶ�������");
		int b = input.nextInt();
		int c;
		c=a;a=b;b=c;
		System.out.println("����������aΪ"+a+"����bΪ"+b);
	}
}