/*
2������һ���������������εı߳�������������ε��ܳ���������� 
*/
import java.util.Scanner;
public class Demo02{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�����������εı߳���");
		int a= input.nextInt();
		int c = 4*a;
		int s= a*a;
		System.out.println("�������ε��ܳ�Ϊ��"+c+"���Ϊ��"+s);
	}
}