/*2.2�����̲μӼ������̴��� �����õ� 1 �������μ���ʡ����ѧ��֯�� 1 ��������Ӫ �����õ� 2 �������������ձʼǱ�����һ�� �����õ� 3 �����������ƶ�Ӳ��һ�� ���򣬲����κν���*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		System.out.print("������������Σ�");
		Scanner input=new Scanner(System.in);
		int score = input.nextInt();
		switch(score)
		{
			case 1:
				System.out.println("��ϲ������ʡ����ѧ��֯�� 1 ��������Ӫ");
				break;
			case 2:
				System.out.println("��ϲ���û��ձʼǱ�����һ��");
				break;
			case 3:
				System.out.println("��ϲ�����ƶ�Ӳ��һ����");
				break;
			default:
				System.out.println("��û�н�Ŷ");
				break;
		}

	}	
}