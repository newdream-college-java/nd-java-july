/*  ������һ����λ�����������ǲ��ǽ�������:531 �ǽ�����  ��λ>ʮλ>��λ   */

import java.util.Scanner;

public class A{
	public static void main(String[ ] args) {
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		int a,b,c;
		a=i/100;
		b=i/10%10;
		c=i%10;
		if(a>b&&b>c){
		System.out.println("������Ϊ������");
		}else{
		System.out.println("��������Ϊ������");
		}
	}
}