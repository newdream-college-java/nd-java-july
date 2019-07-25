package 十三章_1;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account test = new Account();
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("1.存款\t2.取款\t0.退出");
			System.out.print("请选择你需要办理的业务：");
			int a = input.nextInt();
			switch (a) {
			case 1:
				System.out.print("请输入存款金额：");
				double money1 = input.nextInt();
				test.Withdrawal(money1);
				System.out.println("存款成功");
				test.showBalance();
				break;
			case 2:
				System.out.print("请输入取款金额：");
				double money2 = input.nextInt();
				test.deposit(money2);
				test.showBalance();
				break;

			default:
				System.out.println("谢谢使用!");
				return;
			}
		}
	}

}
