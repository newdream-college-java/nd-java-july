/*
	�û���¼��֤����֤������� 3 ��
*/

import java.util.Scanner;

public class L{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		for(int i=2;i>=0;i--){
			System.out.print("�������û�����");
			String a=input.next();
			System.out.print("���������룺");
			int b=input.nextInt();
			if(a.equals("jim")&&b==123456){
				System.out.println("��ӭ��½MyShoppingϵͳ��");
				System.exit(-1);
			}else
				System.out.println("�������������"+i+"�λ���");
		}
		System.out.println("�Բ�����3�ξ��������");
	}
}