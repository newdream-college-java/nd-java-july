/*1.5��ѭ��Ҫ���û�����һ�� 0 �� 2 ֮������������������� 0 ��������������ʯͷ�������������� 1 �������������Ǽ����������������� 2 �������������ǲ�����������������ͽ�������*/
import java.util.*;
public class Work05{
	public static void main(String [] agrs){
		Scanner sc=new Scanner(System.in);
		//Random rd=new Random();
		System.out.print("Ոݔ��һ��������0-2����");
		int a =sc.nextInt();
		//int b=rd.nextInt(2);
		while(true){
			switch(a){
				case 0:
				System.out.println("�������ʯͷ");
				break;

				case 1:
				System.out.println("������Ǽ���");
				break;

				case 2:
				System.out.println("������ǲ�");
				break;

				default :
				System.out.println("������󣬳����˳�");
				System.exit(-1);
		
			}
			System.out.print("Ոݔ��һ��������0-2����");
			a =sc.nextInt();
		}
	}
	
}