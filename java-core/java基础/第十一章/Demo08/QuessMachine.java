package chapter11;

import java.util.Random;

public class QuessMachine {
	int price = 0;
	public int initial() {
		Random rd = new Random();
		int i = rd.nextInt(2)+1;
		switch(i){
		case 1:
			System.out.print("请猜测*电动小车车*的价格是：");
			price = 10;
			break;
		default :
			System.out.print("请猜测*手动小车车*的价格是：");
			price = 50;
			break;
		}
		return price;
	}
	public boolean guess(int a){
		boolean flag = false;
		if(a == price){
			System.out.println("猜对了！");
			flag = true;
		}
		else if(a < price){
			System.out.println("再大些！");
		}
		else{
			System.out.println("再小些！");
		}
		return flag;
	}
}
