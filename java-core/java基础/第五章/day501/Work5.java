/*1.5��ѭ��Ҫ���û�����һ�� 0 �� 2 ֮���������
���������� 0 ��������������ʯͷ����
���������� 1 �������������Ǽ�������
���������� 2 �������������ǲ�����
������������ͽ�������*/
import java.util.Scanner;
public class Work5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������֣�");
		int a = sc.nextInt();
		while(a>=0&&a<=2){
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
			System.out.println("���������֣�");
			a = sc.nextInt();
		}
		System.out.println("����������Ϸ������");
	}
}	