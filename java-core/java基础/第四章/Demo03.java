/*
����ϰ 2 �� ѵ��Ҫ�� ʹ�ó�������ʵ�����е�����
2.2�����̲μӼ������̴���
�����õ� 1 �������μ���ʡ����ѧ��֯�� 1 ��������Ӫ
�����õ� 2 �������������ձʼǱ�����һ��
�����õ� 3 �����������ƶ�Ӳ��һ��
���򣬲����κν���
*/
import java.util.*;
public class Demo03{
	public static void main (String [] args){
		System.out.println("����������1-3��");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		switch(number){
			case 1:
			System.out.println("���μ���ʡ����ѧ��֯�� 1 ��������Ӫ");
			break;
			case 2:
			System.out.println("���������ձʼǱ�����һ��");
			break;
			case 3:
			System.out.println("�������ƶ�Ӳ��һ��");
			break;
			default:
			System.out.println("�����κν���");
		}
	}
}