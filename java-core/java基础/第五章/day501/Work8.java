/*继续循环输入商品编号和购买数量,自动计算每种商品的价钱(单价*购买数量)，并
累加到总金额
当输入 n 时结账，结账时假设享受八折优惠，计算应付金额并找零*/
import java.util.Scanner;
public class Work8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Work8 ms = new Work8();
		System.out.println("欢迎使用MyShopping管理系统");
		System.out.println("*******************************************************************");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.购物结算");
		System.out.println("\t\t3.真情回馈");
		System.out.println("\t\t4.注销");
		System.out.println("*******************************************************************");
		System.out.println();
		System.out.print("请选择，输入数字：");
		int a = sc.nextInt();
		while(a>4 || a<1){
			System.out.println("输入错误，请重新选择");
			System.out.print("请选择，输入数字：");
			a = sc.nextInt();
		}
		switch(a){
			case 1:
				System.out.println("欢迎来到客户信息管理界面");
				break;
			case 2:
				ms.MyShopping();
				break;
			case 3:
				System.out.println("欢迎来到真情回馈界面");
				break;
			case 4:
				System.out.println("欢迎来到客户信息管理界面");
				break;
			default:
				break;
			}
	}


	public void MyShopping(){
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.println("请选择购买的商品编号：");
		System.out.println();
		System.out.println("1.T恤\t\t2.网球鞋\t3.网球拍");
		System.out.println("*******************************************************************");
		System.out.println();
		while(true){
			System.out.print("请输入商品编号：");
			int a = sc.nextInt();
			System.out.print("请输入购买数量：");
			int b = sc.nextInt();
			switch(a){
				case 1:
					sum = sum+245.0*b;
					System.out.println("T恤￥245.0\t\t数量"+b+"\t\t合计￥"+sum);
					break;
				case 2:
					sum = sum+300.0*b;
					System.out.println("T恤￥300.0\t\t数量"+b+"\t\t合计￥"+sum);
					break;
				case 3:
					sum = sum+400.0*b;
					System.out.println("T恤￥400.0\t\t数量"+b+"\t\t合计￥"+sum);
					break;
				default:
					break;
			}
			System.out.print("是否继续（y/n）");
			System.out.println();
			char c = sc.next().charAt(0);
			if(c=='n'){
				break;
			}

		}
		System.out.println("折扣：0.8");
		System.out.println("应付金额："+(sum*0.8));
		System.out.println("实付金额：2000");
		System.out.println("找钱："+(2000-sum*0.8));	
	}
}