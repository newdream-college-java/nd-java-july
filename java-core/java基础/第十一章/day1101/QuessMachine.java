package Work;

import java.util.Random;
import java.util.Scanner;

/**
 * 1、随机出现一个商品名，用户猜测它的价值，如果在规定次数内
	猜对，便 可获得此商品。模拟竞猜活动
 */
public class QuessMachine {
	int price;
	public void initial() {
		Random random = new Random();
		int a = random.nextInt(3)+1;
		switch (a) {
		case 1:
			System.out.println("请猜测兰博基尼模型的价格：");
			price = 503;
			break;
		case 2:
			System.out.println("请猜测这瓶建国纪念版旺仔牛奶的价钱：");
			price = 250;
			break;
		case 3:
			System.out.println("请猜测这瓶82年雪碧的价钱：");
			price = 3000;
			break;

		default:
			break;
		}
	}
	public void guess() {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5;i++ ) {
			int b = scanner.nextInt();
			if (b==price) {
				System.out.println("恭喜你，猜对了！！");
				
			}else if (b>price) {
				System.out.println("再小点！");
			}else {
				System.out.println("再大点！");
			}
			
			if (i==4) {
				System.out.println("五次都没猜对，裂开！！！");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuessMachine quessMachine = new QuessMachine();
		quessMachine.initial();
		quessMachine.guess();
	}

}
