/*
2.4���������������������������������ȣ���ô���������������ȡ���������
�ж���������֮���Ƿ���� 1000��������� 1000 �������������֮�ʹ��� 1000��
�����������������֮�Ͳ����� 1000����(Ƕ�� if)
*/
import java.util.*;
public class Demo05{
	public static void main (String [] args){
		System.out.println("������3��������");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a==b&&b==c){
			System.out.println("�����������");
		}
		else if(a+b+c>1000){
			System.out.print("��������֮�ʹ���1000");
		}
		else
			System.out.print("��������֮�Ͳ�����1000");
	}
}