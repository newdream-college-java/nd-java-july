import java.util.*;
public class H{
	public static void main(String[] args){
		System.out.println("*******************************************");
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		System.out.println("*******************************************");
		System.out.println("请选择，输入数字：");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a==1){
			System.out.println("\t欢迎使用我行我素购物管理系统");
			System.out.println("*******************************************");
			System.out.println("\t\t1.客户信息管理");
			System.out.println("\t\t2.购物结算");
			System.out.println("\t\t3.真情回顾");
			System.out.println("\t\t4.注销");
			System.out.println("*******************************************");
			System.out.println("请选择，输入数字：");
		}
		else{
			System.out.println("退出系统");
		}
	
	}
}
