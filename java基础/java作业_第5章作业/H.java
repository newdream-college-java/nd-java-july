import java.util.Scanner;
public class H{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("****************************");
		System.out.println("\t1、客户信息管理");
		System.out.println("\t2、购物结算");
		System.out.println("\t3、真情回馈");
		System.out.println("\t4、注销");
		System.out.println("****************************");
		System.out.println("请选择，输入数字：");
		int a = input.nextInt();
		while(a!=2){
		System.out.println("输入错误，请重新输入：");
		a=input.nextInt();
		}
		System.out.println("执行购物结算！");
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println("*************************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*************************************************");
		System.out.print("请输入商品编号：");
		int b =input.nextInt();
		if(b==1){
		System.out.print("请输入购买数量：");
		int c = input.nextInt();
		if(c==2){
		System.out.println("T恤\t￥245.0\t数量:2\t合计￥490.0");
		System.out.print("是否继续（y/n）:");
		String d = input.next();
		System.out.println("\n\n");
		if(d.equals("n")){
		System.out.println("折扣：0.8");
		System.out.println("应付金额：392.0");
		System.out.print("实付金额：");
		double e = input.nextDouble();
		System.out.print("找钱："+(e-392.0));
		}
		}else{
		System.out.println("加载中。。。");
		}
		}
	}
}
		
		
