package Work;

import java.util.Scanner;


/**
 * 1.2、需求说明
	实现系统菜单、输入菜单编号，可以自由切换各个菜单
	1.2.1、根据老师提供的素材，观察菜单类 Menu 代码，分析各个方法的功能
	1.2.3、编写类 StartSMS，实现输入用户名和密码，符合条件的进入系统
 */

public class Menu {
	Scanner scanner = new Scanner(System.in);
	public boolean loginCheck() {
		System.out.print("请输入用户名：");
		String a = scanner.next();
		System.out.println("请输入密码：");
		int b = scanner.nextInt();
		if (a.equals("admin")) {
			if(b==1234){
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	//登陆界面
	public void showLoginMenu() {
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		System.out.println("*************************************************");
		System.out.print("请选择，输入数字：");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			if (loginCheck()) {
				showMainMenu();
			}else {
			System.out.println("您没有权限进入系统，请重新登录！");
			}
			break;
			
		case 2:
			System.out.println("退出系统！");
			System.exit(-1);
			break;
			
		default:
			System.out.println("输入错误！重新输入");
			showLoginMenu();
			break;
		}		
	}
	//主菜单
	public void showMainMenu() {
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("*************************************************\n");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.真情回馈\n");
		System.out.println("*************************************************");
		System.out.print("请选择，输入数字：");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			showCustMenu();
			break;
		case 2:
			showSendGMenu();
			break;
			
		default:
			break;
		}	
	}
	//真情回馈
	public void showSendGMenu() {
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("\t我行我素购物管理系统>真情回馈");
		System.out.println("*************************************************\n");
		System.out.println("\t\t0.返回上一层");
		System.out.println("\t\t1.幸运大放送");
		System.out.println("\t\t2.幸运抽奖");
		System.out.println("\t\t3.生日问候");
		
		System.out.print("请选择，输入数字：");
		int a = scanner.nextInt();
		switch (a) {
		case 0:
			showMainMenu();
			break;
		case 1:
			
			break;
		case 2:
		
			break;
			
		default:
			System.out.println("输入错误，请重新输入！");
			showSendGMenu();
			break;
		}	
	}
	//客户信息管理
	public void showCustMenu() {
		System.out.println("\t\t0.返回上一层");
		System.out.println("\t\t1.显示所有客户信息");
		System.out.println("\t\t2.添加客户信息");
		System.out.println("\t\t3.修改客户信息");
		System.out.println("\t\t4.查询客户信息");
		System.out.println("请选择，请输入：");
		int a = scanner.nextInt();
		switch (a) {
		case 0:
			showMainMenu();
			break;
		case 1:
			System.out.println("执行显示所有客户信息");
			break;
		case 2:
			System.out.println("执行添加客户信息");
			break;
		case 3:
			System.out.println("执行修改客户信息");
			break;
		case 4:
			System.out.println("执行查询客户信息");
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.showLoginMenu();

	}

}
