/*1、循环输入商品编号，显示对应的商品价格，输入“n”结束循环
2、继续循环输入商品编号和购买数量,自动计算每种商品的价钱(单价*购买数量)，并
累加到总金额
当输入 n 时结账，结账时假设享受八折优惠，计算应付金额并找零
3、进入系统主菜单后，提示用户输入数字，根据选择进入相应模块
用户若输入错误，要求重复输入，直到输入正确，执行相应功能后退出循环*/
import java.util.Scanner;
public class Demo08{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		String pd="y";
		int sb;
		int sr;
		int sum=0;
		//界面1
		System.out.println("");
		System.out.println("");
		System.out.println("****************************界面1*************************");
		System.out.println("MyShopping管理系统 > 购物结算");
		System.out.println("");
		System.out.println("");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤    2.网球鞋   3.网球拍");
		System.out.println("***********************************************************");
		System.out.println("");
		while(pd.equals("y")){
			System.out.print("请输入商品编号：");
			sb=input.nextInt();	
			switch(sb){
				case 1:
					System.out.println("T恤        ￥245.0");
					break;
				case 2:
					System.out.println("网球鞋    ￥570.0");
					break;
				case 3:
					System.out.println("网球拍    ￥320.0");
					break;
				default:
						System.out.println("输入错误请重新输入");

			}
			System.out.println("");
			System.out.println("");
			System.out.print("是否继续(y/n)");
			pd=input.next();
		}
		System.out.println("程序结束！");


		//界面2
		pd="y";
		System.out.println("");
		System.out.println("");
		System.out.println("****************************界面2*************************");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤    2.网球鞋   3.网球拍");
		System.out.println("***********************************************************");
		System.out.println("");
		while(pd.equals("y")){
			System.out.print("请输入商品编号：");
			sb=input.nextInt();
			System.out.print("请输入购买数量：");
			int sl=input.nextInt();	
			switch(sb){
				case 1:
					System.out.println("T恤  ￥245.0          数量"+sl+"          合计￥"+245.0*sl);
					sum+=245.0*sl;
					break;
				case 2:
					System.out.println("网球鞋  ￥570.0          数量"+sl+"          合计￥"+570.0*sl);
					sum+=245.0*sl;
					break;
				case 3:
					System.out.println("网球拍  ￥320.0          数量"+sl+"          合计￥"+320.0*sl);
					sum+=245.0*sl;
					break;
				default:
						System.out.println("输入错误请重新输入：");
					break;
				}
			System.out.println("");
			System.out.println("");
			System.out.print("是否继续(y/n)");
			pd=input.next();
		}
		System.out.println("请输入实付金额：");
		int sf=input.nextInt();
		System.out.println("");
		System.out.println("");
		System.out.println("折扣：0.8");
		System.out.println("应付金额："+0.8*sum);
		System.out.println("实付金额："+sf);
		System.out.println("找钱："+(sf-0.8*sum));
		


		//界面3
		System.out.println("");
		System.out.println("");
		System.out.println("****************************界面3*************************");
		System.out.println("欢迎使用MyShopping管理系统 ");
		System.out.println("");
		System.out.println("");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("1、客户信息管理");
		System.out.println("2、购物结算");
		System.out.println("3、真情回馈");
		System.out.println("4、注销");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.print("请选择，输入数字：");
		sr=input.nextInt();
		switch(sr){
			case 1:
				System.out.println("执行客户信息管理");
				break;
			case 2:
				System.out.println("执行购物结算");
				break;
			case 3:
				System.out.println("执行真情回馈");
				break;
			case 4:
				System.out.println("程序退出");
				break;
			default:
				while(sr>4||sr<1){
					System.out.println("输入错误，重新输入");
					sr=input.nextInt();
				}
				break;
			}
		
	}	
}