/*�������������������������������뵽��������a��b�У���̽�a��b�е�ֵ���������*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������a��");
		int a=input.nextInt();
		System.out.print("������b��");
		int b=input.nextInt();
		System.out.println("����ֵ��"+"a="+a+"\tb="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("���ֵ��"+"a="+a+"\tb="+b);
	}
}