package Chapter11_类的无参方法;

import java.util.Scanner;

/*
 编写类 StartSMS，实现输入用户名和密码，符合条件的进入系统
 */

public class StartSMS {
	String Username = "newdream";
	String Password = "1234";

	public static void main(String[] args) {
		StartSMS sms=new StartSMS();
		System.out.println("*********************************");
		System.out.println("欢迎来使用我行我素购物管理系统\n");
		System.out.println("\t1.登陆系统\n");
		System.out.println("\t2.退出\n");
		System.out.println("*********************************");
		System.out.print("请选择，输入数字：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.print("请选择用户名：");
			String username = input.next();
			System.out.print("请选择密码：");
			String password = input.next();
			if (username.equals(sms.Username) && password.equals(sms.Password)) {
				System.out.println("@@成功进入系统@@");
			} else {
				System.out.println("@@您没有权限进入系统，请重新登陆@@");
			}
			break;
		case 2:
			System.out.println("系统退出！！！");
			System.exit(-1);
		default:
			System.out.println("输入错误！！！");
		}
	}

}
