/*2.5�� ������� 1 �� 1 �յ��������������*/
import java.util.Scanner;
public class demo06{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("���������·ݣ�");
		int iMouth=input.nextInt();
		System.out.println("�������ĺ�����");
		int iDay=input.nextInt();
		switch(iMouth){
			case 1:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1));
			break;
			case 2:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31));
			break;
			case 3:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28));
			break;
			case 4:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31));
			break;
			case 5:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31+30));
			break;
			case 6:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31+30+31));
			break;
			case 7:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31+30+31+30));
			break;
			case 8:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31+30+31+30+31));
			break;
			case 9:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31+30+31+30+31+31));
			break;
			case 10:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31+30+31+30+31+31+30));
			break;
			case 11:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31+30+31+30+31+31+30+31));
			break;
			case 12:
			System.out.println("1��1�ŵ����������Ϊ��"+(iDay-1+31+28+31+30+31+30+31+31+30+31+30));
			break;
			default:
			System.out.println("���벻�Ϸ�");
		}
	}
}