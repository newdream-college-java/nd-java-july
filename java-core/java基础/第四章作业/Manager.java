/*1.使用 switch 选择结构实现从登录菜单切换到主菜单功能： 输入数字 1：进入主菜单 输入数字 2：退出并显示“谢谢您的使用”,输入其它数字，显示“输入错误*/
import java.util.Scanner;
public class Manager{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t**********购物管理系统**********");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		System.out.print("请输入操作码：");
		int numLogin=input.nextInt();
		switch(numLogin){
			case 1:
				System.out.println("\t**********主菜单**********");
				System.out.println("\t\t1.客户信息管理");
				System.out.println("\t\t2.购物结算");
				System.out.println("\t\t3.真情回馈");
				System.out.println("\t\t4.注销");
				System.out.print("请输入操作码：");
				int numMenu=input.nextInt();
				switch(numMenu){
					case 1:
						System.out.println("\t*****购物管理系统>客户信息管理*****");
						System.out.println("\t\t1.显示所有客户信息");
						System.out.println("\t\t2.添加客户信息");
						System.out.println("\t\t3.修改客户信息");
						System.out.println("\t\t4.查询客户信息");
					break;
					case 2:
						System.out.println("功能暂未开通");
					break;
					case 3:
						System.out.println("\t*****购物管理系统>真情回馈*****");
						System.out.println("\t\t1.幸运大放送");
						System.out.println("\t\t2.幸运抽奖");
						System.out.println("\t\t3.生日问候");
					break;
					case 4:
						System.out.println("功能暂未开通");
					break;
					default:
						System.out.println("输入错误！！！");
				}
			break;
			case 2:
				System.out.println("谢谢您的使用！");
				break;
			default:
				System.out.println("输入错误！！！");
		}
	}
}