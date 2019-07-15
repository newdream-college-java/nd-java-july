/*
循环输入商品编号，显示对应的商品价格，输入“n”结束循环

继续循环输入商品编号和购买数量,自动计算每种商品的价钱(单价*购买数量)，并
累加到总金额
当输入 n 时结账，结账时假设享受八折优惠，计算应付金额并找零

进入系统主菜单后，提示用户输入数字，根据选择进入相应模块
用户若输入错误，要求重复输入，直到输入正确，执行相应功能后退出循环
*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("***********欢迎使用购物管理系统************");
		System.out.println("                       1、客户信息管理");
		System.out.println("                       2、购物结算");
		System.out.println("                       3、真情回馈");
		System.out.println("                       4、注销");
		System.out.println("*******************************************");
		System.out.println("");
		System.out.print("请选择，输入数字：");
		int a = sc.nextInt();
		while(a != 1 && a != 2 && a != 3 && a != 4){
			System.out.print("输入有误，请重新输入数字：");
			a = sc.nextInt();
		}
		switch(a){
			case 1:
				System.out.println("购物管理系统 > 客户信息管理");
				System.out.println("系统正在完善中，敬请期待！");
				break;
			case 2:
				System.out.println("购物管理系统 > 购物结算");
				System.out.println("*******************************");
				System.out.println("请选择购买的商品编号：");
				System.out.println("1、T恤"+"\t"+"2、网球鞋"+"\t"+"3、网球拍");
				System.out.println("*******************************");
				System.out.print("请输入商品编号：");
				int b = sc.nextInt();
				System.out.print("请输入购买数量：");
				int c = sc.nextInt();
				System.out.println("T恤￥245.0"+"\t"+"数量"+c+"\t"+"合计￥"+245.0*c);
				System.out.print("是否继续（y/n）");
				String d = sc.next();
				while(d.equals("y")){
					//后续开发
				}
				System.out.println("折扣：8折");
				System.out.println("应付金额："+245.0*c*0.8);
				System.out.print("实付金额：");
				double e = sc.nextDouble();
				double money = e-245.0*c*0.8;
				System.out.println("找钱："+money);
				break;
			case 3:
				System.out.println("购物管理系统 > 客户信息管理");
				System.out.println("系统正在完善中，敬请期待！");
				break;
			default :
				break;
				
				
		}
		

	}
}