/*���̲μӼ������̴���
�����õ� 1 �������μ���ʡ����ѧ��֯�� 1 ��������Ӫ
�����õ� 2 �������������ձʼǱ�����һ��
�����õ� 3 �����������ƶ�Ӳ��һ��
���򣬲����κν���*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���뺫�̵ĳɼ���");
		int a=input.nextInt();
		switch(a){
			case 1:	
			System.out.println("��ϲ��òμ���ʡ����ѧ��֯��1��������Ӫ���");
			break;
			case 2:
			System.out.println("��ϲ��û��ձʼǱ�һ̨��");
			break;
			case 3:
			System.out.println("��ϲ����ƶ�Ӳ��һ����");		
			break;
			default:
			System.out.println("��ϲû�񽱣�");
		}
	}
}