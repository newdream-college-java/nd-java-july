/*2.4���������������������������������ȣ���ô���������������ȡ��������� �ж���������֮���Ƿ���� 1000��������� 1000 �������������֮�ʹ��� 1000�� �����������������֮�Ͳ����� 1000����(Ƕ�� if)*/
import java.util.Scanner;
public class ThreeNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������������");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a==b&&b==c){
			System.out.println("����������ȣ�");
		}else if(a+b+c>1000){
			System.out.println("��������֮�ʹ��� 1000");
		}else if(a+b+c<=1000){
			System.out.println("��������֮��С�� 1000");
		}
	}
}