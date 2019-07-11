/*写一个pay类，实现以下需求，结算时用户支付1500元，打印购物小票计算此次购物获得的会员积分*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("折扣：\t8折");
		System.out.print("消费总金额：\t");
		double a=input.nextDouble();
		System.out.print("实际交费：\t");
		double b=input.nextDouble();
		System.out.println("找钱：\t"+(b-a));
		System.out.println("本次购物所获的积分是：\t"+(int)(a/100*3));
	}
}