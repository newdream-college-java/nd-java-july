/*2.6�����ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ���������������
������*/
import java.util.Scanner;
public class demo07{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�����һ��ֵ��");
		int a=input.nextInt();
		System.out.print("�����������");
		String b=input.next();
		System.out.print("����ڶ���ֵ��");
		int c=input.nextInt();
		switch(b){
			case "+":
				System.out.println(a+c);
				break;
			case "-":
				System.out.println(a-c);
				break;
			case "*":
				System.out.println(a*c);
				break;
			case "/":
				System.out.println(a/c);
				break;
			default:
				System.out.println("�����ʽ����(Ӧ���������� ����� ����)");
		}
	}
}