package proJob11.text2;

/*实现系统菜单、输入菜单编号，可以自由切换各个菜单
菜单级联关系与程序运行结果如图:*/
import java.util.Scanner;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
	}
	
	
	public static void login(){
		Scanner sc=new Scanner(System.in);
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1. 登录系统");
		System.out.println("2. 退出");
		System.out.print("请选择，输入数字：");
		int a=sc.nextInt();
		if(a==1){
			menu();
		}else if(a==2){
			System.out.println("已退出！");
			System.exit(-1);
		}else{
			System.out.print("输入错误请重新输入：");
			a=sc.nextInt();
		}
	}
	
	public static void menu(){
		Scanner sc=new Scanner(System.in);
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1. 客户信息管理");
		System.out.println("2. 真情回馈");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int a=sc.nextInt();
		if(a==1){
			manage();
		}else if(a==2){
			gift();
		}else if(a==0){
			login();
		}else{
			System.out.print("输入错误请重新输入：");
			a=sc.nextInt();
		}
	}
	
	public static void manage(){
		Scanner sc=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理");
		System.out.println("1. 显示所有客户信息");
		System.out.println("2. 添加客户信息");
		System.out.println("3. 修改客户信息");
		System.out.println("4. 查询客户信息");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int a=sc.nextInt();
		if(a==1){
			System.out.println("执行了显示所有客户信息");
		}else if(a==2){
			System.out.println("执行了添加客户信息");
		}else if(a==3){
			System.out.println("执行了修改客户信息");
		}else if(a==4){
			System.out.println("执行了查询客户信息");
		}else if(a==0){
			menu();
		}else{
			System.out.print("输入错误请重新输入：");
			a=sc.nextInt();	
		}
		
	}
	
	public static void gift(){
		Scanner sc=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理");
		System.out.println("1. 幸运大放送");
		System.out.println("2. 幸运抽奖");
		System.out.println("3. 生日问候");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int a=sc.nextInt();
		if(a==1){
			System.out.println("执行了幸运大放送");
		}else if(a==2){
			System.out.println("执行了幸运抽奖");
		}else if(a==3){
			System.out.println("执行了生日问候");
		}else if(a==0){
			menu();
		}else{
			System.out.print("输入错误请重新输入：");
			a=sc.nextInt();
		}
	}

}
