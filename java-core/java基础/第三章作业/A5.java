/*���������� int �͵����ݣ����뵽 a,b,c ����������ȥ��ʹ�������ṹ�뽻���߼��������������е�ֵ��С�������С�*/

import java.util.Scanner;
public class A5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ������");
		int a = input.nextInt();
		System.out.print("������ڶ�������");
		int b = input.nextInt();
		System.out.print("���������������");
		int c = input.nextInt();
		int d;
		if(a>b){
			d=a;a=b;b=d;
		}if(a>c){
			d=a;a=c;c=d;
		}if(b>c){
			d=b;b=c;c=d;
		}
		System.out.println(a+"<"+b+"<"+c);
	}
}