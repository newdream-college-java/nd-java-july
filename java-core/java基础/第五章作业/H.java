/*购物系统*/
import java.util.*;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用MyShopping购物管理系统\n");
		System.out.println("****************************************");
		System.out.println("1.客户信息管理");
		System.out.println("2.购物结算");
		System.out.println("3.真情回馈");
		System.out.println("4.注销");
		System.out.println("****************************************\n");
		System.out.print("请选择输入数字：");
		int a=input.nextInt();
		while(a<=0||a>4){
			System.out.print("输入错误，请重新输入：");
			a=input.nextInt();
		}
		switch(a){
			case 1:
				System.out.println("功能暂未开通!");
				break;
			case 2:
				System.out.println("**********************************");
				System.out.println("\t欢迎使用我行我素购物系统");
				System.out.println("MyShopping管理系统>购物结算");
				System.out.println("请输入购买的商品编号：");
				System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
				System.out.println("**********************************");
				double m1=0,m2=0,m3=0;
				String s="n";
				do{
					System.out.print("请输入商品编号：(1-3)");
					int c=input.nextInt();
					System.out.print("请输入购买数量：");
					int d=input.nextInt();
					switch(c){
						case 1:
							m1=245.0*d;
							System.out.println("1.T恤\t￥245.0\t数量"+d+"\t"+"合计￥"+m1);
							break;
						case 2:
							m2=234.0*d;
							System.out.println("2.网球鞋\t￥234.0\t数量"+d+"\t"+"合计￥"+m2);
							break;
						case 3:
							m3=165.0*d;
							System.out.println("3.网球拍\t￥165.0\t数量"+d+"\t"+"合计￥"+m3);
							break;
						default:
							System.out.println("输入错误!");
							System.exit(-1);								
					}
					System.out.println("是否继续：（y/n）");
					s=input.next();
				}while(s.equals("y"));
				System.out.println("折扣:0.8!");
				System.out.println("应付金额："+0.8*(m1+m2+m3));
				System.out.print("实付金额：");
				double fk=input.nextDouble();
				System.out.println("找零："+(fk-0.8*(m1+m2+m3)));
				break;
			case 3:
				System.out.println("功能暂未开通!");
				break;
			case 4:
				System.out.println("已注销成功!");
				System.exit(-1);
		}
	}
}