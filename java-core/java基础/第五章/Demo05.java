/*
1.5��ѭ��Ҫ���û�����һ�� 0 �� 2 ֮��������� 
���������� 0 ��������������ʯͷ���� 
���������� 1 �������������Ǽ������� 
���������� 2 �������������ǲ����� 
������������ͽ�������
*/
import java.util.*;
public class Demo05 {
	public static void main(String[] args){
		System.out.print("������һ��0-2��������");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		while(a>=0&&a<3){
			switch(a){
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
			System.out.print("������һ��0-2��������");
			input = new Scanner(System.in);
			a = input.nextInt();
		}
		System.out.print("�������");		
	}
}