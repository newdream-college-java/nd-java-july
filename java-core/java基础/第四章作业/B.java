/*ʹ�ó�������ʵ�����е�����

����ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ��
�ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ���������������������
�˼����ҡ�
 */

import java.util.Scanner;

public  class  B{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("����Ҫ�򼸸����ӣ�");
		int x=input.nextInt();
		if(x<3)
		{
			System.out.println("�ϰ岻����");
		}
		else if(x>=3&&x<=5)
		{
			System.out.println("�ϰ���һ����");
		}
		else
		{
			System.out.println("�ϰ��Ͷ�����");
		}
	
	}
}