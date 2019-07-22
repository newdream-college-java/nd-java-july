package proJob11.text4;

import java.util.Scanner;

public class StartSMS {
	String name;
	String psw;
	public void loginUI() {
		Scanner sc=new Scanner(System.in);
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1. 登录系统");
		System.out.println("2. 退出");
		System.out.println("**************************");
		System.out.print("请选择，输入数字：");
		int a=sc.nextInt();
		if(a==1) {
			login();
		}else if(a==2) {
			System.out.println("已退出");
		}else {
			System.out.print("输入错误请重新输入：");
			a=sc.nextInt();
		}
	}
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入用户名：");
		name=sc.next();
		System.out.print("请输入密码：");
		psw=sc.next();
	}
	
	public void login() {
		input();
		if(!name.equals("xieqiuxing")||!psw.equals("123456")) {
			System.out.println("您没有权限进入系统，请重新登录。");
			loginUI();
		}
	}
	
	
}
