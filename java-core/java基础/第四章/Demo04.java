/*
2.3������һ�����֣������������� 1����ô�������һ�������������� 2����
ô��������ڶ��������������� 3����ô�������������������������������������
�������(switch)
*/
import java.util.*;
public class Demo04{
	public static void main (String [] args){
		System.out.println("������1-7��");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		switch(number){
			case 1:
			System.out.println("����һ");
			break;
			case 2:
			System.out.println("���ڶ�");
			break;
			case 3:
			System.out.println("������");
			break;
			case 4:
			System.out.println("������");
			break;
			case 5:
			System.out.println("������");
			break;
			case 6:
			System.out.println("������");
			break;
			case 7:
			System.out.println("������");
			break;
			default:
			System.out.println("�������");
		}
	}
}