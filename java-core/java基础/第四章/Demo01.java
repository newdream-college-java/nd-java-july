/*【练习 1】 训练要点 switch 选择结构
需求说明
各菜单级联结构如图：
使用 switch 选择结构实现从登录菜单切换到主菜单功能：
输入数字 1：进入主菜单
输入数字 2：退出并显示“谢谢您的使用”
输入其它数字，显示“输入错误
*/
import java.util.*;
public class Demo01{
	public static void main (String [] args){
		System.out.println("欢迎来到好莱坞购物管理系统");
		System.out.println("1、登录系统");
		System.out.println("2、退出");
		System.out.println("请选择！");
		Scanner input =new Scanner(System.in);
		int login = input.nextInt();
		if(login==1){
			System.out.println("菜单");
			System.out.println("1、客户信息管理");
			System.out.println("2、购物结算");
			System.out.println("3、真情回馈");
			System.out.println("4、注销");
			System.out.println("请选择！");
			int list = input.nextInt();
			switch(list){
				case 1:
					System.out.println("客户信息管理系统");
					System.out.println("1、显示所有客户");
					System.out.println("2、添加客户信息");
					System.out.println("3、修改客户信息");
					System.out.println("4、查询客户信息");
					break;
				case 2:
					System.out.println("购物结算");
					System.out.println("1、幸运大放送");
					System.out.println("2、幸运抽奖");
					System.out.println("3、生日问候");
					break;
				case 3:
					System.out.println("真情回馈系统（完善中。。。）");
					break;
				case 4:
					break;
				default:	
					System.out.print("输入错误");
					break;
			}
		}
		else if(login==2){
			System.out.println("欢迎下次光临");
			return;	
		}
		else
		System.out.print("输入错误");
	}
}