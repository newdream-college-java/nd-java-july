/*2.3������һ�����֣������������� 1����ô�������һ�������������� 2����
ô��������ڶ��������������� 3����ô�������������������������������������
�������(switch)*/
import java.util.Scanner;
public class demo04{
	public static void main (String [] args){
		Scanner input= new Scanner(System.in);
		System.out.println("����һ������");
		int mc=input.nextInt();
		switch(mc)
		{
			case 1:
			System.out.println("����һ");
			break;
			case 2:
			System.out.println("���ڶ�");
			break;
			case 3:
			System.out.println("������");
			break;
			default:
			System.out.println("�������");
		}
	}
}