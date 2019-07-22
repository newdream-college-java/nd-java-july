package Chapter11_类的无参方法;

/*
	随机出现一个商品名，用户猜测它的价值，如果在规定次数内
	猜对，便 可获得此商品。模拟竞猜活动
*/
import java.util.*;

public class QuessMachine {
	public static void main(String[] args) {
		QuessMachine quessMachine=new QuessMachine();
		quessMachine.guess();
	}
	public int initial() {
		Random random=new Random();
		int ran=random.nextInt(3)+1;
		int num=0;
		switch (ran) {
		case 1:
			System.out.print("请猜测电动车的价格：");
			num=3999;
			break;
		case 2:
			System.out.print("请猜测电脑的价格：");
			num=7999;
			break;
		default:
			System.out.print("请猜测手机的价格：");
			num=2999;
			break;
		}
		return num;

		
	}
	public void guess() {
		int a=initial();
		Scanner input=new Scanner(System.in);
		for(int i=1;i<5;i++){
			int num=input.nextInt();
			if(a<num){
				System.out.println("再小一点！");
			}else if(a>num){
				System.out.println("再大一点！");
			}else{
				System.out.println("恭喜你，猜对了！！");
				System.exit(-1);
			}
			System.out.print("再猜一次吧：");
		}
		System.out.println("4次内没有猜对，下次努力吧！！");
	}
}
