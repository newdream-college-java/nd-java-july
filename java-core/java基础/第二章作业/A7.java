import java.util.Scanner;
public class A7 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入顾客支付金额");
		double a = input.nextDouble();
		System.out.println("********消费单********");
		System.out.println("购买物品  单价\t 个数\t  金额");
		System.out.println("T恤\t ￥245\t  2\t￥490");
		System.out.println("网球鞋\t ￥570\t  1\t￥570");
		System.out.println("网球拍\t ￥320\t  1\t￥320\n");
		System.out.println("折扣：\t八折");
		System.out.println("消费总金额  ￥1104.0");
		System.out.println("实际交费    ￥"+a);
		System.out.println("找钱\t    ￥"+(a-1104.0));
		System.out.println("本次购物所获的积分是：33");
	}
}