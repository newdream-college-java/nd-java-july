/*1、随机出现一个商品名，用户猜测它的价值，如果在规定次数内
猜对，便 可获得此商品。模拟竞猜活动，如图:*/
package demo08;

import java.util.Random;
import java.util.Scanner;

public class QuessMachine {
	Scanner input = new Scanner(System.in);
	Random rd = new Random();
	
	
	//定义商品信息，随机选取一个商品
	public void initial() {
		Goods gd1 = new Goods();
		gd1.name = "公主电动车";
		gd1.price = 2200;

		Goods gd2 = new Goods();
		gd2.name = "王子电动车";
		gd2.price = 2500;

		Goods gd3 = new Goods();
		gd3.name = "芭比娃娃";
		gd3.price = 120;

		Goods gd4 = new Goods();
		gd4.name = "小熊娃娃";
		gd4.price = 220;

		Goods gd5 = new Goods();
		gd5.name = "滑板";
		gd5.price = 400;

		int sjs = rd.nextInt(5) + 1;
		switch (sjs) {
		case 1:
			System.out.print("请猜测”公主电动车“的价格:");
			guess(gd1.price);
			break;
		case 2:
			System.out.print("请猜测”王子电动车“的价格:");
			guess(gd2.price);
			break;
		case 3:
			System.out.print("请猜测”芭比娃娃“的价格:");
			guess(gd3.price);
			break;
		case 4:
			System.out.print("请猜测”小熊娃娃“的价格:");
			guess(gd4.price);
			break;
		default :
			System.out.print("请猜测”滑板“的价格:");
			guess(gd5.price);
			break;
		}
	}
	
	//猜测价格
	public void guess(double price){
		boolean s=false;
		for (int i = 0; i < 4; i++) {
			double cprice=input.nextDouble();
			if(cprice>price){
				System.out.println("再小点");
				System.out.print("再猜一次吧：");
			}else if(cprice<price){
				System.out.println("再大点");
				System.out.print("再猜一次吧：");
			}else{
				System.out.println("恭喜你猜对了！");
				s=true;
				break;
			}
		}
		if(!s){
			System.out.println("4次内没有猜对，下次努力吧！");
		}
	}
}
