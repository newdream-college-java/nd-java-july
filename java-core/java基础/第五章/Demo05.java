/*1.5��ѭ��Ҫ���û�����һ�� 0 �� 2 ֮���������
���������� 0 ��������������ʯͷ����
���������� 1 �������������Ǽ�������
���������� 2 �������������ǲ�����
������������ͽ�������*/
import java.util.Scanner;
public class Demo05{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ�� 0 �� 2 ֮�������:");
		int hd=input.nextInt();
		while((hd==0||hd==1||hd==2)){
			switch(hd){
				case 0:
					System.out.println("�������ʯͷ");
					break;
				case 1:
					System.out.println("������Ǽ���");
					break;
				case 2:
					System.out.println("������ǲ�");
					break;
				default:
					break;
			}
			System.out.println("������һ�� 0 �� 2 ֮�������:");
			hd=input.nextInt();
		}
	}
}