/*1.我行我素购物系统*/
import java.util.*;
public class Demo06{
	public static void main(String [] agrs){
		System.out.println("**********************************");
		System.out.println("\t欢迎使用我行我素购物系统");
		System.out.println("\t1.登录系统");
		System.out.println("\t2.退出");
		System.out.println("请选择：");
		Scanner in=new Scanner(System.in);
		int a= in.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("**********************************");
				System.out.println("\t欢迎使用我行我素购物系统");
				System.out.println("1.客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				System.out.println("4.注销");
				System.out.println("请选择：");
				int b = in.nextInt();
				switch(b)
				{
					case 1:
						System.out.println("**********************************");
						System.out.println("\t欢迎使用我行我素购物系统");
						System.out.println("1.显示所有客户信息");
						System.out.println("2.添加客户信息");
						System.out.println("3.修改客户信息");
						System.out.println("4.查询客户信息");
						break;
					case 2:
						System.out.println("**********************************");
						System.out.println("\t欢迎使用我行我素购物系统");
						System.out.println("1.请选择支付方式");
						break;
					case 3:	
						System.out.println("**********************************");
						System.out.println("\t欢迎使用我行我素购物系统");
						System.out.println("1.幸运大放送");
						System.out.println("2.幸运抽奖");
						System.out.println("3.生日问候");
						break;
					case 4:
						break;
				}
				break;
			case 2:
				System.out.println("谢谢你的使用!");
				break;
			default:
				System.out.println("输入错误!");
				break;
		}
	}

}