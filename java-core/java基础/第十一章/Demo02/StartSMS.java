package chapter11;

import java.util.Scanner;

public class StartSMS {
	String name;
	String password;
	Menu mu = new Menu();
	Manager1 mag1 = new Manager1();
	public void login(){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		name = input.next();
		System.out.print("请输入密码");
		password = input.next();
		if(name.equals(mag1.name)&&password.equals(mag1.password)){
			mu.showMainMenu();
		}
		else{
			System.out.println("账号与或密码错误，退出系统！！！");
		}
	}
}
