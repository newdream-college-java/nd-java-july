/*7、需求说明
写一个 Pay 类的，实现以下需求，结算时用户支付 1500 元，打印购物小票
计算此次购物获得的会员积分(每消费 100 元获得 3 分)*/

public class Demo07{
	public static void main(String[] args){
		System.out.println("*************消费单*************");
		double n=1500,a=245,b=570,c=320,s,z,x;
		s=(2*a+b+c)*0.8;
		z=n-s;
		x=(int)s/100*3;
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t￥245\t2\t￥490");
		System.out.println("网球鞋\t￥570\t1\t￥570");
		System.out.println("网球拍\t￥320\t1\t￥320");			
		System.out.println();
		System.out.println();
		System.out.println("折扣：\t8折");
		System.out.println("消费总金额\t￥"+s);
		System.out.println("实际交费\t￥"+n);
		System.out.println("找钱\t￥"+z);
		System.out.println("本次购物所获的积分是："+x);	
	}
}