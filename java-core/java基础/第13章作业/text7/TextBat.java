package job02.text7;

import java.util.Scanner;

public class TextBat {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Battery bat=new Battery();
		System.out.print("�������ص�Ʒ�ƣ�");
		bat.brand=sc.next();
		System.out.print("�������ص��ͺţ�");
		bat.type=sc.next();
		System.out.print("�������صĹ��ʣ�");
		bat.power=sc.next();
		for(int i=1;;i++) {
		System.out.print("��ѡ��1-9����");
		int ans=sc.nextInt();
		xuanZe(ans,bat);
		}
	}
	
	public static void xuanZe(int ans,Battery bat) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		switch (ans) {
		case 1:
			bat.chongDian();
			break;
		case 2:
			bat.fangDian();
			break;
		case 3:
			System.out.println("Ʒ�ƣ�"+bat.getBrand());
			break;
		case 4:
			System.out.println("���ʣ�"+bat.getPower());
			break;
		case 5:
			System.out.println("���ͣ�"+bat.getType());
			break;
		case 6:
			System.out.println(bat.toString());
			break;
		case 7:
			System.out.print("������Ʒ�ƣ�");
			String nbrand=sc.next();
			bat.settingBrand(nbrand);
			break;
		case 8:
			System.out.print("�����¹��ʣ�");
			String npower=sc.next();
			bat.settingPower(npower);
			break;
		case 9:
			System.out.print("�������ͺţ�");
			String ntype=sc.next();
			bat.settingType(ntype);
			break;

		default:
			System.out.println("�������");
			break;
		}
	}

}
