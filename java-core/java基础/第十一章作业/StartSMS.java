package 第11章作业;

import java.util.Scanner;

/*1.2.3、编写类 StartSMS，实现输入用户名和密码，符合条件的进入系统*/
public class StartSMS {
	Menu menu=new Menu();
	public void LoginMenu() {
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int loginNum=input.nextInt();
	}
	String userName="张三";
	String passWord="1234";
	public void Login(){
		LoginMenu();
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String s1=input.next();
		System.out.print("请输入密码：");
		String s2=input.next();
		if (userName.equals(s1)&&passWord.equals(s2)) {
			System.out.println("登录成功！");
			menu.showMainMenu();
		}else{
			System.out.println("@@您没有权限进入系统，请重新登录。@@");
		}
		
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartSMS ss=new StartSMS();
		ss.Login();
	}

}
