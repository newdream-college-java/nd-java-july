/*����һ�� 3 λ�����ֱ���뵽 3 ��������ȥ����̽��� 3 �������е�ֵ�����������
�� ������ 123 ���������뵽 a,b,c ��ȥ�������� a,b,c ��ֵ��Ҫ����� 321�� */

import java.util.Scanner;

public class F{
	public static void main(String[ ] args){
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int a,b,c;
	c=n%10;
	a=n/100;
	b=a;
	a=c;
	c=b;
	b=n/10%10;
	System.out.println(a+""+b+""+c);
	}
}