/*
6������һ�� 3 λ�����ֱ���뵽 3 ��������ȥ����̽��� 3 �������е�ֵ������������� ������ 123 ���������뵽 a,b,c ��ȥ�������� a,b,c ��ֵ��Ҫ����� 321
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int n = input.nextInt();
		int a= n%10;
		int b = n/10%10;
		int c = n/100;
		int x =0;
		if(a<b){
		x=a;a=b;b=x;
		}
		if(a<c){
		x=a;a=c;c=x;
		}
		System.out.print(a+""+b+""+c);
	}
}