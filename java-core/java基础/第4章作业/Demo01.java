/*我行我素购物管理系统*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("*********登录菜单(第一级)*********");
		System.out.println("\t1.登录系统");
		System.out.println("\t2.退出");
		System.out.print("请输入选项1：");
		int a=input.nextInt();
		switch(a){
			case 1:
			System.out.println("*********主菜单(第二级)*********");
			System.out.println("\t1.客户信息管理");
			System.out.println("\t2.购物结算");
			System.out.println("\t3.真情回馈");
			System.out.println("\t4.注销");
			System.out.print("请输入选项2：");
			int b=input.nextInt();
			switch(b){
				case 1:
				System.out.println("*********购物管理系统*********");
				System.out.println("\t1.显示所有客户信息");
				System.out.println("\t2.添加客户信息");
				System.out.println("\t3.修改客户信息");
				System.out.println("\t4.查询客户信息");
				break;
				case 2:
				break;
				case 3:
				System.out.println("*********购物管理系统*********");
				System.out.println("\t1.幸运大放送");
				System.out.println("\t2.幸运抽奖");
				System.out.println("\t3.生日问候");
				break;
				case 4:
				default:
				System.out.println("输入错误！");
				break;
			}
			break;
			case 2:
			break;
			default:
			System.out.println("输入错误！");
		}
	}
}