/*2.6�����ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ��������������� ������*/
import java.util.Scanner;
public class Work7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ������");
		int a = sc.nextInt();
		System.out.print("��������㷽ʽ��");
		char x= sc.next().charAt(0);
		System.out.print("������ڶ�������");
		int b = sc.nextInt();
		int sum = 0;
		switch(x){
			case '+':
				sum = a+b;
				break;
			case '-':
				sum = a-b;
				break;
			case '*':
				sum = a*b;
				break;
			case '/':
				sum = a/b;
				break;
			default:
				System.out.println("����ʲô����������");
		}
		System.out.println("���Ϊ��"+sum);
	}
}
