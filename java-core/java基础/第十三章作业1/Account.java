package ��ʮ������ҵ1;

import java.util.Scanner;

/*1.4������˵��
ģ�������˻�ҵ�񣺱�д Account �࣬��Ӵ��η���ʵ�ִ���ȡ��ҵ�񣬴���
ʼ 0 Ԫ��ȡ��ʱ��Ҫ�ж�����Ƿ���㣬
*/


public class Account {
	
	double total=0;
	public void saveMoney(double money) {
		System.out.println("���ɹ�");
		total+=money;
		System.out.println("��ǰ���Ϊ��"+total);
		
	}
	public void getMoney(double money) {
		if (total<money) {
			System.out.println("����");
		}else {
			System.out.println("ȡ��ɹ�");
			total-=money;
			System.out.println("��ǰ���Ϊ��"+total);
		}
	}
	
	public static void main(String[] args) {		
		Scanner input=new Scanner(System.in);
		Account account=new Account();
		while(true){
			System.out.println("1.���2.ȡ��0.�˳�");
			System.out.print("��ѡ����Ҫ�����ҵ��");
			int n=input.nextInt();
			switch (n) {
			case 0:
				System.out.println("ллʹ�ã�");
				System.exit(-1);
			case 1:
				System.out.print("���������");
				double money1=input.nextDouble();
				account.saveMoney(money1);
				break;
			case 2:
				System.out.print("������ȡ���");
				double money2=input.nextDouble();
				account.getMoney(money2);
				break;
	
			default:
				break;
			}
		}
	}
}
