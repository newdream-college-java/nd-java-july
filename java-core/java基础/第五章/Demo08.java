/*
循环输入商品编号，显示对应的商品价格，输入“n”结束循环 
继续循环输入商品编号和购买数量,自动计算每种商品的价钱(单价*购买数量)，并
累加到总金额 
当输入 n 时结账，结账时假设享受八折优惠，计算应付金额并找零 
进入系统主菜单后，提示用户输入数字，根据选择进入相应模块 
用户若输入错误，要求重复输入，直到输入正确，执行相应功能后退出循环 
*/
import java.util.*;
public class Demo08{
	public static void main (String[] args){
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("商品名称：\t1.T恤\t\t2.网球鞋\t3.网球拍");	
		System.out.println("单价：\t\t￥245.0\t\t￥280.0\t\t￥220.0");
		System.out.println("***********************************************");	
		Scanner input = new Scanner(System.in);
		double sum=0;
		while(true){
			System.out.print("请输入商品编号：");
			int a = input.nextInt();
			while(a>3||a<1){
				System.out.print("输入错误，请重新输入商品编号：");
				a = input.nextInt();
			}
			System.out.print("请输入购买数量：");
			int b = input.nextInt();
			switch(a){
				case 1:
				System.out.println("T恤\t ￥245.0\t数量\t"+b+"\t合计￥\t"+245.0*b);
				sum=sum+245.0*b;
				break;
				case 2:
				System.out.println("网球鞋\t ￥280.0\t数量\t"+b+"\t合计￥\t"+280.0*b);
				sum=sum+280.0*b;
				break;
				case 3:
				System.out.println("网球拍\t ￥220.0\t数量\t"+b+"\t合计￥\t"+220.0*b);
				sum=sum+220.0*b;
				break;
				default:
				break;
			}
			System.out.print("是否继续（y/n）");
			String st = input.next();
			if(st.equals("n")){
				System.out.println("折扣：\t\t0.8");
				System.out.println("应付金额：\t"+sum*0.8);
				System.out.print("实付金额：\t");
				double c = input.nextDouble();
				System.out.print("找钱：\t"+(c-sum*0.8));
				System.exit(-1);
			}
			else if(st.equals("y")){
				System.out.println("成功加入购物车");
			}
			else{
				System.out.println("输入不合法，请重新输入：");
			}
			
			
		}
		
		
	}	
}