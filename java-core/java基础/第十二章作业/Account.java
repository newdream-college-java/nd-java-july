package chapter12;

import java.util.Scanner;

/*
 模拟银行账户业务：编写 Account 类，添加带参方法实现存款和取款业务，存款初
 始 0 元，取款时需要判断余额是否充足
 */

public class Account {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double money = 0;
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		while (true) {
			System.out.println("1.存款\t2.取款\t0.退出");
			System.out.print("请选择你需要办理的业务：");
			int a = input.nextInt();
			switch (a) {
			case 1:
				money=account.deposit(money);
				break;
			case 2:
				money=account.withDrawal(money);
				break;
			case 0:
				System.exit(-1);
				break;
			default:
				System.out.println("输入错误，系统退出！！！");
				System.exit(-1);
			}
			System.out.println("***当前余额为：" + money + "***\n");
		}
	}

	// 存款
	public double deposit(double money) {
		System.out.print("请输入存款金额：");
		double a = input.nextInt();
		return money += a;
	}

	// 取款
	public double withDrawal(double money) {
		System.out.print("请输入取款金额：");
		double a = input.nextInt();
		return money -= a;
	}
}
