/*
2.2�����̲μӼ������̴���
�����õ� 1 �������μ���ʡ����ѧ��֯�� 1 ��������Ӫ
�����õ� 2 �������������ձʼǱ�����һ��
�����õ� 3 �����������ƶ�Ӳ��һ��
���򣬲����κν���
*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������ǵ��˵ڼ����أ�");
		int a = input.nextInt();
		switch(a){
			case 1:
				System.out.println("��ϲ������ʡ��һ���Σ�����");
				break;
			case 2: 
				System.out.println("��ϲ��������һ�ף�����");
				break;
			case 3:
				System.out.println("��ϲ������Ƥ��һ��������");
				break;
			default :
				System.out.println("��ϲ��ʲô��û�У�����");
		}
	}
}