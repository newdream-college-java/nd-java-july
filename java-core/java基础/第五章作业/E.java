/*	ѭ��Ҫ���û�����һ��0��2֮�������������������0��������������ʯͷ����
	����������1�������������Ǽ�������
	����������2�������������ǲ����� 
	������������ͽ�������

*/

import java.util.*;

public class E{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		while(i>=0&&i<=2){
			switch(i){
				case 0:
					System.out.println("�������ʯͷ");
					break;
				case 1:
					System.out.println("������Ǽ���");
					break;
				case 2:
					System.out.println("������ǲ�");
					break;
			}
		
			i=input.nextInt();
		}
		System.out.println("ϵͳ�˳�������");
		System.exit(0);
	}
}