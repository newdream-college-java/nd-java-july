/*
2.6�����ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ���������������
����
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("***********���������**************");
		System.out.println("                     1���ӷ�����");
		System.out.println("                     2����������");
		System.out.println("                     3���˷����� ");
		System.out.println("                     4����������");
		System.out.print("��ѡ����������㷨��");
		int n = input.nextInt();
		switch(n){
			case 1:
				System.out.print("�������һ������");
				int a = input.nextInt();
				System.out.print("������ڶ�������");
				int b = input.nextInt();
				int c  = a+b;
				System.out.println("������Ϊ��"+c+"��");
				break;
			case 2:
				System.out.print("�������һ������");
				int d = input.nextInt();
				System.out.print("������ڶ�������");
				int e = input.nextInt();
				int f  = d-e;
				System.out.println("������Ϊ��"+f+"��");
				break;
			case 3:
				System.out.print("�������һ������");
				int g = input.nextInt();
				System.out.print("������ڶ�������");
				int h = input.nextInt();
				int i  = g*h;
				System.out.println("������Ϊ��"+i+"��");
				break;
			case 4:
				System.out.print("�������һ������");
				int x = input.nextInt();
				System.out.print("������ڶ�������");
				int y = input.nextInt();
				int z  = x/y;
				System.out.println("������Ϊ��"+z+"��");
				break;
		}
	}
}