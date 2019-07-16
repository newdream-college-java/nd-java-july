/*
2.2、循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败
*/
import java.util.Scanner;
public class Demo10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("购物管理系统 > 客户信息管理 > 添加客户信息");
		System.out.println("");
		for(int i = 1;i<=3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			int a = input.nextInt();
			if(a<1000||a>9999){
				System.out.print("您输入的会员号不合法，请重新输入：");
				a = input.nextInt();
			}
			System.out.print("请输入会员生日：（月/日<用两位数表示>）：");
			String birth = input.next();
			System.out.print("请输入会员积分：");
			int b = input.nextInt();
			System.out.println("您录入的会员信息是：");
			System.out.println("会员号"+"\t"+"生日"+"\t"+"会员积分");
			System.out.println(a+"\t"+birth+"\t"+b);
			System.out.println("");
		}	
		System.out.println("程序结束！！！");
	}
}