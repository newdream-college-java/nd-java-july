/*2.2�����̲μӼ������̴���
�����õ� 1 �������μ���ʡ����ѧ��֯�� 1 ��������Ӫ
�����õ� 2 �������������ձʼǱ�����һ��
�����õ� 3 �����������ƶ�Ӳ��һ��
���򣬲����κν���*/
import java.util.Scanner;
public class demo03{
	public static void main (String [] args){
		Scanner input= new Scanner(System.in);
		System.out.println("����������̴���������");
		int mc=input.nextInt();
		switch(mc)
		{
			case 1:
			System.out.println("��ϲ��òμ���ʡ����ѧ��֯�� 1 ��������Ӫ���ʸ�");
			break;
			case 2:
			System.out.println("��ϲ��������ձʼǱ�����һ��");
			break;
			case 3:
			System.out.println("��ϲ����ƶ�Ӳ��һ��");
			break;
			default:
			System.out.println("���ź�û�н�");
		}
	}
}