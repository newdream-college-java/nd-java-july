/*����һ�� 3 λ�����ֱ���뵽 3 ��������ȥ��
��̽��� 3 �������е�ֵ�����������*/

import java.util.Scanner;
public class A6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int s = input.nextInt();
		int a = s%10;
		int b = s/10%10;
		int c = s/100;
		int d;
		if(a<b){
			d=a;a=b;b=d;
		}if(a<c){
			d=a;a=c;c=d;
		}if(b<c){
			d=b;b=c;c=d;
		}
		System.out.println(100*a+10*b+c);
	}
}
