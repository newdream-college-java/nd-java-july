/*7、需求说明
写一个 Pay 类的，实现以下需求，结算时用户支付 1500 元，打印购物小票
计算此次购物获得的会员积分(每消费 100 元获得 3 分)*/
import java.util.Scanner;
public class demo07{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入购买T恤的数量:");
		int a1=input.nextInt();
		System.out.println("输入购买网球鞋的数量:");
		int a2=input.nextInt();
		System.out.println("输入购买网球拍的数量:");
		int a3=input.nextInt();
		System.out.println("输入缴费金额:");
		int b=input.nextInt();
		int sum=245*a1+570*a2+320*a3;
		int jifen=sum*4/5/100*3;
		System.out.println("★★★★★★★*消费单*★★★★★★★");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t\t245\t"+a1+"\t"+245*a1);
		System.out.println("网球鞋\t\t570\t"+a2+"\t"+570*a2);
		System.out.println("网球拍\t\t320\t"+a3+"\t"+320*a3);
		System.out.println("");
		System.out.println("");
		System.out.println("折扣："+"\t\t"+"8折");
		System.out.println("消费总金额\t"+sum*0.8);
		System.out.println("实际缴费\t"+b);
		System.out.println("找钱\t\t"+(b-sum*0.8));
		System.out.println("本次所获得的积分是："+jifen);	
	}
}