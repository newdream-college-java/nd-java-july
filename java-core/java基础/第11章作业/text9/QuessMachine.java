package proJon11.text9;

import java.util.Random;
import java.util.Scanner;

public class QuessMachine {
	String name;
	double price;

	public void initial() {
		Random ran = new Random();
		int a = ran.nextInt(4) + 1;

		switch (a) {
		case 1:
			name = "�綯��";
			price = 5000;
			break;
		case 2:
			name = "���ӻ�";
			price = 4000;
			break;
		case 3:
			name = "����";
			price = 6000;
			break;
		case 4:
			name = "��Ϊp30";
			price = 10000;
			break;
		default:
			System.out.println("����Ʒ�����ڣ�");
			break;
		}

	}

	public void guess() {
		Scanner input = new Scanner(System.in);
		initial();
		double p = 0;
		int i=1;
		for (;i <5; i++) {
			if(i==1) {
			System.out.print("��²�" + name + "�ļ۸�");
			}
			p = input.nextInt();
			if (p > price) {
				System.out.println("��С�㣡");
			} else if (p < price) {
				System.out.println("�ٴ�㣡");
			} else {
				System.out.println("��ϲ������ˣ�����");
				break;
			}
			System.out.print("�ٲ�һ�ΰɣ�");

		}
		if (i ==5) {
			System.out.println("4����û�в¶ԣ��´�Ŭ���ɣ�");
		}

	}

}
