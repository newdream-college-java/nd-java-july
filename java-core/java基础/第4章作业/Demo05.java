/*�������������������������������ȣ���ô���������������ȡ���������
�ж���������֮���Ƿ���� 1000��������� 1000 �������������֮�ʹ��� 1000��
�����������������֮�Ͳ����� 1000����(Ƕ�� if)*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("����������������");
		System.out.print("�������һ��������");
		int a=input.nextInt();
		System.out.print("������ڶ���������");
		int b=input.nextInt();
		System.out.print("�����������������");
		int c=input.nextInt();
		if(a==b&&a==c){
			System.out.println("�����������");
		}else{
			if((a+b+c)>1000){
				System.out.println("��������֮�ʹ���1000");
			}else{
				System.out.println("��������֮�Ͳ�����1000");
			}
			
		}
	}
}