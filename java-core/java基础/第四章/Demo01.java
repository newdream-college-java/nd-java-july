/*
switch 选择结构
需求说明
各菜单级联结构如图：
使用 switch 选择结构实现从登录菜单切换到主菜单功能：
输入数字 1：进入主菜单
输入数字 2：退出并显示“谢谢您的使用”
*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		//主界面
		Scanner input = new Scanner(System.in);
		System.out.println("**************欢迎使用我行我素购物管理系统***********");
		System.out.println("                              1、登录系统");
		System.out.println("                              2、退出");
		//功能界面
		System.out.print("请选择输入数字：");
		int a = input.nextInt();
		if(a == 1){
			System.out.println("**************欢迎使用我行我素购物管理系统***********");
			System.out.println("                         1、客户信息管理");
			System.out.println("                         2、购物结算");
			System.out.println("                         3、真情回馈");
			System.out.println("                         4、注销");
			System.out.print("请选择输入数字：");
			int b = input.nextInt();
			switch(b){
				case 1:
					System.out.println("购物管理系统>客户信息管理");
					System.out.println("1、显示所有客户信息");
					System.out.println("2、添加客户信息");
					System.out.println("3、修改客户信息");
					System.out.println("4、查询客户信息");
					break;
				case 2:
					System.out.println("该功能还未开通，敬请期待！！！");
					break;
				case 3:
					System.out.println("购物管理系统>客户信息管理");
					System.out.println("1、幸运大抽奖");
					System.out.println("2、幸运抽奖");
					System.out.println("3、生日问候");
					break;
				case 4:
					System.out.println("感谢您的使用！！！");
				default :
					System.out.println("输入错误！！！");
			}

		}
		else if(a == 2){
			System.out.println("**************************************");
			System.out.println("谢谢您的使用！！！");
		}
		else{
			System.out.println("*************************************");
			System.out.println("                     输入错误！！！");
		}
	}
}