/*3��������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ��
�����һ�����붼����ȷ����ֱ�Ӱ����������棻�����һ������������ȷ��������Ȩ�����
�������롣ֻ�е��ڶ�������Ҳ������ȷ�������õ�Ǯ��(���������Լ��裬Ҫ�����볤�Ȳ�
�ܵ��� 6 λ)*/
import java.util.Scanner;
public class Work3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int key1 = 123456;
		int key2 = 666666;
		System.out.print("�������һ�����룺");
		int passWord1 = input.nextInt();
		if(passWord1==key1){
			System.out.println("��һ��������ȷ");
			System.out.print("������ڶ������룺");
			int passWord2 = input.nextInt();
			if(passWord2==key2){
				System.out.println("��ϲ�㣬�õ����𣡣���");
			}else System.out.print("���ź����ڶ����������GG");
		}else System.out.print("GG");
	}	
}