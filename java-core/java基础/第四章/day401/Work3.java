/*2.2�����̲μӼ������̴��� �����õ� 1 �������μ���ʡ����ѧ��֯�� 1 ��������Ӫ �����õ� 2 �������������ձʼǱ�����һ�� �����õ� 3 �����������ƶ�Ӳ��һ�� ���򣬲����κν���*/
import java.util.Scanner;
public class Work3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println("���μ���ʡ����ѧ��֯��һ��������Ӫ");
				break;
			case 2:
				System.out.println("���������ձʼǱ�����һ��");
				break;
			case 3:
				System.out.println("�ڽ������ƶ�Ӳ��һ��");
				break;
			default:
				System.out.println("δ�񽱣�");
				break;
		}
	}
}