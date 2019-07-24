/*模拟银行账户业务：编写 Account 类，添加带参方法实现存款和取款业务，存款初
始 0 元，取款时需要判断余额是否充足*/
package demo04;

import java.util.Scanner;

public class Account {
	double count=0;
	double money;
	Scanner input = new Scanner(System.in);

	public void money() {
		while (true) {
			System.out.println();
			System.out.println("1.存款 2.取款 0.退出");
			System.out.print("请选择你需要办理的业务：");
			int a = input.nextInt();
			switch (a) {
			case 1:
				System.out.print("请输入存款金额：");
				money = input.nextDouble();
				addMoney(money);
				break;
			case 2:
				System.out.print("请输入取款金额：");
				money = input.nextDouble();
				minusMoney(money);
				break;
			case 0:
				System.out.println("谢谢使用！");
				System.exit(-1);
			default:
				System.out.println("输入错误！请重新输入。");
				break;
			}
		}
	}

	public void addMoney(double money) {
		count += money;
		System.out.println();
		System.out.println("***当前余额为：" + count + "元***");
	}

	public void minusMoney(double money) {
		if (count >= money) {
			count -= money;
			System.out.println();
			System.out.println("***当前余额为：" + count + "元***");
		}else{
			System.out.println("余额不足！！！");
		}
	}
}
