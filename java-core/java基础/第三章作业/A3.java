/*������һ�����б��չ����������롣*/

import java.util.Scanner;
public class A3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ������");
		int a = input.nextInt();		
		if(a == 145610){
			System.out.print("������ڶ�������");
			int b = input.nextInt();
			if(b == 199701){
				System.out.print("��ϲ�õ�Ǯ��");
			}else {
				System.out.print("�ڶ����������");
			}
		}else {
			System.out.print("��һ���������");
		}
	}
}
