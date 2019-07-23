package work;

import java.util.Scanner;

/**
 * 1.4、需求说明
	模拟银行账户业务：编写 Account 类，添加带参方法实现存款和取款业务，存款初
	始 0 元，取款时需要判断余额是否充足
 */

public class Account {
	double money = 0;
	public void menu() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1.存款\t2.取款\t0.退出");
			System.out.print("请选择业务：");
			int a = scanner.nextInt();	
		
			switch (a) {
			case 1:
				moneyIn();
				break;
			case 2:
				moneyOut();
				break;
			case 0:
				System.out.println("谢谢使用！！！");
				return;
				
			default:
				break;
			}
		}
	}
	public void moneyIn() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入存钱的金额：");
		double a = scanner.nextInt();
		money+=a;
		System.out.println("存款成功，剩余余额："+money);
		System.out.println();
		
	}
	public void moneyOut() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入取钱的金额：");
		int b = scanner.nextInt();
		if(b>money){
			System.out.println("抱歉，余额不足！");
		}else {
			money-=b;
			System.out.println("取款成功，剩余余额："+money);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Account ac = new Account();
		ac.menu();
	}
}
