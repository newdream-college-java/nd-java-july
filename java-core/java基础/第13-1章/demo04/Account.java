/*ģ�������˻�ҵ�񣺱�д Account �࣬��Ӵ��η���ʵ�ִ���ȡ��ҵ�񣬴���
ʼ 0 Ԫ��ȡ��ʱ��Ҫ�ж�����Ƿ����*/
package demo04;

import java.util.Scanner;

public class Account {
	double count=0;
	double money;
	Scanner input = new Scanner(System.in);

	public void money() {
		while (true) {
			System.out.println();
			System.out.println("1.��� 2.ȡ�� 0.�˳�");
			System.out.print("��ѡ������Ҫ�����ҵ��");
			int a = input.nextInt();
			switch (a) {
			case 1:
				System.out.print("���������");
				money = input.nextDouble();
				addMoney(money);
				break;
			case 2:
				System.out.print("������ȡ���");
				money = input.nextDouble();
				minusMoney(money);
				break;
			case 0:
				System.out.println("ллʹ�ã�");
				System.exit(-1);
			default:
				System.out.println("����������������롣");
				break;
			}
		}
	}

	public void addMoney(double money) {
		count += money;
		System.out.println();
		System.out.println("***��ǰ���Ϊ��" + count + "Ԫ***");
	}

	public void minusMoney(double money) {
		if (count >= money) {
			count -= money;
			System.out.println();
			System.out.println("***��ǰ���Ϊ��" + count + "Ԫ***");
		}else{
			System.out.println("���㣡����");
		}
	}
}
