/*
2.6�����ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ��������������� ����
*/
import java.util.*;
public class Demo07{
	public static void main (String [] args){
		System.out.println("������2������");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.print("�����������");
		String c = input.next();
		switch(c){
			case "+":
			System.out.print(a+b);
			break;
			case "-":
			System.out.print(a-b);
			break;
			case "*":
			System.out.print(a*b);
			break;
			case "/":
			System.out.print(a/b);
			break;
			default:
			System.out.print("���Ǹ�����");
			break;
		}
	}
}