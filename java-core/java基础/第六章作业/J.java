/*2.2、循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败*/
import java.util.*;
public class J{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n");
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号(4位整数)：");
			int a=input.nextInt();
			if(a<1000||a>9999){
				System.out.print("录入失败！请重新录入：");
				a=input.nextInt();
			}else{
				System.out.print("请输入会员生日（月/日<两位整数表示>）：");
				String s=input.next();
				System.out.print("请输入会员积分：");
				int b=input.nextInt();
				System.out.println("您录入的信息是：");
				System.out.println(a+"\t"+s+"\t"+b);
			}
		}
		System.out.print("程序结束！");
	}
}