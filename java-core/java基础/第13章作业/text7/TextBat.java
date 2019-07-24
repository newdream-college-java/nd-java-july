package job02.text7;

import java.util.Scanner;

public class TextBat {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Battery bat=new Battery();
		System.out.print("请输入电池的品牌：");
		bat.brand=sc.next();
		System.out.print("请输入电池的型号：");
		bat.type=sc.next();
		System.out.print("请输入电池的功率：");
		bat.power=sc.next();
		for(int i=1;;i++) {
		System.out.print("请选择（1-9）：");
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
			System.out.println("品牌："+bat.getBrand());
			break;
		case 4:
			System.out.println("功率："+bat.getPower());
			break;
		case 5:
			System.out.println("类型："+bat.getType());
			break;
		case 6:
			System.out.println(bat.toString());
			break;
		case 7:
			System.out.print("输入新品牌：");
			String nbrand=sc.next();
			bat.settingBrand(nbrand);
			break;
		case 8:
			System.out.print("输入新功率：");
			String npower=sc.next();
			bat.settingPower(npower);
			break;
		case 9:
			System.out.print("输入新型号：");
			String ntype=sc.next();
			bat.settingType(ntype);
			break;

		default:
			System.out.println("输入错误！");
			break;
		}
	}

}
