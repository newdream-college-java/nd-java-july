package work;

import java.util.Scanner;

/**
 * 1.4������˵��
	ģ�������˻�ҵ�񣺱�д Account �࣬��Ӵ��η���ʵ�ִ���ȡ��ҵ�񣬴���
	ʼ 0 Ԫ��ȡ��ʱ��Ҫ�ж�����Ƿ����
 */

public class Account {
	double money = 0;
	public void menu() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1.���\t2.ȡ��\t0.�˳�");
			System.out.print("��ѡ��ҵ��");
			int a = scanner.nextInt();	
		
			switch (a) {
			case 1:
				moneyIn();
				break;
			case 2:
				moneyOut();
				break;
			case 0:
				System.out.println("ллʹ�ã�����");
				return;
				
			default:
				break;
			}
		}
	}
	public void moneyIn() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������Ǯ�Ľ�");
		double a = scanner.nextInt();
		money+=a;
		System.out.println("���ɹ���ʣ����"+money);
		System.out.println();
		
	}
	public void moneyOut() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ȡǮ�Ľ�");
		int b = scanner.nextInt();
		if(b>money){
			System.out.println("��Ǹ�����㣡");
		}else {
			money-=b;
			System.out.println("ȡ��ɹ���ʣ����"+money);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Account ac = new Account();
		ac.menu();
	}
}
