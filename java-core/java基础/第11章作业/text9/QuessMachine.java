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
			name = "电动车";
			price = 5000;
			break;
		case 2:
			name = "电视机";
			price = 4000;
			break;
		case 3:
			name = "电脑";
			price = 6000;
			break;
		case 4:
			name = "华为p30";
			price = 10000;
			break;
		default:
			System.out.println("该商品不存在！");
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
			System.out.print("请猜测" + name + "的价格：");
			}
			p = input.nextInt();
			if (p > price) {
				System.out.println("再小点！");
			} else if (p < price) {
				System.out.println("再大点！");
			} else {
				System.out.println("恭喜你猜中了！！！");
				break;
			}
			System.out.print("再猜一次吧：");

		}
		if (i ==5) {
			System.out.println("4次内没有猜对，下次努力吧！");
		}

	}

}
