package 十三章_1;

import java.util.Scanner;

public class Account {
	double balance;

	public void Withdrawal(double money) {
		balance += money;
	}

	public void deposit(double money) {
		if (balance < money) {
			System.out.println("余额不足，无法取出！");
		} else {
			balance -= money;
			System.out.println("取款成功");
		}
	}

	public void showBalance() {
		System.out.println("***当前余额为：" + balance + "元***");
	}
}
