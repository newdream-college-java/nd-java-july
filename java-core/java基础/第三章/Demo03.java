/*
3��������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ��
�����һ�����붼����ȷ����ֱ�Ӱ����������棻�����һ������������ȷ��������Ȩ�����
�������롣ֻ�е��ڶ�������Ҳ������ȷ�������õ�Ǯ��(���������Լ��裬Ҫ�����볤�Ȳ�
�ܵ��� 6 λ)
�������һ������;
if(��һ��������ȷ){
������� 2 ������;
if(�� 2 ��������ȷ){
��ϲ�õ�Ǯ��
}else{
�� 2 ���������
}
}else{
�� 1 ���������
}
*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ�����룺");
		int password1 = input.nextInt();
		/*�ж�����1����*/
		while(password1<=99999){
			System.out.print("������̣����������룺");
			int password01 = input.nextInt();
			password1 = password01;
		}
		int p1 =123456;
		int p2 = 123123;
		/*�ж�����2����*/
		if(password1 == p1){
			System.out.print("������ڶ������룺");
			int password2 = input.nextInt();
			while(password2<=99999){
				System.out.print("������̣����������룺");
				int password02 = input.nextInt();
				password2 = password02;
			}
			if(password2 == p2)
				System.out.println("��ϲ�㣬��Ŀ���ûǮ�ˣ�");
			else
				System.out.println("������󣡣���");
		}
		else
			System.out.println("������󣡣���");
			
		
	}
}