/*使用 switch 选择结构实现从登录菜单切换到主菜单功能： 输入数字 1：进入主菜单 输入数字 2：退出并显示“谢谢您的使用”*/
import java.util.Scanner;
public class Work1{
	public static void main(String[] args){
		Work1 t = new Work1();
		Scanner sc = new Scanner(System.in);
		System.out.println("我行我素购物管理系统");
		System.out.println();
		System.out.println("\t1、登录");
		System.out.println("\t2、退出");
		System.out.println("请输入选项：");
		int a = sc.nextInt();
		switch(a){
			case 1:
				t.menu();
				break;
			case 2:
				System.out.println("谢谢你的使用！");
				break;
			default:
				System.out.println("不存在该选项");
		}	
	}
	public  void menu(){
		System.out.println("\t主菜单");	
		System.out.println();
		System.out.println("\t1、客户信息管理");
		System.out.println("\t2、购物结算");
		System.out.println("\t3、真情回馈");
		System.out.println("\t4、注销");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		switch(b){
			case 1:
				inform();
				break;
			case 2:
				buy();
				break;	
			case 3:
				play();
				break;
			default:
				System.out.println("不存在该选项");
		}
	}

	public void inform(){
		System.out.println("\t客户信息管理系统");	
		System.out.println();
		System.out.println("\t1、显示所有客户信息");
		System.out.println("\t2、添加客户信息");
		System.out.println("\t3、修改客户信息");
		System.out.println("\t4、查询客户信息");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入选项：");
		int b = sc1.nextInt();
		switch(b){
			case 1:
				System.out.println("所有客户信息");
				break;
			case 2:
				System.out.println("添加");
				break;
			case 3:
				play();
				break;
			default:
				System.out.println("不存在该选项");
		}
	}

	public void buy(){
		System.out.println("\t请输入消费金额：");	
		System.out.println();
		System.out.println("是否参加优惠换购活动：");
	}

	public void play(){
		System.out.println("\t购物管理系统");	
		System.out.println();
		System.out.println("\t1、幸运大放送");
		System.out.println("\t2、幸运抽奖");
		System.out.println("\t3、生日问候");
	}
}