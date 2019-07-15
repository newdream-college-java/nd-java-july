/*MyShopping管理系统*/
import java.util.*;
public class Demo08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a,num,e=0;
		String name=null;
		double price=0,mon,sum=0;
		String b;
		while(MyShopping(e)==2){
			System.out.println("MyShoping管理系统 > 购物结算");
			do{
				System.out.println("*********************************************************");
				System.out.println("请选择购买的商品编号：");
				System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
				System.out.println("*********************************************************");
				System.out.print("请输入商品编号：");
				a=input.nextInt();
				System.out.print("请输入购买数量：");
				num=input.nextInt();
				switch(a){
					case 1:
					name="T恤";
					price=245.0;
					break;
					case 2:
					name="网球鞋";
					break;
					case 3:
					name="网球拍";
					break;
					default:
					System.out.println("请输入正确的数字");
					break;	
				}
				sum=price*num;
				System.out.println(name+"￥"+price+"\t数量："+num+"\t合计："+sum);
				System.out.print("是否继续（y/n）：");
				b=input.next();
			}while(b.equals("y"));
			System.out.println("折扣：0.8");
			System.out.println("应付金额："+(0.8*sum));
			System.out.print("实付金额：");
			mon=input.nextDouble();
			System.out.println("找钱："+(mon-0.8*sum));
			}
		}
	static int MyShopping(int n){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用MyShoping管理系统");
		System.out.println("*********************************************************");
		System.out.println("1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销");
		System.out.println("*********************************************************");
		System.out.println("请选择，输入数字：");
		n=input.nextInt();
		while(n<1&&n>4){
			System.out.println("输入错误，请重新输入数字：");
			n=input.nextInt();
		}
		return n;
	}
}