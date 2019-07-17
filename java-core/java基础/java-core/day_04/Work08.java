
/*1.我行我素购物系统,循环输入商品编号，显示对应的商品价格，输入“n”结束循环*/
import java.util.*;
public class Work08{
	public static void main(String [] agrs){
		System.out.println("**********************************");
		System.out.println("\t欢迎使用我行我素购物系统");
		System.out.println("\t1.登录系统");
		System.out.println("\t2.退出");
		System.out.print("请选择：");
		Scanner in=new Scanner(System.in);
		int a= in.nextInt();
		while(true){
		switch(a)
		{
			case 1:
				System.out.println("**********************************");
				System.out.println("\t欢迎使用我行我素购物系统");
				System.out.println("1.客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				System.out.println("4.注销");
				System.out.print("请选择：(1-4)");
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
						System.out.println("MyShopping管理系统>购物结算");
						System.out.println("请输入购买的商品编号：");
						System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
						System.out.println("**********************************");
						double m=0,n=0,o=0;
						String s="n";
						do{
							System.out.print("请输入商品编号：(1-3)");
							int c=in.nextInt();
							System.out.print("请输入购买数量：");
							int d=in.nextInt();
							switch(c){
								case 1:
									m=245.0*d;
									System.out.println("1.T恤\t￥245.0\t数量"+d+"\t"+"合计￥"+m);
									break;
								case 2:
									n=590.0*d;
									System.out.println("2.网球鞋\t￥590.0\t数量"+d+"\t"+"合计￥"+n);
									break;
								case 3:
									o=200.0*d;
									System.out.println("3.网球拍\t￥200.0\t数量"+d+"\t"+"合计￥"+o);
									break;
								default:
									System.out.println("输入错误，请重启系统!");
									System.exit(-1);
								
							}
							System.out.println("是否继续：（y/n）");
							s=in.next();
						}while(s.equals("y"));
						System.out.println("折扣:0.8!");
						System.out.println("应付金额："+0.8*(m+n+o));
						System.out.print("实付金额：");
						double p=in.nextDouble();
						System.out.println("找零："+(p-0.8*(m+n+o)));
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
					default :
						System.out.println("输入错误，请重启系统!");
						System.exit(-1);
				}
				break;
			case 2:
				System.out.println("谢谢你的使用!");
				System.exit(-1);
				break;
			default:
				System.out.println("输入错误!请重新输入");
				a= in.nextInt();
			
		}
		}
	}

}