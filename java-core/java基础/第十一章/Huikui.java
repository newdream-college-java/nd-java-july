package 十一章;

import java.util.Scanner;

public class Huikui {
	public void show() {
		System.out.println("我行我素购物管理系统主菜单>真情回馈");
		System.out.println("*************************************************");
		System.out.println("\t1.幸运大放送");
		System.out.println("\t2.幸运抽奖");
		System.out.println("\t3.生日问候");
		System.out.println("*************************************************");
		System.out.println("请选择，输入数字或按0返回上一级菜单：");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		if (result == 1) {
			System.out.println("执行幸运大放送");
		} else if (result == 2) {
			System.out.println("执行幸运抽奖");
		} else if (result == 3) {
			System.out.println("执行生日问候");
		} else if (result == 0) {
			Shopping sp = new Shopping();
			sp.show();
		} else {
			System.out.println("输入错误");
		}
	}
}
