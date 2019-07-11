/*7、需求说明 
写一个 Pay 类的，实现以下需求，结算时用户支付 1500 元，打印购物小票 
计算此次购物获得的会员积分(每消费 100 元获得 3 分)  */
import java.util.Scanner;
public class H{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入实际交费：");
		int a = input.nextInt();
		int b = a-1104;
		int c = (1104/100)*3;
		System.out.println("********消费单********");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t\t245\t2\t490");
		System.out.println("网球鞋\t\t570\t1\t570");
		System.out.println("网球拍\t\t320\t1\t320\n\n\n");
		System.out.println("折扣：\t8折");
		System.out.println("消费总金额:\t1104.0");
		System.out.println("实际交费：\t"+a);
		System.out.println("找钱：\t"+b);
		System.out.println("本次购物所获得的积分是："+c);
}
}