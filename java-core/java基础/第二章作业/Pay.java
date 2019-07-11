/*7、需求说明写一个 Pay 类的，实现以下需求，结算时用户支付 1500 元，打印购物小票计算此次购物获得的会员积分(每消费 100 元获得 3 分)*/
import java.util.Scanner;
public class Pay{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("*******消费单*******");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t\t￥245\t2\t￥490");
		System.out.println("网球鞋\t\t￥570\t1\t￥570");
		System.out.println("网球拍\t\t￥320\t1\t￥320\n");
		double cost=input.nextInt();
		double getback=cost-1104.0;
		int jifen=(int)1104.0/100*3;
		System.out.println("折扣：\t8折");
		System.out.println("消费总金额\t￥1104.0");
		System.out.println("实际交费\t￥"+cost);
		System.out.println("找钱\t￥"+getback);
		System.out.println("本次购物所获积分是:"+jifen);
	}
}