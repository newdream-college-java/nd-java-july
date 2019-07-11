/*
写一个 Pay 类的，实现以下需求，结算时用户支付 1500 元，打印购物小票
计算此次购物获得的会员积分(每消费 100 元获得 3 分) 
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("您购买了几件T恤：");
		int a = input.nextInt();
		System.out.print("您购买了几个网球鞋：");
		int b = input.nextInt();
		System.out.print("您购买了几双网球拍：");
		int c = input.nextInt();

		System.out.println("***************消费单***************");
		System.out.println("购买物品"+"单价"+"\t"+"个数"+"\t"+"金额");
		System.out.println("T恤"+"\t"+"245"+"\t"+a+"\t"+245*a);
		System.out.println("网球鞋"+"\t"+"570"+"\t"+b+"\t"+570*b);
		System.out.println("网球拍"+"\t"+"320"+"\t"+c+"\t"+320*c);
		int sum;
		sum = 245*a+570*b+320*c;
		sum = sum*8/10;
		System.out.println("                                              ");
		System.out.println("折扣：8折");
		System.out.println("消费总金额￥"+sum);
		System.out.println("实际交费￥ 1500");
		int i = 1500-sum;
		System.out.println("找钱"+i);
		System.out.println("本次购物所获的积分是："+(sum/100)*3);

	}
}