/*���������� int �͵����ݣ����뵽 a,b,c ����������ȥ��ʹ�������ṹ�뽻���߼��� 
�����������е�ֵ��С�������С�  */

import java.util.Scanner;

public class E{
	public static void main (String[] args){
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if(a>c){
	a=a+c;
	c=a-c;
	a=a-c;
	}
	if(a>b){
	a=a+b;
	b=a-b;
	a=a-b;
	}
	if(b>c){
	b=b+c;
	c=b-c;
	b=b-c;
	}
	System.out.println(a+""+b+""+c);
	}
}