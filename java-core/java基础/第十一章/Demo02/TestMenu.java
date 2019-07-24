package chapter11;

import java.util.Scanner;

public class TestMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//新建对象
		StartSMS start = new StartSMS();
		Menu menu = new Menu();
		//显示登录界面
		menu.showLoginMenu();
		int num1 = input.nextInt();
		while (num1 != 1 && num1 != 2) {
			System.out.print("您的输入有误，请重新输入：");
			num1 = input.nextInt();
		}


		if (num1 == 1) {
			start.login();//登录验证֤
			int num2 = input.nextInt();
			if (num2 == 1) {
				menu.showCustMenu();//显示客户界面

			}
			if (num2 == 2) {
				menu.showSendMenu();//显示回馈界面

			}

		}
		//�˳�����
		if (num1 == 2) {
			System.out.println("程序退出！！！");
		}
	}

}
