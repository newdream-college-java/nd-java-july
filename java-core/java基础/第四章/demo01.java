/*我行我素购物管理系统*/
import java.util.Scanner;
public class demo01{
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		System.out.println("*-----------我行我素购物管理系统-----------*");
		System.out.println("*----------------登陆菜单：----------------*");
		System.out.println("*********************************************");
		System.out.println("\t\t1、登陆系统");
		System.out.println("\t\t2、退出");
		System.out.println("请输入（1-2）");
		System.out.println("*********************************************");
		int a1=input.nextInt();
		System.out.println("");
		if(a1==1){
			System.out.println("*********************************************");
			System.out.println("*-----------------主菜单：-----------------*");
			System.out.println("*********************************************");
			System.out.println("\t\t1、客户信息管理");
			System.out.println("\t\t2、购物结算");
			System.out.println("\t\t3、真情回馈");
			System.out.println("\t\t4、注销");
			System.out.println("请输入（1-4）");
			System.out.println("*********************************************");
			int a2=input.nextInt();
			System.out.println("");
			switch(a2)
			{
				case 1:{
					System.out.println("*********************************************");
					System.out.println("*-------购物管理系统（客户信息管理）-------*");
					System.out.println("*********************************************");
					System.out.println("\t\t1、显示所有客户信息");
					System.out.println("\t\t2、添加客户信息");
					System.out.println("\t\t3、修改客户信息");
					System.out.println("\t\t4、查询客户信息");
					System.out.println("请输入（1-4）");
					System.out.println("*********************************************");
					System.out.println("");	
					break;
				}
				case 3:{
					System.out.println("*********************************************");
					System.out.println("*---------购物管理系统（真情回馈）---------*");
					System.out.println("*********************************************");
					System.out.println("\t\t1、幸运大放送");
					System.out.println("\t\t2、幸运抽奖");
					System.out.println("\t\t3、生日问候");
					System.out.println("请输入（1-3）");
					System.out.println("*********************************************");
					System.out.println("");
					break;
				}default:{
					System.out.println("*********************************************");
					System.out.println("程序退出");
				}
			}
		}else{
			System.out.println("*********************************************");
			System.out.println("程序退出");
		}
	}
}