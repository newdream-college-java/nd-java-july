/*	switch 选择结构
	需求说明
	各菜单级联结构如图：
	使用 switch 选择结构实现从登录菜单切换到主菜单功能：
	输入数字 1：进入主菜单
	输入数字 2：退出并显示“谢谢您的使用”
	输入其它数字，显示“输入错误 
*/

import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("我行我素购物管理系统");
		System.out.println();
		System.out.println("\t1、登录");
		System.out.println("\t2、退出");
		System.out.println("请输入选项：");
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println("\t主菜单\n\n");	
				System.out.println("\t1、客户信息管理");
				System.out.println("\t2、购物结算");
				System.out.println("\t3、真情回馈");
				System.out.println("\t4、注销");
				int b = sc.nextInt();
				switch(b){
					case 1:
					System.out.println("\t客户信息管理系统\n\n");	
					System.out.println("\t1、显示所有客户信息");
					System.out.println("\t2、添加客户信息");
					System.out.println("\t3、修改客户信息");
					System.out.println("\t4、查询客户信息");
					System.out.println("请输入选项：");
					int c = sc.nextInt();
					switch(c){
						case 1:
							System.out.println("所有客户信息");
						case 2:
							System.out.println("添加");
						case 3:
							System.out.println("不存在该选项");
							break;
						default:
							System.out.println("不存在该选项");
						}
					break;
					case 2:
						System.out.println("\t请输入消费金额：\n");	
						System.out.println("是否参加优惠换购活动：");
						break;	
					case 3:
						System.out.println("\t购物管理系统\n");	
						System.out.println("\t1、幸运大放送");
						System.out.println("\t2、幸运抽奖");
						System.out.println("\t3、生日问候");
						break;
					default:
						System.out.println("不存在该选项");
					}
				break;
			case 2:
				System.out.println("谢谢你的使用！");
				break;
			default:
				System.out.println("不存在该选项");
			}	

	}
}
	

	
