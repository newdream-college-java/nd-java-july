/*1���������һ����Ʒ�����û��²����ļ�ֵ������ڹ涨������
�¶ԣ��� �ɻ�ô���Ʒ��ģ�⾺�»����ͼ:*/
package demo08;

import java.util.Random;
import java.util.Scanner;

public class QuessMachine {
	Scanner input = new Scanner(System.in);
	Random rd = new Random();
	
	
	//������Ʒ��Ϣ�����ѡȡһ����Ʒ
	public void initial() {
		Goods gd1 = new Goods();
		gd1.name = "�����綯��";
		gd1.price = 2200;

		Goods gd2 = new Goods();
		gd2.name = "���ӵ綯��";
		gd2.price = 2500;

		Goods gd3 = new Goods();
		gd3.name = "�ű�����";
		gd3.price = 120;

		Goods gd4 = new Goods();
		gd4.name = "С������";
		gd4.price = 220;

		Goods gd5 = new Goods();
		gd5.name = "����";
		gd5.price = 400;

		int sjs = rd.nextInt(5) + 1;
		switch (sjs) {
		case 1:
			System.out.print("��²⡱�����綯�����ļ۸�:");
			guess(gd1.price);
			break;
		case 2:
			System.out.print("��²⡱���ӵ綯�����ļ۸�:");
			guess(gd2.price);
			break;
		case 3:
			System.out.print("��²⡱�ű����ޡ��ļ۸�:");
			guess(gd3.price);
			break;
		case 4:
			System.out.print("��²⡱С�����ޡ��ļ۸�:");
			guess(gd4.price);
			break;
		default :
			System.out.print("��²⡱���塰�ļ۸�:");
			guess(gd5.price);
			break;
		}
	}
	
	//�²�۸�
	public void guess(double price){
		boolean s=false;
		for (int i = 0; i < 4; i++) {
			double cprice=input.nextDouble();
			if(cprice>price){
				System.out.println("��С��");
				System.out.print("�ٲ�һ�ΰɣ�");
			}else if(cprice<price){
				System.out.println("�ٴ��");
				System.out.print("�ٲ�һ�ΰɣ�");
			}else{
				System.out.println("��ϲ��¶��ˣ�");
				s=true;
				break;
			}
		}
		if(!s){
			System.out.println("4����û�в¶ԣ��´�Ŭ���ɣ�");
		}
	}
}
