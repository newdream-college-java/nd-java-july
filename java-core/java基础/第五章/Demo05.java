/*
1.5��ѭ��Ҫ���û�����һ�� 0 �� 2 ֮���������
���������� 0 ��������������ʯͷ����
���������� 1 �������������Ǽ�������
���������� 2 �������������ǲ�����
������������ͽ�������
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ������");
		int a = sc.nextInt();
		while(a == 0||a  == 1||a ==2){
			switch(a){
				case 0:
					System.out.println("�������ʯͷ������");
					System.out.print("������һ������");
					a = sc.nextInt();
					break;
				case 1:
					System.out.println("������Ǽ���������");
					System.out.print("������һ������");
					a = sc.nextInt();
					break;
				case 2:
					System.out.println("������ǲ�������");
					System.out.print("������һ������");
					a = sc.nextInt();
					break;
				default:
					break;
 
			}
		}
		System.out.println("�����������󣬳����˳�������");
	}	
}
                                  