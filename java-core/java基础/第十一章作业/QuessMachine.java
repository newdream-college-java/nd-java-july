package 第11章作业;
/*1、随机出现一个商品名，用户猜测它的价值，如果在规定次数内
猜对，便 可获得此商品。模拟竞猜活动，*/
import java.util.Random;
import java.util.Scanner;

public class QuessMachine {
	String name;
	int price;
	public int initial(){
		Random random=new Random();
		int r=random.nextInt(4);
		switch (r) {
		case 0:	
			name="华为P30手机";
			price=5500;
			System.out.println("请猜测"+name+"的价格：");
			return price;			
		case 1:		
			name="公主电动车";
			price=4400;
			System.out.println("请猜测"+name+"的价格：");
			return price;
		case 2:			
			name="苹果笔记本电脑";
			price=11500;
			System.out.println("请猜测"+name+"的价格：");
			return price;
		case 3:	
			name="PSP游戏机";
			price=1500;		
			System.out.println("请猜测"+name+"的价格：");
			return price;
		}
		return price;
	}
	public void guess() {
		int s=initial();
		int count=0;
		Scanner inputScanner=new Scanner(System.in);
		int a=inputScanner.nextInt();
		for (int i = 0; i < 4; i++) {	
			if (s>a) {
				System.out.println("再大点！");
				count++;
			}else if (s<a) {
				System.out.println("再小点！");
				count++;
			}else {
				System.out.println("恭喜你猜对了！");
				break;
			}
			System.out.print("再猜一次吧：");
			a=inputScanner.nextInt();
			if (count==4) {
				System.out.println(count+"次内没有猜中，下次努力吧！");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuessMachine qm=new QuessMachine();
		qm.guess();
	}

}
