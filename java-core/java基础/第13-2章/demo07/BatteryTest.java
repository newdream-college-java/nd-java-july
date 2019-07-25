package demo07;

import java.util.Scanner;

public class BatteryTest {
	public static void main(String[] args) {
		Battery bt=new Battery();
		Scanner input=new Scanner(System.in);
		bt.charging();
		bt.discharge();
		System.out.println("当前电池品牌为："+bt.getbrand());
		System.out.println("当前电池功率为："+bt.getpower());
		System.out.println("当前电池型号为："+bt.getmodel());
		System.out.print("请输入要修改的品牌为：");
		String xbrand=input.next();
		bt.xgbrand(xbrand);
		
		System.out.print("请输入要修改的功率为：");
		int xpower=input.nextInt();
		bt.xgpower(xpower);
		
		System.out.print("请输入要修改的类型为：");
		String xmodel=input.next();
		bt.xgmodel(xmodel);
		System.out.println(bt.toString());
		
	}
}
