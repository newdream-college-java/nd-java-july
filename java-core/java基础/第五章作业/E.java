/*1.5��ѭ��Ҫ���û�����һ�� 0 �� 2 ֮���������
���������� 0 ��������������ʯͷ����
���������� 1 �������������Ǽ�������
���������� 2 �������������ǲ�����
������������ͽ�������*/
import java.util.*;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��0��2��������");
		int a=input.nextInt();
		while(a>=0&&a<=2){
			switch(a){
				case 0:
					System.out.println("�������ʯͷ��");
					break;
				case 1:
					System.out.println("������Ǽ�����");
					break;
				case 2:
					System.out.println("������ǲ���");
					break;
				
			}
			a=input.nextInt();
		}
		System.exit(-1);
	}
}