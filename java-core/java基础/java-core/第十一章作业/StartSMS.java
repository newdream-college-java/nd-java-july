package chapter_11;

import java.util.Scanner;

public class StartSMS {
	public void showLoginMenu(){
		String a="clc";
		String b = "1234";
		System.out.println("**********************************");
		System.out.println("\t欢迎使用我行我素购物系统！！！");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int a1=input.nextInt();
		if(a1==1){
			do{
			System.out.print("请输入用户名：");
			String userName=input.next();
			System.out.print("请输入密码：");
			String passWord=input.next();
			if(userName.equals(a)&&passWord.equals(b)){
				System.out.println("@@H欢迎使用我行我素购物系统！@@");
				break;
			}else{
				System.out.println("@@您没有权限进入系统，请重新登录！@@");
				continue;
			}
			}while(true);
		}else{
			System.out.println("@@系统退出！！！@@");
			System.exit(-1);
		}
	}
	public static void main(String[] args) {
		/**
		 * 创建对象
		 * 调用方法
		 */
		StartSMS menu=new StartSMS();
		menu.showLoginMenu();

	}


}
