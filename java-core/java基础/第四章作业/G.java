/*���ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ��������������� ������*/

import java.util.Scanner;

public class G{
	public static void main (String [] args){
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	String i=input.next();
	int b=input.nextInt();
	int c=0;
	switch(i){
		case "+":
			c=a+b;
		break;
		case "-":
			c=a-b;
		break;
		case "*":
			c=a*b;
		break;
		case "/":
			c=a/b;
		break;
		default:
			System.out.println("����ķ������󣡣���");
		
	}
	System.out.println("���Ϊ"+c);
	}
}