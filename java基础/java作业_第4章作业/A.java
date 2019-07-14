import java.util.Scanner;
public class A{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("************************");
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1、登陆系统");
		System.out.println("\t\t2、退出");
		System.out.println("************************");
		System.out.print("请选择，输入数字：");
		int a = input.nextInt();
		switch(a)
		{
		case 1:
		System.out.println("\t客户信息管理");
		System.out.println("\t购物结算");
		System.out.println("\t真情回馈");
		System.out.println("\t注销");
		break;
		case 2:
		System.out.println("谢谢您的使用");
		break;
}
}
}