/*2.6�����ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ��������������� ������*/
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ������");
		double a=input.nextInt();
		System.out.print("�������������");
		char c=input.next().charAt(0);
		System.out.print("������ڶ�������");
		double b=input.nextInt();
		double result=0;
		switch(c){
			case '+':
				result=a+b;
				System.out.println("�����"+a+"+"+b+"="+result);	
			break;
			case '-':
				result=a-b;
				System.out.println("�����"+a+"-"+b+"="+result);	
			break;
			case '*':
				result=a*b;
				System.out.println("�����"+a+"*"+b+"="+result);
			break;
			case '/':
				if(b==0){
					System.out.println("����������Ϊ0��");	
					return;
				}
				else{
					result=a/b;
					System.out.println("�����"+a+"/"+b+"="+result);
				}
			break;
		}	
	}
}