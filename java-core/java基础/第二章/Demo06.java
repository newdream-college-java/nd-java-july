/*
6������һ�� 3 λ�����ֱ���뵽 3 ��������ȥ����̽��� 3 �������е�ֵ�������������
������ 123 ���������뵽 a,b,c ��ȥ�������� a,b,c ��ֵ��Ҫ����� 321��
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��3λ����");
		int n = input.nextInt();
		int a,b,c;
		a=n%10;
		n=(n-a)/10;
		b=n%10;
		n=(n-b)/10;
		c=n%10;
		System.out.println("�����������"+a+""+b+""+c);
	}
}