package 十一章;

import java.util.Scanner;

public class Login {
	public void show() {
		// TODO Auto-generated constructor stub
		System.out.println("欢迎使用我行我素购物系统");
		System.out.println("\t1.登陆系统");
		System.out.println("\t2.退出");
		System.out.println("*************************************************");
		System.out.println("请选择，输入数字：");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		if (result == 1) {
			Shopping shop = new Shopping();
			shop.show();
		} else {
			System.exit(-1);
		}
	}
}
