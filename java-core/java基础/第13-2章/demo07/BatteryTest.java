package demo07;

import java.util.Scanner;

public class BatteryTest {
	public static void main(String[] args) {
		Battery bt=new Battery();
		Scanner input=new Scanner(System.in);
		bt.charging();
		bt.discharge();
		System.out.println("��ǰ���Ʒ��Ϊ��"+bt.getbrand());
		System.out.println("��ǰ��ع���Ϊ��"+bt.getpower());
		System.out.println("��ǰ����ͺ�Ϊ��"+bt.getmodel());
		System.out.print("������Ҫ�޸ĵ�Ʒ��Ϊ��");
		String xbrand=input.next();
		bt.xgbrand(xbrand);
		
		System.out.print("������Ҫ�޸ĵĹ���Ϊ��");
		int xpower=input.nextInt();
		bt.xgpower(xpower);
		
		System.out.print("������Ҫ�޸ĵ�����Ϊ��");
		String xmodel=input.next();
		bt.xgmodel(xmodel);
		System.out.println(bt.toString());
		
	}
}
