import java.util.Scanner;
public class pay{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("***************消费单*****************");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t\t￥245\t2\t￥490");
		System.out.println("网球鞋\t\t￥570\t1\t￥570");
		System.out.println("网球拍\t\t￥320\t1\tY320\n\n");
		System.out.println("折扣：\t\t8折");
		System.out.println("消费总金额\t￥1104.0");
		System.out.print("实际缴费\t￥");
		int a=input.nextInt();
		double i=a-1104.0;
		System.out.println();
		System.out.println("找钱\t￥"+i);
		System.out.println("本次购物所获的积分是:33");
		System.out.println("********************我是黄金分割线**********************");
		//8、(挑战题)输入一个小数，然后输出其整数部份和小数部份,格式如下小数 整数部份 小数部份
		System.out.println("第八题：输入一个小数，然后输出其整数部份和小数部份");
		double decimal=input.nextDouble();
		int intDecimal=(int)decimal/1;
		double xdecimal=decimal-intDecimal;
		System.out.println("小数\t整数部分\t小数部分");
		System.out.println(decimal+"\t"+intDecimal+"\t\t"+xdecimal);
	}
}