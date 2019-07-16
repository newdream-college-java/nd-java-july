/*
2.2、循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败
*/
import java.util.*;
public class Demo10{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n");
		for(int i =1;i<=3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			int a = input.nextInt();
			System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
			String b = input.next();
			System.out.print("请输入会员积分：");
			int c = input.nextInt();
			if(a>9999||a<1000){
				System.out.print("录入失败");
				break;
			}
			System.out.println("您录入的会员信息是：");
			System.out.println(a+"\t"+b+"\t"+c);
		}
		System.out.print("程序结束！");
	}
}