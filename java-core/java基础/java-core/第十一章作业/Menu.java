package chapter_11;
import java.util.*;
public class Menu {
	/**
	 * 登录菜单方法
	 */
	public void showLoginMenu(){
		System.out.println("**********************************");
		System.out.println("\t欢迎使用我行我素购物系统！！！");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int a=input.nextInt();
		if(a==1){
			showMainMenu();
		}else{
			System.exit(-1);
		}
	}
	/**
	 * 主菜单方法
	 */
	public void showMainMenu(){
		System.out.println("**********************************");
		System.out.println("\t我行我素购物系统主菜单");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.真情回顾");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int a=input.nextInt();
		if(a==0){
			showLoginMenu();
		}else if(a==1){
			showCustMenu();
		}else{
			showSendGMenu();
		}
	}
	/**
	 * 客户信息管理菜单
	 */
	public void showCustMenu(){
		System.out.println("**********************************");
		System.out.println("\t我行我素购物系统>客户信息管理");
		System.out.println("\t1.查询客户信息");
		System.out.println("\t2.修改客户信息");
		System.out.println("\t3.添加客户信息");
		System.out.println("\t4.显示所有客户信息");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int a=input.nextInt();
		if(a==0){
			showLoginMenu();
		}else if(a==1){
			System.out.println("执行 ——1.查询客户信息");
		}else if(a==2){
			System.out.println("执行 ——2.修改客户信息");
		}else if(a==3){
			System.out.println("执行 ——3.添加客户信息");
		}else{
			System.out.println("执行 ——4.显示所有客户信息");
		}
		
	}
	/**
	 * 真情回顾菜单
	 */
	public void showSendGMenu(){
		System.out.println("*********************************");
		System.out.println("\t我行我素购物系统>真情回顾");
		System.out.println("\t1.幸运大放送");
		System.out.println("\t2.幸运抽奖");
		System.out.println("\t3.生日问候");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int a=input.nextInt();
		if(a==0){
			showLoginMenu();
		}else if(a==1){
			System.out.println("执行 ——1.幸运大放送");
		}else if(a==2){
			System.out.println("执行 ——2.幸运抽奖");
		}else{
			System.out.println("执行 ——3.生日问候");
		}
	}
}
