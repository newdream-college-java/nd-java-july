/*	�������������������������������ȣ���ô���������������ȡ���������
	�ж���������֮���Ƿ���� 1000��������� 1000 �������������֮�ʹ��� 1000��
	�����������������֮�Ͳ����� 1000����(Ƕ�� if)
*/

import java.util.Scanner;

public class E{
	public static void main (String[] args){
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if(a==b&&b==c){
	System.out.println("�����������");
	}else if(a+b+c>1000){
	System.out.println("��������֮�ʹ��� 1000");
	}else{
	System.out.println("��������֮�Ͳ����� 1000");
	}
	}
}