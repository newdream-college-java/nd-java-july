/*2.4���������������������������������ȣ���ô���������������ȡ��������� �ж���������֮���Ƿ���� 1000��������� 1000 �������������֮�ʹ��� 1000�� �����������������֮�Ͳ����� 1000����(Ƕ�� if)*/
import java.util.Scanner;
public  class Work05{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("����������������");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a!=b||b!=c){
			if(a+b+c>100){
				System.out.println("��������֮�ʹ��� 1000");
			}
			else   {
				System.out.println("��������֮�Ͳ����� 1000");
			}
		}else   {
			System.out.println("�����������");
		}
	}
}