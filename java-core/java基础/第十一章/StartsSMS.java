package 十一章;

import java.util.Scanner;

public class StartsSMS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void showMainMenu() {
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("\t1.登陆系统");
		System.out.println("\t2.退出");
		System.out.println("*************************************************");
		System.out.println("请选择，输入数字：");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		if (result == 1) {
			System.out.print("请输入用户名：");
			String name = input.next();
			System.out.print("请输入密码：");
			String password = input.next();
			judge(name, password);
		} else {
			return;
		}
	}

	public void judge(String name, String password) {
		String oldname = "shuai";
		String oldpassword = "ls888";
		if (name.equals(oldname) && password.equals(oldpassword)) {
			System.out.println("歡迎光臨");
		} else {
			System.out.println("@@您没有权限进入系统，请重新登录。@@");
		}
	}
}
