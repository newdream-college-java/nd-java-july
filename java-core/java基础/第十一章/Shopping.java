package 十一章;

import java.util.Scanner;

public class Shopping {
	public void show() {
		System.out.println("我行我素购物管理系统主菜单");
		System.out.println("*************************************************");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.真情回馈");
		System.out.println("*************************************************");
		System.out.println("请选择，输入数字或按0返回上一级菜单：");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		if (result == 1) {
			System.out.println("欢迎进入客户信息管理系统");
		} else if (result == 2) {
			Huikui hk = new Huikui();
			hk.show();
		} else if (result == 0) {
			Login lg = new Login();
			lg.show();
		} else {
			System.out.println("输入错误");
		}
	}
}
